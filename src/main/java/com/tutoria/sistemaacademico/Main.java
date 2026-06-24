package com.tutoria.sistemaacademico;

import com.tutoria.sistemaacademico.controller.AcademicController;
import com.tutoria.sistemaacademico.controller.StudentController;
import com.tutoria.sistemaacademico.repository.InMemoryCourseRepository;
import com.tutoria.sistemaacademico.repository.InMemoryEnrollmentRepository;
import com.tutoria.sistemaacademico.repository.InMemoryGradeRepository;
import com.tutoria.sistemaacademico.repository.InMemoryStudentRepository;
import com.tutoria.sistemaacademico.service.CourseService;
import com.tutoria.sistemaacademico.service.EnrollmentService;
import com.tutoria.sistemaacademico.service.GradeService;
import com.tutoria.sistemaacademico.service.ReportService;
import com.tutoria.sistemaacademico.service.StudentService;
import com.tutoria.sistemaacademico.view.ConsoleMenuView;

public class Main {
    public static void main(String[] args) {
        InMemoryStudentRepository studentRepository = new InMemoryStudentRepository();
        InMemoryCourseRepository courseRepository = new InMemoryCourseRepository();
        InMemoryEnrollmentRepository enrollmentRepository = new InMemoryEnrollmentRepository();
        InMemoryGradeRepository gradeRepository = new InMemoryGradeRepository();

        StudentService studentService = new StudentService(studentRepository);
        CourseService courseService = new CourseService(courseRepository);
        EnrollmentService enrollmentService = new EnrollmentService(enrollmentRepository, studentRepository, courseRepository);
        GradeService gradeService = new GradeService(gradeRepository, enrollmentRepository);
        ReportService reportService = new ReportService(studentRepository, courseRepository, enrollmentRepository, gradeRepository);

        StudentController studentController = new StudentController(studentService);
        AcademicController academicController = new AcademicController(courseService, enrollmentService, gradeService, reportService);
        ConsoleMenuView consoleMenuView = new ConsoleMenuView(studentController, academicController);

        consoleMenuView.start();
    }
}
