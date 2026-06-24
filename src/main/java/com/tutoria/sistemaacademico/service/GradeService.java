package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Grade;
import com.tutoria.sistemaacademico.repository.EnrollmentRepository;
import com.tutoria.sistemaacademico.repository.GradeRepository;

import java.util.List;

public class GradeService {
    private final GradeRepository gradeRepository;
    private final EnrollmentRepository enrollmentRepository;

    public GradeService(GradeRepository gradeRepository, EnrollmentRepository enrollmentRepository) {
        this.gradeRepository = gradeRepository;
        this.enrollmentRepository = enrollmentRepository;
    }

    public Grade registerGrade(int enrollmentId, double score, String description) {
        if (enrollmentId <= 0) {
            throw new IllegalArgumentException("El ID de la inscripcion debe ser mayor que cero.");
        }

        if (score < 0 || score > 20) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 20.");
        }

        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripcion de la nota es obligatoria.");
        }

        if (enrollmentRepository.findById(enrollmentId).isEmpty()) {
            throw new IllegalArgumentException("No existe una inscripcion con ID " + enrollmentId + ".");
        }

        Grade grade = new Grade(0, enrollmentId, score, description.trim());
        return gradeRepository.save(grade);
    }

    public List<Grade> listGrades() {
        return gradeRepository.findAll();
    }
}
