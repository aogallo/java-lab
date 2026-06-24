# PRD - Java POO MySQL Lab

## Nombre del proyecto

`java-lab`

## Proyecto principal

`Sistema Académico Java`

## Objetivo

Crear un repositorio educativo para tutorías de programación con Java, donde el alumno aprenda desde fundamentos básicos hasta programación orientada a objetos, arquitectura por capas, Git básico, SQL, MySQL y conexión Java con base de datos usando JDBC.

El proyecto debe evolucionar clase a clase, evitando ejercicios aislados y construyendo un sistema funcional que el alumno pueda ejecutar, probar y modificar.

## Audiencia

Alumno principiante que actualmente no tiene claros los conceptos básicos de programación, POO ni cómo probar sus programas.

## Problema a resolver

El alumno ha recibido temas de programación y base de datos, pero no parece tener claridad práctica sobre:

- Cómo ejecutar un programa.
- Cómo probar lo que construye.
- Cómo organizar código Java.
- Cómo conectar Java con base de datos.
- Cómo aplicar POO en un caso real.
- Cómo usar Git de forma básica.
- Cómo empezar
- Cómo usar apache netbeans
- Cómo usar mysql-workbench

## Enfoque de enseñanza

La tutoría debe ser práctica, progresiva y no aburrida.

Cada clase debe seguir este formato:

1. Teoría breve.
2. Ejemplo guiado.
3. Práctica del alumno.
4. Revisión.
5. Reto para casa.
6. Si hay alguna herrameinta que instalar proveer la forma de instalacion para sistemas macOS,
   linux y microsoft

La teoría debe aparecer siempre conectada con código real.

## Proyecto evolutivo

El sistema será un sistema académico por consola.

Entidades principales:

- Student
- Teacher
- Course
- Enrollment
- Grade

El sistema debe permitir progresivamente:

- Crear estudiantes.
- Listar estudiantes.
- Buscar estudiantes.
- Actualizar estudiantes.
- Eliminar estudiantes.
- Crear cursos.
- Inscribir estudiantes en cursos.
- Registrar notas.
- Consultar reportes básicos.

## Tecnologías

- Java
- Maven
- MySQL
- MySQL Workbench
- JDBC
- Git
- GitHub
- JUnit en fases posteriores

## Arquitectura

Package base:

`com.tutoria.sistemaacademico`

Capas internas:

- model
- repository
- service
- controller
- view
- exception
- config

Flujo correcto:

`view -> controller -> service -> repository -> model`

Reglas:

- `model` no debe importar `repository`, `service`, `controller` ni `view`.
- `repository` maneja acceso a datos.
- `service` contiene reglas de negocio.
- `controller` coordina acciones del usuario.
- `view` maneja entrada y salida por consola.
- `config` contiene configuración, como conexión a base de datos.
- `exception` contiene errores personalizados.
- Evitar dependencias circulares.

## Fases del proyecto

### Fase 1 - Fundamentos de Java

- Variables.
- Tipos de datos.
- Condicionales.
- Ciclos.
- Métodos.
- Entrada por consola.

Resultado esperado:

Un menú básico por consola.

### Fase 2 - POO básica

- Clases.
- Objetos.
- Atributos.
- Constructores.
- Métodos.
- Encapsulamiento.

Resultado esperado:

Crear objetos `Student` y mostrarlos por consola.

### Fase 3 - Colecciones y repositorio en memoria

- Listas.
- CRUD en memoria.
- Repository con `ArrayList`.

Resultado esperado:

Crear, listar, buscar y eliminar estudiantes en memoria.

### Fase 4 - Arquitectura por capas

- Separar responsabilidades.
- Crear paquetes `model`, `repository`, `service`, `controller`, `view`.

Resultado esperado:

Sistema por consola organizado por capas.

### Fase 5 - Introducción a MySQL

- Crear base de datos.
- Crear tablas.
- Insertar datos.
- Consultar datos.
- Relaciones entre tablas.

Resultado esperado:

Scripts SQL para estudiantes, cursos e inscripciones.

### Fase 6 - JDBC

- Conectar Java con MySQL.
- Ejecutar consultas desde Java.
- Usar `PreparedStatement`.
- Manejar errores de conexión.

Resultado esperado:

Repositorio conectado a MySQL.

### Fase 7 - CRUD completo

- Crear estudiante en MySQL.
- Listar estudiantes desde MySQL.
- Buscar por ID.
- Actualizar estudiante.
- Eliminar estudiante.

Resultado esperado:

CRUD funcional por consola conectado a MySQL.

### Fase 8 - Proyecto final

- Cursos.
- Inscripciones.
- Notas.
- Reportes básicos.

Resultado esperado:

Demo final del sistema académico.

## Cómo se probará

El proyecto se probará de tres formas:

1. Manualmente desde consola.
2. Ejecutando consultas SQL en MySQL Workbench.
3. Con pruebas unitarias simples usando JUnit en fases posteriores.


## Criterios de éxito

El proyecto será exitoso si el alumno puede:

* Explicar qué es una clase y un objeto.
* Crear una clase Java con atributos, constructor y métodos.
* Ejecutar un programa desde el IDE o terminal.
* Usar Git básico: clone, status, add, commit, push.
* Entender el flujo view -> controller -> service -> repository.
* Crear una tabla en MySQL.
* Insertar y consultar datos.
* Conectar Java con MySQL.
* Ejecutar un CRUD básico por consola.
* Presentar una demo funcional del sistema.

