package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryStudentRepository implements StudentRepository {
    private final List<Student> students;
    private int nextId;

    public InMemoryStudentRepository() {
        this.students = new ArrayList<Student>();
        this.nextId = 1;
    }

    public Student save(Student student) {
        student.setId(nextId);
        nextId++;
        students.add(student);
        return student;
    }

    public List<Student> findAll() {
        return new ArrayList<Student>(students);
    }

    public Optional<Student> findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }

        return Optional.empty();
    }

    public boolean update(Student updatedStudent) {
        for (int index = 0; index < students.size(); index++) {
            Student currentStudent = students.get(index);
            if (currentStudent.getId() == updatedStudent.getId()) {
                students.set(index, updatedStudent);
                return true;
            }
        }

        return false;
    }

    public boolean deleteById(int id) {
        for (int index = 0; index < students.size(); index++) {
            Student student = students.get(index);
            if (student.getId() == id) {
                students.remove(index);
                return true;
            }
        }

        return false;
    }
}
