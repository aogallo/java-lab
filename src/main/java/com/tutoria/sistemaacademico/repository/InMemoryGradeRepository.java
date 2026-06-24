package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Grade;

import java.util.ArrayList;
import java.util.List;

public class InMemoryGradeRepository implements GradeRepository {
    private final List<Grade> grades;
    private int nextId;

    public InMemoryGradeRepository() {
        this.grades = new ArrayList<Grade>();
        this.nextId = 1;
    }

    public Grade save(Grade grade) {
        grade.setId(nextId);
        nextId++;
        grades.add(grade);
        return grade;
    }

    public List<Grade> findAll() {
        return new ArrayList<Grade>(grades);
    }
}
