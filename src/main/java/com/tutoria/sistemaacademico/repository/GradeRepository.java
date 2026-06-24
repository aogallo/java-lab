package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Grade;

import java.util.List;

public interface GradeRepository {
    Grade save(Grade grade);

    List<Grade> findAll();
}
