package com.tutoria.sistemaacademico;

import com.tutoria.sistemaacademico.controller.StudentController;
import com.tutoria.sistemaacademico.repository.InMemoryStudentRepository;
import com.tutoria.sistemaacademico.service.StudentService;
import com.tutoria.sistemaacademico.view.ConsoleMenuView;

public class Main {
    public static void main(String[] args) {
        InMemoryStudentRepository studentRepository = new InMemoryStudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        StudentController studentController = new StudentController(studentService);
        ConsoleMenuView consoleMenuView = new ConsoleMenuView(studentController);

        consoleMenuView.start();
    }
}
