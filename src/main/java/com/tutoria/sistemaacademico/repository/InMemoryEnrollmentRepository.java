package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryEnrollmentRepository implements EnrollmentRepository {
    private final List<Enrollment> enrollments;
    private int nextId;

    public InMemoryEnrollmentRepository() {
        this.enrollments = new ArrayList<Enrollment>();
        this.nextId = 1;
    }

    public Enrollment save(Enrollment enrollment) {
        enrollment.setId(nextId);
        nextId++;
        enrollments.add(enrollment);
        return enrollment;
    }

    public List<Enrollment> findAll() {
        return new ArrayList<Enrollment>(enrollments);
    }

    public Optional<Enrollment> findById(int id) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getId() == id) {
                return Optional.of(enrollment);
            }
        }

        return Optional.empty();
    }
}
