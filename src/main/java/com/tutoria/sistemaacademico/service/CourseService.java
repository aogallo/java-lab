package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Course;
import com.tutoria.sistemaacademico.repository.CourseRepository;

import java.util.List;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(String name, String description) {
        validateText(name, "El nombre del curso es obligatorio.");
        validateText(description, "La descripcion del curso es obligatoria.");

        Course course = new Course(0, name.trim(), description.trim());
        return courseRepository.save(course);
    }

    public List<Course> listCourses() {
        return courseRepository.findAll();
    }

    private void validateText(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }
}
