package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Course;
import com.tutoria.sistemaacademico.model.Enrollment;
import com.tutoria.sistemaacademico.model.Grade;
import com.tutoria.sistemaacademico.model.Student;
import com.tutoria.sistemaacademico.repository.CourseRepository;
import com.tutoria.sistemaacademico.repository.EnrollmentRepository;
import com.tutoria.sistemaacademico.repository.GradeRepository;
import com.tutoria.sistemaacademico.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class ReportService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final EnrollmentRepository enrollmentRepository;
    private final GradeRepository gradeRepository;

    public ReportService(StudentRepository studentRepository, CourseRepository courseRepository, EnrollmentRepository enrollmentRepository, GradeRepository gradeRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.enrollmentRepository = enrollmentRepository;
        this.gradeRepository = gradeRepository;
    }

    public List<String> buildBasicReport() {
        List<String> reportLines = new ArrayList<String>();
        reportLines.add("Estudiantes registrados: " + studentRepository.findAll().size());
        reportLines.add("Cursos registrados: " + courseRepository.findAll().size());
        reportLines.add("Inscripciones registradas: " + enrollmentRepository.findAll().size());
        reportLines.add("Notas registradas: " + gradeRepository.findAll().size());

        for (Enrollment enrollment : enrollmentRepository.findAll()) {
            String studentName = studentRepository.findById(enrollment.getStudentId())
                    .map(Student::getFullName)
                    .orElse("Estudiante no encontrado");
            String courseName = courseRepository.findById(enrollment.getCourseId())
                    .map(Course::getName)
                    .orElse("Curso no encontrado");
            reportLines.add("Inscripcion " + enrollment.getId() + ": " + studentName + " -> " + courseName);
        }

        for (Grade grade : gradeRepository.findAll()) {
            reportLines.add("Nota " + grade.getId() + ": inscripcion " + grade.getEnrollmentId() + " = " + grade.getScore() + " (" + grade.getDescription() + ")");
        }

        return reportLines;
    }
}
