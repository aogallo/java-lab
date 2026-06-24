package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Student;
import com.tutoria.sistemaacademico.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String firstName, String lastName, String email) {
        validateText(firstName, "El nombre es obligatorio.");
        validateText(lastName, "El apellido es obligatorio.");
        validateText(email, "El email es obligatorio.");

        Student student = new Student(0, firstName.trim(), lastName.trim(), email.trim());
        return studentRepository.save(student);
    }

    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> findStudentById(int id) {
        validateId(id);
        return studentRepository.findById(id);
    }

    public boolean updateStudent(int id, String firstName, String lastName, String email) {
        validateId(id);
        validateText(firstName, "El nombre es obligatorio.");
        validateText(lastName, "El apellido es obligatorio.");
        validateText(email, "El email es obligatorio.");

        Student student = new Student(id, firstName.trim(), lastName.trim(), email.trim());
        return studentRepository.update(student);
    }

    public boolean deleteStudent(int id) {
        validateId(id);
        return studentRepository.deleteById(id);
    }

    private void validateText(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    private void validateId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que cero.");
        }
    }
}
