CREATE DATABASE cursosdb;
USE cursosdb;
CREATE DATABASE cursos_hexagonal;


CREATE TABLE cursos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(150) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    horas INT NOT NULL,
    nivel VARCHAR(50),
    profesor VARCHAR(100),
    institucion VARCHAR(100),
    fecha_inscripcion_inicio DATE,
    fecha_inscripcion_fin DATE,
    fecha_inicio DATE,
    fecha_cierre DATE,
    num_alumnos INT,
    modalidad VARCHAR(50),
    descripcion VARCHAR(500)
);
