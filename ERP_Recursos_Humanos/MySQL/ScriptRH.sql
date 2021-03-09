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

/*Tabla Estados*/
USE recursosHumanos;
create table Estados(
idEstados int not null primary key auto_increment,
nombre varchar(60),
siglas varchar(50),
estatus char);

ALTER TABLE Estados
ADD CHECK (estatus = 'A' or estatus = 'I');
select*from Estados; 

USE recursosHumanos;
create table Puestos(
idPuesto int not null primary key auto_increment,
nombre varchar(60),
salarioMinimo float,
salarioMaximo float,
estatus char);

ALTER TABLE Puestos
ADD CHECK (estatus = 'A' or estatus = 'I');
select*from Puestos;

/*Tabla Asistencias*/
create table Asistencias(
idAsistencia int not null primary key auto_increment,
fecha date,
horaEntrada date,
horaSalida date,
dia varchar(10),
idEmpleado int);

/* Foreign Key */
ALTER TABLE Asistencias
ADD CONSTRAINT FK_Asistencias_Empleados
FOREIGN KEY(idEmpleado) REFERENCES Empleados(idEmpleado);
