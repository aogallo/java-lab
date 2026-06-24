# 03 - Java basico

## Objetivo

Entender variables, tipos de datos, condicionales, ciclos, metodos y entrada por consola.

## Definiciones

- **Variable**: espacio con nombre para guardar un dato.
- **Tipo de dato**: regla que indica que clase de valor puede guardar una variable.
- **Condicional**: estructura que permite decidir segun una condicion.
- **Ciclo**: estructura que repite instrucciones.
- **Metodo**: bloque de codigo con nombre que realiza una tarea.
- **Entrada por consola**: datos que el usuario escribe mientras el programa se ejecuta.

## Teoria breve

Un programa por consola necesita mostrar opciones, leer lo que el usuario escribe y decidir que hacer. Por eso el menu del sistema academico usa variables, condicionales, ciclos y metodos.

## Ejemplo guiado

En `ConsoleMenuView`, el metodo `start` repite el menu hasta que el usuario elige salir.

```java
do {
    printMenu();
    option = readInt("Elige una opcion: ");
    handleOption(option);
} while (option != 0);
```

## Practica del alumno

Agregar una opcion temporal al menu que muestre el mensaje `Estoy aprendiendo Java`.

## Revision

- El alumno puede explicar para que sirve `do while`.
- El alumno puede explicar que hace una variable `option`.
- El alumno puede identificar un metodo en el codigo.

## Reto para casa

Crear un metodo que pida la edad del usuario y muestre si es mayor o menor de edad.
