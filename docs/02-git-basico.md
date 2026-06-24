# 02 - Git basico

## Objetivo

Aprender comandos basicos de Git para guardar cambios del proyecto.

## Definiciones

- **Repositorio**: carpeta controlada por Git.
- **Commit**: fotografia de los cambios en un momento.
- **Staging area**: zona donde se preparan archivos antes del commit.
- **Branch**: linea de trabajo separada.
- **Remote**: copia del repositorio en otro lugar, por ejemplo GitHub.

## Teoria breve

Git permite volver atras, comparar avances y trabajar por etapas. En una tutoría, Git ayuda a que el alumno vea que cambio en cada clase.

## Ejemplo guiado

```bash
git status
git add README.md
git commit -m "docs: update readme"
git status
```

## Practica del alumno

Modificar un archivo de practica, ejecutar `git status`, agregarlo con `git add` y crear un commit.

## Revision

- El alumno entiende si un archivo esta modificado, agregado o limpio.
- El alumno puede explicar que guarda un commit.

## Reto para casa

Crear una rama llamada `lesson/git-practice`, hacer un cambio pequeño y revisar `git status`.
