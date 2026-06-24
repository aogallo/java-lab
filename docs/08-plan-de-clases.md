# 08 - Plan de clases y casos practicos

## Objetivo

Usar un solo caso practico durante toda la tutoria: construir paso a paso un sistema academico por consola.

## Definiciones

- **Caso practico**: problema concreto que se usa para aplicar la teoria.
- **Entrega de clase**: resultado pequeño que debe funcionar al final de una sesion.
- **Reto para casa**: ejercicio que el alumno intenta solo antes de la siguiente revision.
- **Checkpoint**: punto estable del proyecto que se puede ejecutar, revisar y comparar.

## Regla del curso

Cada clase debe estar amarrada al sistema academico. No se enseñan conceptos aislados sin conectarlos con el proyecto.

## Mapa progresivo

| Clase | Conceptos | Caso practico | Archivos que crea o modifica el alumno |
| --- | --- | --- | --- |
| 01 | NetBeans, proyecto Maven, `main` | Crear y ejecutar el proyecto por primera vez | `Main.java`, `pom.xml` |
| 02 | Git basico | Guardar el primer avance del proyecto | repositorio Git del alumno |
| 03 | Variables, condicionales, ciclos, metodos | Crear un menu por consola | `Main.java` |
| 04 | Clases, objetos, atributos, constructores | Crear la clase `Student` | `model/Student.java` |
| 05 | Encapsulamiento, getters, setters | Proteger datos del estudiante | `model/Student.java` |
| 06 | Herencia, reutilizacion, `extends` | Crear `Person` y hacer que `Student` y `Teacher` hereden atributos comunes | `model/Person.java`, `model/Student.java`, `model/Teacher.java` |
| 07 | Listas, busqueda, eliminacion | Guardar estudiantes en memoria | `repository/InMemoryStudentRepository.java` |
| 08 | Separacion de responsabilidades | Separar `view`, `controller`, `service`, `repository`, `model` | paquetes por capa |
| 09 | SQL, tablas, claves | Crear tablas para estudiantes y cursos | `database/*.sql` |
| 10 | JDBC, conexion, `PreparedStatement` | Conectar Java con MySQL | `config/DatabaseConfig.java`, repositorio JDBC |
| 11 | Integracion final | CRUD completo y reporte basico | sistema completo |

## Caso practico de herencia

En la clase de herencia, el tutor puede partir de una observacion simple: estudiante y profesor tienen datos parecidos.

### Definiciones

- **Herencia**: mecanismo que permite crear una clase nueva a partir de otra clase existente.
- **Clase padre**: clase que contiene atributos o metodos comunes. En este caso: `Person`.
- **Clase hija**: clase que hereda de otra y agrega datos propios. En este caso: `Student` y `Teacher`.
- **`extends`**: palabra clave de Java para indicar herencia.

### Ejemplo del sistema academico

`Student` y `Teacher` pueden compartir:

- `id`
- `firstName`
- `lastName`
- `email`

`Student` puede agregar:

- `studentCode`

`Teacher` puede agregar:

- `specialty`

### Practica del alumno

1. Crear `Person` con atributos comunes.
2. Crear constructor, getters y setters en `Person`.
3. Modificar `Student` para heredar de `Person`.
4. Crear `Teacher` heredando de `Person`.
5. Probar ambos objetos desde `Main.java`.

### Pregunta de revision

Si `Student` y `Teacher` tienen nombre, apellido y email, ¿por que repetir esos atributos en dos clases si pueden vivir en `Person`?

## Formato de cada clase

1. Definicion de conceptos.
2. Teoria breve conectada al sistema academico.
3. Ejemplo guiado por el tutor.
4. Practica del alumno en su propio repo.
5. Revision del codigo.
6. Reto para casa.

## Como debe trabajar el alumno

El alumno debe partir de la rama `starter`, pero trabajar en su propio repositorio o fork. El repo del tutor conserva `solution` como referencia para comparar despues de que el alumno lo intente.

## Qué NO debe pasar

- No copiar la solucion completa antes de intentar el ejercicio.
- No usar Lombok para ocultar getters, setters o constructores.
- No usar ORM ni migraciones para ocultar SQL.
- No avanzar a JDBC antes de entender clases, objetos, listas y SQL basico.
