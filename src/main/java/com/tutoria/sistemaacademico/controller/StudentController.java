package com.tutoria.sistemaacademico.controller;

import com.tutoria.sistemaacademico.model.Student;
import com.tutoria.sistemaacademico.service.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(String firstName, String lastName, String email) {
        return studentService.createStudent(firstName, lastName, email);
    }

    public List<Student> listStudents() {
        return studentService.listStudents();
    }

    public Optional<Student> findStudentById(int id) {
        return studentService.findStudentById(id);
    }

    public boolean updateStudent(int id, String firstName, String lastName, String email) {
        return studentService.updateStudent(id, firstName, lastName, email);
    }

    public boolean deleteStudent(int id) {
        return studentService.deleteStudent(id);
    }
}
