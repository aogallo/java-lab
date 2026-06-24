# 05 - Arquitectura por capas

## Objetivo

Separar responsabilidades del sistema academico para que el codigo sea mas facil de entender y modificar.

## Definiciones

- **Arquitectura por capas**: forma de organizar codigo separando responsabilidades.
- **Model**: representa los datos principales del dominio.
- **Repository**: guarda y consulta datos.
- **Service**: contiene reglas de negocio.
- **Controller**: coordina acciones entre vista y servicio.
- **View**: maneja entrada y salida del usuario.
- **Dependencia circular**: problema que ocurre cuando dos partes se necesitan mutuamente de forma desordenada.

## Teoria breve

El flujo del proyecto es:

```txt
view -> controller -> service -> repository -> model
```

La vista no debe guardar datos directamente. El modelo no debe conocer la vista, el servicio ni el repositorio.

## Ejemplo guiado

Cuando el usuario crea un estudiante:

1. `ConsoleMenuView` lee los datos.
2. `StudentController` recibe la accion.
3. `StudentService` valida los datos.
4. `StudentRepository` guarda el estudiante.
5. `Student` representa el dato.

## Practica del alumno

Identificar en que paquete esta cada clase usada para crear un estudiante.

## Revision

- El alumno puede explicar el flujo de capas.
- El alumno entiende por que `model` no importa `view`.
- El alumno puede ubicar donde va una regla de negocio.

## Reto para casa

Escribir en un diagrama simple el recorrido de la opcion `Listar estudiantes`.
