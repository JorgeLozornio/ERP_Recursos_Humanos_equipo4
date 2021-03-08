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
estatus CHAR);

/*Tabla Estados*/
create table Estados(
idEstados int not null primary key auto_increment,
nombre varchar(60),
siglas varchar(50),
estatus char);

/*Tabla Puestos*/
create table Puestos(
idPuesto int not null primary key auto_increment,
nombre varchar(60),
salarioMinimo float,
salarioMaximo float,
estatus char);

/*Tabla Asistencias*/
create table Asistencias(
idAsistencia int not null primary key auto_increment,
fecha date,
horaEntrada date,
horaSalida date,
dia varchar(10),
idEmpleado int);

/*Tabla Turnos*/
Create Table Turnos(
idTurno int not null primary key auto_increment,
nombre varchar(20) NOT NULL,
horaInicio date NOT NULL,
horaFin date NOT NULL,
dias varchar(30) NOT NULL);

/*Tabla Departamentos*/
Create Table Departamentos(
idDepartamento int not null primary key auto_increment,
nombre varchar(50) NOT NULL,
estatus char NOT NULL);

/*Tabla Empleados*/
Create Table Empleados(
idEmpleado int not null primary key auto_increment,
nombre varchar(30) NOT NULL,
apellidoPaterno varchar(30) NOT NULL,
apellidoMaterno varchar(30) NOT NULL,
sexo char NOT NULL,
fechaNacimiento date NOT NULL,
curp varchar(20) NOT NULL,
estadoCivil varchar(20) NOT NULL,
fechaContratacion date NOT NULL,
salarioDiario float NOT NULL,
nss varchar(10) NOT NULL,
diasVacaciones int NOT NULL,
diasPermiso int NOT NULL,
fotografia image NOT NULL,
direccion varchar(80) NOT NULL,
colonia varchar(50) NOT NULL,
codigoPostal varchar(5) NOT NULL,
escolaridad varchar(80) NOT NULL,
especialidad varchar(100) NOT NULL,
email varchar(100) NOT NULL,
pass varchar(20) NOT NULL,
tipo varchar(10) NOT NULL,
estatus char NOT NULL,
idDepartamento int NOT NULL,
idPuesto int NOT NULL,
idCiudad int NOT NULL,
idSucursal int NOT NULL,
idTurno int NOT NULL);

/*Tabla AusenciasJustificadas*/
Create Table AusenciasJustificadas(
idAudsencia int not null primary key auto_increment,
fechaSolicitud date NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL,
tipo char NOT NULL,
idEmpleadoSolicita int NOT NULL,
idEmpleadoAutoriza int NOT NULL,
evidencia image NOT NULL,
estatus char NOT NULL,
motivo varchar(100) NOT NULL);

/*Tabla HistorialPuestos*/
Create Table HistorialPuestos(
idEmpleado int not null primary key auto_increment,
idPuesto int NOT NULL,
idDepartamento int NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL);

/*Tabla FormasPago*/
Create Table FormasPago(
idFormaPago int not null primary key auto_increment,
nombre varchar(50) NOT NULL,
estatus char NOT NULL);

/*Tabla Periodos*/
Create Table Periodos(
idPeriodo int not null primary key auto_increment,
nombre varchar(50) NOT NULL,
fechaInicio date NOT NULL,
fechaFin date NOT NULL,
estatus char NOT NULL);

/*Tabla Deducciones*/
Create Table Deducciones(
idDeduccion int not null primary key auto_increment,
nombre varchar(30) NOT NULL,
descripcion varchar(80) NOT NULL,
porcentaje float NOT NULL);

/*Tabla Percepciones*/
Create Table Percepciones(
idPercepcion int not null primary key auto_increment,
nombre varchar(30) NOT NULL,
descripcion varchar(80) NOT NULL,
diasPagar int NOT NULL);

/*Tabla DocumentacionEmpleado*/
Create Table DocumentacionEmpleado(
idDocumento int not null primary key auto_increment,
nombreDocumento varchar(80) NOT NULL,
fechaEntrega date NOT NULL,
documento image NOT NULL,
idEmpleado int NOT NULL);

/*Tabla NominasDeducciones*/
Create Table NominasDeducciones(
idNomina int NOT NULL,
idDeduccion int not null,
importe float NOT NULL);

/*Tabla NominasPercepciones*/
Create Table NominasPercepciones(
idNomina int NOT NULL,
idPercepcion int NOT NULL,
importe float NOT NULL);

