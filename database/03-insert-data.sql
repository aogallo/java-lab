USE sistema_academico;

INSERT INTO students (first_name, last_name, email) VALUES
('Ana', 'Lopez', 'ana.lopez@example.com'),
('Carlos', 'Perez', 'carlos.perez@example.com');

INSERT INTO teachers (first_name, last_name, specialty) VALUES
('Maria', 'Gomez', 'Java'),
('Luis', 'Ramirez', 'Bases de datos');

INSERT INTO courses (name, description) VALUES
('Java Basico', 'Fundamentos de programacion con Java'),
('MySQL Inicial', 'Tablas, datos y consultas basicas');

INSERT INTO enrollments (student_id, course_id, enrollment_date) VALUES
(1, 1, '2026-01-10'),
(2, 2, '2026-01-11');

INSERT INTO grades (enrollment_id, score, description) VALUES
(1, 18.50, 'Practica de POO'),
(2, 17.00, 'Consulta SQL basica');
