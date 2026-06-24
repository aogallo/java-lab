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
        // TODO: Assign the next ID, increment it, and add the student to the list.
        return student;
    }

    public List<Student> findAll() {
        // TODO: Return a copy of the students list.
        return new ArrayList<Student>();
    }

    public Optional<Student> findById(int id) {
        // TODO: Loop through the list and return the student with the matching ID.
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }

        return Optional.empty();
    }

    public boolean update(Student updatedStudent) {
        // TODO: Find the student by ID and replace it with updatedStudent.
        for (int index = 0; index < students.size(); index++) {
            Student currentStudent = students.get(index);
            if (currentStudent.getId() == updatedStudent.getId()) {
                return true;
            }
        }

        return false;
    }

    public boolean deleteById(int id) {
        // TODO: Find the student by ID and remove it from the list.
        for (int index = 0; index < students.size(); index++) {
            Student student = students.get(index);
            if (student.getId() == id) {
                return true;
            }
        }

        return false;
    }
}
