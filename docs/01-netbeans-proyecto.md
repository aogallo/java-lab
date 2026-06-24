# 01 - Crear el proyecto en NetBeans

## Objetivo

Aprender a crear, abrir y ejecutar un proyecto Maven en Apache NetBeans desde cero.

## Definiciones

- **Proyecto**: carpeta organizada con codigo, configuracion y recursos.
- **Proyecto Maven**: proyecto Java que usa `pom.xml` para definir nombre, version, dependencias y forma de compilar.
- **`pom.xml`**: archivo central de Maven. NetBeans lo usa para entender el proyecto.
- **Package**: carpeta logica en Java para organizar clases. En este proyecto usamos `com.tutoria.sistemaacademico`.
- **Clase principal**: clase con el metodo `main`, que es el punto donde empieza el programa.

## Teoria breve

NetBeans ayuda a crear y ejecutar el proyecto, pero no reemplaza entender la estructura. Cada accion del IDE modifica o usa archivos reales del repositorio.

## Ejemplo guiado

Crear un proyecto nuevo:

1. Abrir NetBeans.
2. Seleccionar `File > New Project`.
3. Elegir `Java with Maven > Java Application`.
4. Escribir el nombre `sistema-academico`.
5. Elegir una carpeta de trabajo.
6. Finalizar.

Abrir este proyecto existente:

1. Seleccionar `File > Open Project`.
2. Elegir la carpeta donde esta este repositorio.
3. Confirmar que NetBeans detecta `pom.xml`.
4. Abrir `Source Packages`.
5. Buscar `com.tutoria.sistemaacademico`.
6. Abrir `Main.java`.
7. Ejecutar el proyecto.

## Que cambia en el repositorio

- `pom.xml`: define el proyecto Maven.
- `src/main/java`: contiene el codigo principal.
- `src/test/java`: contiene pruebas.
- `Main.java`: inicia el sistema por consola.

## Practica del alumno

Abrir el proyecto en NetBeans, ubicar `pom.xml`, abrir `Main.java` y ejecutar el menu por consola.

## Revision

- El alumno puede explicar que es `pom.xml`.
- El alumno puede encontrar `Main.java`.
- El alumno puede ejecutar el programa desde NetBeans.

## Reto para casa

Crear una clase nueva llamada `Practice` en el mismo package y escribir un metodo `main` que imprima su nombre.
