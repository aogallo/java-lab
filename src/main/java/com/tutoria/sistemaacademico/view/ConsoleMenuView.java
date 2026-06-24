package com.tutoria.sistemaacademico.view;

import com.tutoria.sistemaacademico.controller.StudentController;
import com.tutoria.sistemaacademico.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleMenuView {
    private final StudentController studentController;
    private final Scanner scanner;

    public ConsoleMenuView(StudentController studentController) {
        this.studentController = studentController;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;

        do {
            printMenu();
            option = readInt("Elige una opcion: ");
            handleOption(option);
        } while (option != 0);
    }

    private void printMenu() {
        System.out.println();
        System.out.println("=== Sistema Academico Java ===");
        System.out.println("1. Crear estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Buscar estudiante por ID");
        System.out.println("4. Actualizar estudiante");
        System.out.println("5. Eliminar estudiante");
        System.out.println("6. Ver proximos retos");
        System.out.println("0. Salir");
    }

    private void handleOption(int option) {
        try {
            switch (option) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    findStudentById();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    showNextChallenges();
                    break;
                case 0:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    private void createStudent() {
        System.out.println("\nCrear estudiante");
        String firstName = readText("Nombre: ");
        String lastName = readText("Apellido: ");
        String email = readText("Email: ");

        Student student = studentController.createStudent(firstName, lastName, email);
        System.out.println("Estudiante creado: " + student.showInfo());
    }

    private void listStudents() {
        System.out.println("\nListado de estudiantes");
        List<Student> students = studentController.listStudents();

        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Student student : students) {
            System.out.println(student.showInfo());
        }
    }

    private void findStudentById() {
        int id = readInt("ID del estudiante: ");
        Optional<Student> student = studentController.findStudentById(id);

        if (student.isPresent()) {
            System.out.println(student.get().showInfo());
        } else {
            System.out.println("No se encontro un estudiante con ID " + id + ".");
        }
    }

    private void updateStudent() {
        int id = readInt("ID del estudiante a actualizar: ");
        String firstName = readText("Nuevo nombre: ");
        String lastName = readText("Nuevo apellido: ");
        String email = readText("Nuevo email: ");

        boolean updated = studentController.updateStudent(id, firstName, lastName, email);
        if (updated) {
            System.out.println("Estudiante actualizado.");
        } else {
            System.out.println("No se encontro un estudiante con ID " + id + ".");
        }
    }

    private void deleteStudent() {
        int id = readInt("ID del estudiante a eliminar: ");
        boolean deleted = studentController.deleteStudent(id);

        if (deleted) {
            System.out.println("Estudiante eliminado.");
        } else {
            System.out.println("No se encontro un estudiante con ID " + id + ".");
        }
    }

    private void showNextChallenges() {
        System.out.println("\nProximos retos del alumno:");
        System.out.println("- Completar el repositorio en memoria");
        System.out.println("- Crear cursos");
        System.out.println("- Inscribir estudiantes");
        System.out.println("- Registrar notas");
        System.out.println("- Conectar con MySQL usando JDBC");
    }

    private String readText(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    private int readInt(String label) {
        while (true) {
            System.out.print(label);
            String value = scanner.nextLine();

            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException exception) {
                System.out.println("Debes escribir un numero entero.");
            }
        }
    }

}
