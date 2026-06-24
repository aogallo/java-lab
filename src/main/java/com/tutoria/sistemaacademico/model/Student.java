package com.tutoria.sistemaacademico.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Student(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        // TODO: Explain string concatenation before asking the student to modify this method.
        return firstName + " " + lastName;
    }

    public String showInfo() {
        // TODO: Ask the student to format this output after explaining methods and return values.
        return "ID: " + id + " | Nombre: " + getFullName() + " | Email: " + email;
    }
}
