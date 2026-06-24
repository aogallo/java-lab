package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    Student save(Student student);

    List<Student> findAll();

    Optional<Student> findById(int id);

    boolean update(Student student);

    boolean deleteById(int id);
}
