# 07 - JDBC

## Objetivo

Entender como Java se conecta a MySQL usando JDBC y el conector oficial de MySQL.

## Definiciones

- **JDBC**: API de Java para conectarse a bases de datos.
- **Conector JDBC**: libreria que permite que Java hable con un motor especifico, como MySQL.
- **Connection**: objeto que representa una conexion abierta a la base de datos.
- **PreparedStatement**: instruccion SQL preparada que permite pasar valores de forma segura.
- **ResultSet**: resultado de una consulta SQL.

## Teoria breve

JDBC no crea magia. Java abre una conexion, prepara una consulta, envia valores y lee resultados. La base de datos debe existir antes, por eso primero ejecutamos los scripts manualmente en Workbench.

## Ejemplo guiado

En `JdbcStudentRepository` se usa `PreparedStatement`:

```java
String sql = "SELECT id, first_name, last_name, email FROM students WHERE id = ?";
PreparedStatement statement = connection.prepareStatement(sql);
statement.setInt(1, id);
```

El signo `?` se reemplaza con un valor usando metodos como `setInt` o `setString`.

## Practica del alumno

Leer el metodo `findById` de `JdbcStudentRepository` e identificar la conexion, el SQL, el parametro y el resultado.

## Revision

- El alumno puede explicar que es JDBC.
- El alumno puede explicar por que usamos `PreparedStatement`.
- El alumno entiende que los scripts se ejecutan antes de conectar Java.

## Reto para casa

Escribir el SQL para buscar estudiantes por apellido y pensar que parametro tendria el `PreparedStatement`.
