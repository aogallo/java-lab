USE sistema_academico;

SELECT id, first_name, last_name, email
FROM students
ORDER BY id;

SELECT courses.id, courses.name, courses.description
FROM courses
ORDER BY courses.id;

SELECT students.first_name, students.last_name, courses.name AS course_name, enrollments.enrollment_date
FROM enrollments
JOIN students ON students.id = enrollments.student_id
JOIN courses ON courses.id = enrollments.course_id
ORDER BY enrollments.enrollment_date;

SELECT students.first_name, students.last_name, courses.name AS course_name, grades.score, grades.description
FROM grades
JOIN enrollments ON enrollments.id = grades.enrollment_id
JOIN students ON students.id = enrollments.student_id
JOIN courses ON courses.id = enrollments.course_id
ORDER BY grades.score DESC;