/*Tabla Nominas*/
Create Table Nominas(
idNomina int not null primary key auto_increment,
fechaElaboracion date NOT NULL,
fechaPago date NOT NULL,
subtotal float NOT NULL,
retenciones float NOT NULL,
total float NOT NULL,
diasTrabajados int NOT NULL,
estatus char NOT NULL,
idEmpleado int NOT NULL,
idFormaPago int NOT NULL,
idPeriodo int NOT NULL);

/* Foreign Key */
ALTER TABLE Ciudades ADD CONSTRAINT FK_Ciudades_Estado FOREIGN KEY(idEstado) REFERENCES Estados(idEstado);
ALTER TABLE Asistencias ADD CONSTRAINT FK_Asistencias_Empleados FOREIGN KEY(idEmpleado) REFERENCES Empleados(idEmpleado);
ALTER TABLE Empleados ADD CONSTRAINT FK_Empleados_Ciudades FOREIGN KEY (idCiudad) REFERENCES Ciudades (idCiudad);
ALTER TABLE Empleados ADD CONSTRAINT FK_Empleados_Departamentos FOREIGN KEY (idDepartamento) REFERENCES Departamentos (idDepartamento);
ALTER TABLE Empleados ADD CONSTRAINT FK_Empleados_Puestos FOREIGN KEY (idPuesto) REFERENCES Puestos (idPuesto);
ALTER TABLE Empleados ADD CONSTRAINT FK_Empleados_Turnos FOREIGN KEY (idTurno) REFERENCES Turnos (idTurno);
ALTER TABLE HistorialPuestos ADD CONSTRAINT FK_Historial_Puestos FOREIGN KEY (idPuesto) REFERENCES Puestos (idPuesto);
ALTER TABLE HistorialPuestos ADD CONSTRAINT FK_Historial_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado);
ALTER TABLE HistorialPuestos ADD CONSTRAINT FK_Historial_Departamentos FOREIGN KEY (idDepartamento) REFERENCES Departamentos (idDepartamento);
ALTER TABLE AusenciasJustificadas ADD CONSTRAINT FK_AusenciasJustificadas_Empleados FOREIGN KEY (idEmpleadoAutoriza) REFERENCES Empleados (idEmpleado);
ALTER TABLE AusenciasJustificadas ADD CONSTRAINT FK_AusenciasJustificadas_Empleados_2 FOREIGN KEY (idEmpleadoSolicita) REFERENCES Empleados (idEmpleado);
ALTER TABLE DocumentacionEmpleado ADD CONSTRAINT FK_DocumentacionEmpleado_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado);
ALTER TABLE Nominas ADD CONSTRAINT FK_Nominas_FormasPago FOREIGN KEY (idFormaPago) REFERENCES FormasPago (idFormaPago);
ALTER TABLE Nominas ADD CONSTRAINT FK_Nominas_Empleados FOREIGN KEY (idEmpleado) REFERENCES Empleados (idEmpleado);
ALTER TABLE Nominas ADD CONSTRAINT FK_Nominas_Periodos FOREIGN KEY (idPeriodo) REFERENCES Periodos (idPeriodo);
ALTER TABLE NominasDeducciones ADD CONSTRAINT FK_NominasDeducciones_Nominas FOREIGN KEY (idNomina) REFERENCES Nominas (idNomina);
ALTER TABLE NominasDeducciones ADD CONSTRAINT FK_NominasDeducciones_Deducciones FOREIGN KEY (idDeduccion) REFERENCES Deducciones (idDeduccion);
ALTER TABLE NominasPercepciones ADD CONSTRAINT FK_NominasPercepciones PRIMARY KEY (idNomina,idPercepcion);
ALTER TABLE NominasPercepciones ADD CONSTRAINT FK_NominasPercepciones_Nominas FOREIGN KEY (idNomina) REFERENCES Nominas (idNomina);
ALTER TABLE NominasPercepciones ADD CONSTRAINT FK_NominasPercepciones_Percepciones FOREIGN KEY (idPercepcion) REFERENCES Percepciones (idPercepcion);

/* CHECKS */
ALTER TABLE Ciudades
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Puestos
ADD CHECK (estatus = 'A' or estatus = 'I');
select*from Puestos;

ALTER TABLE Estados
ADD CHECK (estatus = 'A' or estatus = 'I');
select*from Estados; 
