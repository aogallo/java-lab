package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository {
    Enrollment save(Enrollment enrollment);

    List<Enrollment> findAll();

    Optional<Enrollment> findById(int id);
}
