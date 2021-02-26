/* Crear la base de datos */
CREATE DATABASE recursosHumanos;
/* Uso de la base de datos */
USE recursosHumanos;

/* Creación de las tablas */
/* Tabla "Ciudades" */
CREATE TABLE Ciudades(
idCiudad INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
idEstado INT NOT NULL,
estatus CHAR
);
/* Foreign Key */
ALTER TABLE Ciudades
ADD CONSTRAINT FK_Ciudades_Estado
FOREIGN KEY(idEstado) REFERENCES Estados(idEstado);

/* CHECKS */
ALTER TABLE Ciudades
ADD CHECK (estatus = 'A' or estatus = 'I');