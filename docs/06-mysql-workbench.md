# 06 - MySQL Workbench

## Objetivo

Aprender a ejecutar scripts SQL manualmente en MySQL Workbench.

## Definiciones

- **Base de datos**: lugar donde se guardan datos organizados.
- **Tabla**: estructura con filas y columnas.
- **Fila**: registro concreto dentro de una tabla.
- **Columna**: dato especifico de una tabla.
- **Clave primaria**: identificador unico de una fila.
- **Clave foranea**: relacion entre una tabla y otra.
- **Script SQL**: archivo con instrucciones SQL que se ejecutan en la base de datos.

## Teoria breve

La base de datos se trabaja manualmente para que el alumno vea que ocurre. Primero se ejecutan scripts en MySQL Workbench; despues Java se conecta con JDBC.

## Ejemplo guiado

Orden para ejecutar scripts:

1. `database/01-create-database.sql`
2. `database/02-create-tables.sql`
3. `database/03-insert-data.sql`
4. `database/04-queries.sql`

En MySQL Workbench:

1. Abrir una conexion local.
2. Abrir el script.
3. Ejecutar el script.
4. Revisar los resultados.

## Practica del alumno

Ejecutar `04-queries.sql` y explicar que devuelve cada consulta.

## Revision

- El alumno puede crear la base de datos.
- El alumno puede crear tablas.
- El alumno puede insertar datos.
- El alumno puede ejecutar un `SELECT`.

## Reto para casa

Agregar un estudiante nuevo desde Workbench usando `INSERT INTO students`.
