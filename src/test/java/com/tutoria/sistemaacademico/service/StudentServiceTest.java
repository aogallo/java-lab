package com.tutoria.sistemaacademico.service;

import com.tutoria.sistemaacademico.model.Student;
import com.tutoria.sistemaacademico.repository.InMemoryStudentRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentServiceTest {
    @Test
    void createsAndListsStudents() {
        StudentService studentService = new StudentService(new InMemoryStudentRepository());

        studentService.createStudent("Ana", "Lopez", "ana@example.com");
        List<Student> students = studentService.listStudents();

        assertEquals(1, students.size());
        assertEquals("Ana Lopez", students.get(0).getFullName());
    }

    @Test
    void updatesStudent() {
        StudentService studentService = new StudentService(new InMemoryStudentRepository());
        Student student = studentService.createStudent("Ana", "Lopez", "ana@example.com");

        boolean updated = studentService.updateStudent(student.getId(), "Ana", "Garcia", "ana.garcia@example.com");

        assertTrue(updated);
        assertEquals("Ana Garcia", studentService.findStudentById(student.getId()).get().getFullName());
    }

    @Test
    void deletesStudent() {
        StudentService studentService = new StudentService(new InMemoryStudentRepository());
        Student student = studentService.createStudent("Ana", "Lopez", "ana@example.com");

        boolean deleted = studentService.deleteStudent(student.getId());

        assertTrue(deleted);
        assertFalse(studentService.findStudentById(student.getId()).isPresent());
    }
}
