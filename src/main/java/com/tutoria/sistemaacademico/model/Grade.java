package com.tutoria.sistemaacademico.model;

public class Grade {
    private int id;
    private int enrollmentId;
    private double score;
    private String description;

    public Grade(int id, int enrollmentId, double score, String description) {
        this.id = id;
        this.enrollmentId = enrollmentId;
        this.score = score;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
