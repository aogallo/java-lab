package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Enrollment;
import com.tutoria.sistemaacademico.repository.CourseRepository;
import com.tutoria.sistemaacademico.repository.EnrollmentRepository;
import com.tutoria.sistemaacademico.repository.StudentRepository;

import java.time.LocalDate;
import java.util.List;

public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository, StudentRepository studentRepository, CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Enrollment enrollStudent(int studentId, int courseId) {
        validateId(studentId, "El ID del estudiante debe ser mayor que cero.");
        validateId(courseId, "El ID del curso debe ser mayor que cero.");

        if (studentRepository.findById(studentId).isEmpty()) {
            throw new IllegalArgumentException("No existe un estudiante con ID " + studentId + ".");
        }

        if (courseRepository.findById(courseId).isEmpty()) {
            throw new IllegalArgumentException("No existe un curso con ID " + courseId + ".");
        }

        Enrollment enrollment = new Enrollment(0, studentId, courseId, LocalDate.now());
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> listEnrollments() {
        return enrollmentRepository.findAll();
    }

    private void validateId(int id, String message) {
        if (id <= 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
