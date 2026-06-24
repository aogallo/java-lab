package com.tutoria.sistemaacademico.view;

import com.tutoria.sistemaacademico.controller.AcademicController;
import com.tutoria.sistemaacademico.controller.StudentController;
import com.tutoria.sistemaacademico.model.Course;
import com.tutoria.sistemaacademico.model.Enrollment;
import com.tutoria.sistemaacademico.model.Grade;
import com.tutoria.sistemaacademico.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleMenuView {
    private final StudentController studentController;
    private final AcademicController academicController;
    private final Scanner scanner;

    public ConsoleMenuView(StudentController studentController, AcademicController academicController) {
        this.studentController = studentController;
        this.academicController = academicController;
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
        System.out.println("6. Crear curso");
        System.out.println("7. Listar cursos");
        System.out.println("8. Inscribir estudiante en curso");
        System.out.println("9. Registrar nota");
        System.out.println("10. Consultar reporte basico");
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
                    createCourse();
                    break;
                case 7:
                    listCourses();
                    break;
                case 8:
                    enrollStudent();
                    break;
                case 9:
                    registerGrade();
                    break;
                case 10:
                    showBasicReport();
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

    private void createCourse() {
        System.out.println("\nCrear curso");
        String name = readText("Nombre del curso: ");
        String description = readText("Descripcion: ");

        Course course = academicController.createCourse(name, description);
        System.out.println("Curso creado: " + course.showInfo());
    }

    private void listCourses() {
        System.out.println("\nListado de cursos");
        List<Course> courses = academicController.listCourses();

        if (courses.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course.showInfo());
        }
    }

    private void enrollStudent() {
        System.out.println("\nInscribir estudiante en curso");
        int studentId = readInt("ID del estudiante: ");
        int courseId = readInt("ID del curso: ");

        Enrollment enrollment = academicController.enrollStudent(studentId, courseId);
        System.out.println("Inscripcion creada con ID " + enrollment.getId() + ".");
    }

    private void registerGrade() {
        System.out.println("\nRegistrar nota");
        int enrollmentId = readInt("ID de la inscripcion: ");
        double score = readDouble("Nota de 0 a 20: ");
        String description = readText("Descripcion: ");

        Grade grade = academicController.registerGrade(enrollmentId, score, description);
        System.out.println("Nota registrada con ID " + grade.getId() + ".");
    }

    private void showBasicReport() {
        System.out.println("\nReporte basico");
        List<String> reportLines = academicController.buildBasicReport();

        for (String reportLine : reportLines) {
            System.out.println(reportLine);
        }
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

    private double readDouble(String label) {
        while (true) {
            System.out.print(label);
            String value = scanner.nextLine();

            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException exception) {
                System.out.println("Debes escribir un numero decimal.");
            }
        }
    }
}
