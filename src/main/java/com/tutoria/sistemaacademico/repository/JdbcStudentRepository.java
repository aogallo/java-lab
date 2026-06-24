package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.config.DatabaseConfig;
import com.tutoria.sistemaacademico.exception.DataAccessException;
import com.tutoria.sistemaacademico.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcStudentRepository implements StudentRepository {
    private final DatabaseConfig databaseConfig;

    public JdbcStudentRepository(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    public Student save(Student student) {
        String sql = "INSERT INTO students (first_name, last_name, email) VALUES (?, ?, ?)";

        try (Connection connection = databaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getEmail());
            statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    student.setId(generatedKeys.getInt(1));
                }
            }

            return student;
        } catch (SQLException exception) {
            throw new DataAccessException("No se pudo guardar el estudiante.", exception);
        }
    }

    public List<Student> findAll() {
        String sql = "SELECT id, first_name, last_name, email FROM students ORDER BY id";
        List<Student> students = new ArrayList<Student>();

        try (Connection connection = databaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                students.add(mapRowToStudent(resultSet));
            }

            return students;
        } catch (SQLException exception) {
            throw new DataAccessException("No se pudieron listar los estudiantes.", exception);
        }
    }

    public Optional<Student> findById(int id) {
        String sql = "SELECT id, first_name, last_name, email FROM students WHERE id = ?";

        try (Connection connection = databaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return Optional.of(mapRowToStudent(resultSet));
                }
            }

            return Optional.empty();
        } catch (SQLException exception) {
            throw new DataAccessException("No se pudo buscar el estudiante.", exception);
        }
    }

    public boolean update(Student student) {
        String sql = "UPDATE students SET first_name = ?, last_name = ?, email = ? WHERE id = ?";

        try (Connection connection = databaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getEmail());
            statement.setInt(4, student.getId());

            return statement.executeUpdate() > 0;
        } catch (SQLException exception) {
            throw new DataAccessException("No se pudo actualizar el estudiante.", exception);
        }
    }

    public boolean deleteById(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection connection = databaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (SQLException exception) {
            throw new DataAccessException("No se pudo eliminar el estudiante.", exception);
        }
    }

    private Student mapRowToStudent(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("email")
        );
    }
}
