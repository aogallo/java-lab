package com.tutoria.sistemaacademico.controller;

import com.tutoria.sistemaacademico.model.Course;
import com.tutoria.sistemaacademico.model.Enrollment;
import com.tutoria.sistemaacademico.model.Grade;
import com.tutoria.sistemaacademico.service.CourseService;
import com.tutoria.sistemaacademico.service.EnrollmentService;
import com.tutoria.sistemaacademico.service.GradeService;
import com.tutoria.sistemaacademico.service.ReportService;

import java.util.List;

public class AcademicController {
    private final CourseService courseService;
    private final EnrollmentService enrollmentService;
    private final GradeService gradeService;
    private final ReportService reportService;

    public AcademicController(CourseService courseService, EnrollmentService enrollmentService, GradeService gradeService, ReportService reportService) {
        this.courseService = courseService;
        this.enrollmentService = enrollmentService;
        this.gradeService = gradeService;
        this.reportService = reportService;
    }

    public Course createCourse(String name, String description) {
        return courseService.createCourse(name, description);
    }

    public List<Course> listCourses() {
        return courseService.listCourses();
    }

    public Enrollment enrollStudent(int studentId, int courseId) {
        return enrollmentService.enrollStudent(studentId, courseId);
    }

    public List<Enrollment> listEnrollments() {
        return enrollmentService.listEnrollments();
    }

    public Grade registerGrade(int enrollmentId, double score, String description) {
        return gradeService.registerGrade(enrollmentId, score, description);
    }

    public List<String> buildBasicReport() {
        return reportService.buildBasicReport();
    }
}
