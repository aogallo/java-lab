# Java POO MySQL Lab

Repositorio educativo para tutorias de programacion con Java. El objetivo es construir, clase a clase, un sistema academico por consola mientras el alumno aprende Java, POO, arquitectura por capas, Git, SQL, MySQL Workbench y JDBC.

## Proyecto

Sistema Academico Java

## Para quien es

Este material esta pensado para un alumno principiante que necesita aprender desde cero como crear un proyecto, ejecutarlo, probarlo, organizar codigo y conectar Java con MySQL.

## Tecnologias

- Java 17
- Apache NetBeans
- Maven
- MySQL
- MySQL Workbench
- JDBC con MySQL Connector/J
- Git y GitHub
- JUnit en fases posteriores

No se usa Lombok, ORM, migraciones ni herramientas que oculten fundamentos. Los constructores, getters, setters, SQL y conexiones se trabajan de forma explicita.

## Decision de instalacion

Para este curso se usa Java JDK 17 instalado globalmente.

- macOS: Homebrew con `openjdk@17`.
- Windows: `winget` o instalador grafico de Temurin JDK 17.
- NetBeans corre localmente y usa el JDK instalado.
- MySQL puede trabajarse aparte, pero los scripts se ejecutan manualmente en MySQL Workbench.

Los pasos de instalacion y desinstalacion estan en `docs/00-instalacion.md`.

## Estructura

```txt
java-poo-mysql-lab/
├── README.md
├── docs/
├── database/
├── src/
│   ├── main/java/com/tutoria/sistemaacademico/
│   │   ├── Main.java
│   │   ├── config/
│   │   ├── controller/
│   │   ├── exception/
│   │   ├── model/
│   │   ├── repository/
│   │   ├── service/
│   │   └── view/
│   └── test/java/
└── pom.xml
```

## Como ejecutar

Desde terminal:

```bash
mvn clean compile
mvn exec:java
```

Desde NetBeans:

1. Abrir el proyecto Maven.
2. Revisar que exista `pom.xml`.
3. Abrir `src/main/java/com/tutoria/sistemaacademico/Main.java`.
4. Ejecutar el proyecto.

## Como probar

- Manualmente desde el menu por consola.
- Ejecutando scripts SQL en MySQL Workbench.
- Ejecutando pruebas unitarias simples con JUnit en fases posteriores.

```bash
mvn test
```

## Flujo de arquitectura

```txt
view -> controller -> service -> repository -> model
```

- `view`: entrada y salida por consola.
- `controller`: coordina acciones del usuario.
- `service`: reglas de negocio.
- `repository`: acceso a datos.
- `model`: clases del dominio.

## Ruta de aprendizaje

1. Instalacion de herramientas.
2. Creacion del proyecto en NetBeans.
3. Git basico.
4. Java basico.
5. POO.
6. Arquitectura por capas.
7. MySQL Workbench.
8. JDBC.

Cada leccion debe incluir definiciones, teoria breve, ejemplo guiado, practica, revision y reto para casa.

## Estrategia de ramas sugerida

- `main`: referencia estable del proyecto.
- `starter`: version inicial para que el alumno practique.
- `solution`: version completa para revision del tutor.
- `lesson/*`: checkpoints por tema cuando haga falta.

La version `starter` no debe entregar toda la solucion antes de que el alumno intente resolver el ejercicio.