## Estructura esperada del repositorio

```txt
java-poo-mysql-lab/
├── README.md
├── docs/
│   ├── PRD.md
│   ├── 00-instalacion.md
│   ├── 01-git-basico.md
│   ├── 02-java-basico.md
│   ├── 03-poo.md
│   ├── 04-arquitectura-capas.md
│   ├── 05-mysql-workbench.md
│   └── 06-jdbc.md
├── database/
│   ├── 01-create-database.sql
│   ├── 02-create-tables.sql
│   ├── 03-insert-data.sql
│   └── 04-queries.sql
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── tutoria/
│   │               └── sistemaacademico/
│   │                   ├── Main.java
│   │                   ├── model/
│   │                   ├── repository/
│   │                   ├── service/
│   │                   ├── controller/
│   │                   ├── view/
│   │                   ├── exception/
│   │                   └── config/
│   └── test/
│       └── java/
└── pom.xml

```


## Estrategia de ramas, versiones y aprendizaje guiado

El repositorio debe manejar una estrategia que permita enseñar de forma progresiva sin entregar al alumno la solución completa desde el inicio.

El objetivo es contar con una versión inicial para práctica del alumno y una versión final o solucionada para revisión del tutor.

### Ramas principales

El repositorio debe incluir las siguientes ramas:

* `main`: rama estable del proyecto, documentación general y punto de referencia principal.
* `starter`: versión inicial del proyecto para que el alumno la descargue y trabaje durante las tutorías.
* `solution`: versión completa del proyecto con la implementación final esperada.

### Ramas por lección

Cuando sea necesario, se podrán crear ramas específicas por tema o clase:

* `lesson/01-java-basic`
* `lesson/02-poo`
* `lesson/03-inheritance`
* `lesson/04-polymorphism`
* `lesson/05-collections`
* `lesson/06-layered-architecture`
* `lesson/07-mysql`
* `lesson/08-jdbc`
* `lesson/09-final-project`

Estas ramas servirán como checkpoints para revisar el avance de cada etapa sin mezclar todos los conceptos al mismo tiempo.

### Tags o checkpoints

Además de las ramas, el proyecto puede usar tags para marcar versiones importantes:

* `v0-starter`
* `v1-java-basic`
* `v2-poo`
* `v3-inheritance`
* `v4-polymorphism`
* `v5-memory-repository`
* `v6-mysql`
* `v7-jdbc`
* `v-final`

Cada tag debe representar un punto estable del proyecto que pueda ejecutarse y probarse.

### Uso durante la tutoría

Cada clase debe partir de una versión controlada del proyecto.

El flujo recomendado será:

1. El alumno inicia desde la rama `starter` o desde el checkpoint correspondiente.
2. El tutor explica el concepto de forma breve.
3. El tutor desarrolla un ejemplo pequeño.
4. El alumno implementa una parte del sistema.
5. El tutor revisa la solución con el alumno.
6. Se compara contra la rama `solution` o contra la rama de la lección.
7. El alumno corrige su implementación.
8. Se deja un reto para casa.

### Principio didáctico

El alumno no debe recibir la solución completa antes de intentar resolver el ejercicio.

La solución completa existe para:

* Guía del tutor.
* Revisión posterior.
* Comparación de buenas prácticas.
* Corrección de errores.
* Explicación de alternativas.

### Reglas para la rama `starter`

La rama `starter` debe contener:

* Estructura base del proyecto.
* Configuración Maven.
* README con instrucciones.
* Paquetes principales creados.
* Clases vacías o parcialmente implementadas.
* Comentarios `TODO` para guiar al alumno.
* Scripts SQL base cuando aplique.
* Instrucciones para ejecutar el proyecto.

La rama `starter` no debe contener:

* Solución completa.
* Lógica de negocio terminada.
* CRUD completo.
* Conexión final a MySQL completamente resuelta en etapas tempranas.
* Código avanzado que el alumno aún no comprende.

### Reglas para la rama `solution`

La rama `solution` debe contener:

* Proyecto completo y funcional.
* Código ordenado por capas.
* Implementaciones correctas.
* Manejo de errores.
* Ejemplos de validaciones.
* Scripts SQL completos.
* Instrucciones para ejecutar y probar.
* Comentarios explicativos donde sean necesarios.

### Ejemplo aplicado a herencia

En la clase de herencia, la rama `starter` puede incluir las clases:

* `Person`
* `Student`
* `Teacher`

Pero con métodos incompletos y comentarios `TODO`.

El alumno deberá implementar:

* Atributos comunes en `Person`.
* Herencia usando `extends`.
* Constructores.
* Métodos sobrescritos cuando aplique.
* Pruebas manuales desde consola.

La rama `solution` deberá contener la implementación completa para revisión posterior.

### Ejemplo aplicado a polimorfismo

En la clase de polimorfismo, la rama `starter` puede incluir una clase base o interfaz como:

* `Reportable`
* `Person`
* `Student`
* `Teacher`

El alumno deberá implementar diferentes comportamientos para un mismo método, por ejemplo:

* `showInfo()`
* `calculateFinalGrade()`
* `generateReport()`

La rama `solution` deberá demostrar cómo distintos objetos pueden responder de forma diferente usando una misma referencia o contrato.

### Resultado esperado

Al finalizar el curso, el alumno debe poder navegar entre versiones del proyecto, entender qué cambió en cada etapa, ejecutar el sistema, modificar código y comparar su solución contra una versión de referencia.

