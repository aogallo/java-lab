package com.tutoria.sistemaacademico.model;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;

    public Teacher(int id, String firstName, String lastName, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String showInfo() {
        return "ID: " + id + " | Profesor: " + firstName + " " + lastName + " | Especialidad: " + specialty;
    }
}
