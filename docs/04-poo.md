# 04 - Programacion orientada a objetos

## Objetivo

Aprender clases, objetos, atributos, constructores, metodos y encapsulamiento usando `Student`.

## Definiciones

- **Clase**: molde para crear objetos.
- **Objeto**: instancia concreta creada a partir de una clase.
- **Atributo**: dato que pertenece a un objeto.
- **Constructor**: metodo especial que crea un objeto con valores iniciales.
- **Getter**: metodo para leer un atributo privado.
- **Setter**: metodo para modificar un atributo privado.
- **Encapsulamiento**: proteger atributos y acceder a ellos mediante metodos.

## Teoria breve

No usamos Lombok porque el alumno necesita escribir y entender constructores, getters y setters. Si una herramienta los genera por detras, el alumno pierde la practica fundamental.

## Ejemplo guiado

La clase `Student` representa un estudiante:

```java
Student student = new Student(1, "Ana", "Lopez", "ana@example.com");
System.out.println(student.showInfo());
```

## Practica del alumno

Agregar un atributo `phone` a `Student` con su getter, setter y actualizacion en `showInfo`.

## Revision

- El alumno puede diferenciar clase y objeto.
- El alumno puede explicar por que los atributos son `private`.
- El alumno puede escribir un getter y un setter sin generadores.

## Reto para casa

Crear una clase `Teacher` de practica con atributos, constructor, getters, setters y `showInfo`.
