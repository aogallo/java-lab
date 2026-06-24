package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    Course save(Course course);

    List<Course> findAll();

    Optional<Course> findById(int id);
}
