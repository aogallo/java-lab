package com.tutoria.sistemaacademico.repository;

import com.tutoria.sistemaacademico.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCourseRepository implements CourseRepository {
    private final List<Course> courses;
    private int nextId;

    public InMemoryCourseRepository() {
        this.courses = new ArrayList<Course>();
        this.nextId = 1;
    }

    public Course save(Course course) {
        course.setId(nextId);
        nextId++;
        courses.add(course);
        return course;
    }

    public List<Course> findAll() {
        return new ArrayList<Course>(courses);
    }

    public Optional<Course> findById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return Optional.of(course);
            }
        }

        return Optional.empty();
    }
}
