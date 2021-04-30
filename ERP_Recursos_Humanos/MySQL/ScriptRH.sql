DROP DATABASE IF exists ERP;
/* Crear la base de datos */
CREATE DATABASE ERP;
/* Uso de la base de datos */
USE ERP;

/* Creación de las tablas */
/* Tabla "Ciudades" -- A*/
CREATE TABLE Ciudades(
idCiudad INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
idEstado INT NOT NULL,
estatus CHAR);

/*Tabla Estados -- A*/
create table Estados(
idEstado int not null primary key auto_increment,
nombre varchar(60),
siglas varchar(50),
estatus char);

/*Tabla Puestos -- A*/
create table Puestos(
idPuesto int not null primary key auto_increment,
nombre varchar(60),
salarioMinimo float,
salarioMaximo float,
estatus char);

/*Tabla Asistencias -- A*/
create table Asistencias(
idAsistencia int not null primary key auto_increment,
fecha date,
horaEntrada date,
horaSalida date,
dia varchar(10),
idEmpleado int);

/*Tabla Turnos -- A*/
Create Table Turnos(
idTurno int not null primary key auto_increment,
nombre varchar(20) NOT NULL,
horaInicio time NOT NULL,
horaFin time NOT NULL,
dias varchar(30) NOT NULL,
estatus char);

/*Tabla Departamentos -- A*/
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
fotografia mediumblob NOT NULL,
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
evidencia blob NOT NULL,
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
porcentaje float NOT NULL,
estatus char NOT NULL);

/*Tabla Percepciones*/
Create Table Percepciones(
idPercepcion int not null primary key auto_increment,
nombre varchar(30) NOT NULL,
descripcion varchar(80) NOT NULL,
diasPagar int NOT NULL,
estatus char NOT NULL);

/*Tabla DocumentacionEmpleado*/
Create Table DocumentacionEmpleado(
idDocumento int not null primary key auto_increment,
nombreDocumento varchar(80) NOT NULL,
fechaEntrega date NOT NULL,
documento mediumblob NOT NULL,
idEmpleado int NOT NULL);
ALTER TABLE DocumentacionEmpleado ADD COLUMN estatus VARCHAR (1) NOT NULL;

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

create table DireccionesCliente(
idDireccion int auto_increment not null,
idCliente int not null,
idCiudad int not null,
calle varchar(100) not null,
numero varchar(5) not null,
colonia varchar(100) not null,
codigoPostal varchar(5) not null,
tipo char not null,
estatus char not null,
CONSTRAINT pk_Direcciones_Cliente PRIMARY KEY (idDireccion)
);


/*==============================================================*/

create table Mantenimientos(
idMantenimiento int auto_increment not null,
idUnidadTransporte int not null,
fechaInicio date not null,
fechaFin date not null,
taller varchar(100) not null,
costo float not null,
comentarios varchar(200),
tipo varchar(30) not null,
estatus char not null,
CONSTRAINT pk_Mantenimientos PRIMARY KEY (idMantenimiento)
);


/*==============================================================*/
/* Table: Parcelas				                               	*/
/*==============================================================*/

create table Parcelas(
idParcela int auto_increment not null,
idCliente int not null,
idCultivo int not null,
idDireccion int not null,
extension float not null,
estatus char not null,
CONSTRAINT pk_Parcelas PRIMARY KEY (idParcela)
);


/*==============================================================*/
/* Table: UnidadesTransporte					                */
/*==============================================================*/

create table UnidadesTransporte(
idUnidadTransporte int auto_increment not null,
placas varchar(10) not null,
marca varchar(80) not null,
modelo varchar(80) not null,
anio int not null,
capacidad int not null,
tipo varchar(30) not null,
estatus char not null,
CONSTRAINT pk_UnidadesTransporte PRIMARY KEY (idUnidadTransporte)
);


/*==============================================================*/
/* Table: ContactosCliente						                */
/*==============================================================*/

create table ContactosCliente(
idContacto int auto_increment not null,
idCliente int not null,
nombre varchar(100) not null,
telefono varchar(12) not null,
email varchar(100) not null,
estatus char not null,
CONSTRAINT pk_ContactosCliente PRIMARY KEY (idContacto)
);

/*=================================================================================================================*/
/*=================================================================================================================*/
/*=================================================================================================================*/
/*=================================================================================================================*/
/*=================================================================================================================*/
/*=================================================================================================================*/



/*==============================================================*/
/* Table: VentasDetalle                                         */
/*==============================================================*/
create table VentaDetalle(
   idVentaDetalle int not null,
   precioVenta float not null,
   cantidad float not null,
   subtotal float not null,
   idVenta int not null,
   CONSTRAINT pk_VentaDetalle PRIMARY KEY (idVentaDetalle) 
);
/*==============================================================*/
/* Table: OfertasAsociacion                                     */
/*==============================================================*/
create table OfertasAsociacion(
idAsosiacion int not null,
idOferta int not null,
estatus char not null,
CONSTRAINT pk_OfertaAsociacion PRIMARY KEY (idAsosiacion,idOferta)
);
/*==============================================================*/
/* Table: Ventas                                    			*/
/*==============================================================*/
create table Ventas(
idVenta int not null,
fecha date not null,
subtotal float not null,
iva float not null,
total float not null,
cantPagada float not null,
comentarios varchar(100),
estatus char not null,
tipo char not null,
idCliente int not null,
idSucursal int not null,
idEmpleado int not null,
CONSTRAINT pk_Ventas PRIMARY KEY (idVenta)
);


/*==============================================================*/
/* Table: Tripulacion				                            */
/*==============================================================*/
create table Tripulacion(
idEmpleado int not null,
idEnvio int not null,
rol varchar(50) not null,
CONSTRAINT pk_Tripulacion PRIMARY KEY (idEmpleado,idEnvio,rol)
);
/*==============================================================*/
/* Table: Cobro						                            */
/*==============================================================*/
create table Cobro(
idCobro int  not null,
fecha date not null,
importe float not null,
idVenta int not null,
CONSTRAINT pk_Cobros PRIMARY KEY (idCobro)
);
/*==============================================================*/
/* Table: DetallesEnvio					                        */
/*==============================================================*/
create table DetallesEnvio(
idEnvio int not null,
idVenta int not null,
idDireccion int not null,
fechaEntregaPlaneada date not null,
peso float not null,
estatus char not null,
idContacto int not null,
CONSTRAINT pk_Detalles_Envio PRIMARY KEY (idEnvio,idVenta)
);


/*==============================================================*/
/* Table: Asesorias						                		*/
/*==============================================================*/
create table Asesorias(
idAsesoria int not null,
fecha date not null,
comentarios varchar(200) not null,
estatus char not null,
costo float not null,
idParcela int not null,
idEmpleado int not null, 
idUnidadTransporte int not null,
CONSTRAINT pk_Asesorias PRIMARY KEY (idAsesoria)
);
/*==============================================================*/
/* Table:Envios					             				  	*/
/*==============================================================*/
create table Envios(
idEnvio int  not null,
fechaInicio date not null,
fechaFin date not null,
idUnidadTransporte int not null,
pesoTotal float not null,
CONSTRAINT pk_Envios PRIMARY KEY (idEnvio)
);


/*==============================================================*/
/* Table:Laboratorios			             				    */
/*==============================================================*/
create table Laboratorios (
	idLaboratorio int  not null,
	nombre varchar(50) not null,
	origen varchar(30) not null,
	estatus char not null,
	CONSTRAINT PK_Laboratorios PRIMARY KEY (idLaboratorio)
);
/*==============================================================*/
/* Table:Categorias				             				    */
/*==============================================================*/
create table Categorias (
	idCategoria int  not null,
	nombre varchar(30) not null,
	estatus char not null,
	CONSTRAINT PK_Categorias PRIMARY KEY (idCategoria)
);
/*==============================================================*/
/* Table:Empaques				             				    */
/*==============================================================*/
create table Empaques (
	idEmpaque int not null,
	nombre varchar(80) not null,
	capacidad float not null,
	estatus char not null,
	idUnidad int not null,
	CONSTRAINT PK_Empaques PRIMARY KEY (idEmpaque)
);
/*==============================================================*/
/* Table:UnidadesMedida				             				*/
/*==============================================================*/
create table UnidadesMedida (
	idUnidad int  not null,
	nombre varchar(80) not null,
	siglas varchar(20) not null,
	estatus char not null,
	CONSTRAINT PK_UnidadMedida PRIMARY KEY (idUnidad)
);
/*==============================================================*/
/* Table:Ofertas				             					*/
/*==============================================================*/
create table Ofertas (
	idOferta int  not null,
	nombre varchar(50) not null,
	descripcion varchar(100) not null,
	porDescuento float not null,
	fechaInicio date not null,
	fechaFin date not null,
	canMinProductos int not null,
	estatus char not null,
	idPresentacion int not null,
	CONSTRAINT PK_Ofertas PRIMARY KEY (idOferta)
);
/*==============================================================*/
/* Table:Productos				             					*/
/*==============================================================*/
create table Productos (
	idProducto int  not null,
	nombre varchar(50) not null,
	descripcion varchar(100) not null,
	ingredienteActivo varchar(100) not null,
	bandaToxicologica varchar(80) not null,
	aplicacion varchar(200) not null,
	uso varchar(200) not null,
	estatus char not null,
	idLaboratorio int not null,
	idCategoria int not null,
	CONSTRAINT PK_Productos PRIMARY KEY (idProducto)
);
/*==============================================================*/
/* Table:PresentacionesProducto				             		*/
/*==============================================================*/
create table PresentacionesProducto (
	idPresentacion int  not null,
	precioCompra float not null,
	precioVenta float not null,
	puntoReorden float not null,
	idProducto int not null,
	idEmpaque int not null,
	CONSTRAINT PK_PresentacionesProducto PRIMARY KEY (idPresentacion)
);
/*==============================================================*/
/* Table:ExistenciasSucursal				             		*/
/*==============================================================*/
create table ExistenciasSucursal (
	idPresentacion int not null,
	idSucursal int not null,
	cantidad float not null,
	CONSTRAINT PK_ExistenciasSucursal PRIMARY KEY (idPresentacion, idSucursal)
);
/*==============================================================*/
/* Table:Sucursales							             		*/
/*==============================================================*/
create table Sucursales (
	idSucursal int  not null,
	nombre varchar(50) not null,
	telefono varchar(15) not null,
	direccion varchar(80) not null,
	colonia varchar(50) not null,
	codigoPostal varchar(5) not null,
	presupuesto float not null,
	estatus char not null,
	idCiudad int not null,
	CONSTRAINT PK_Sucursales PRIMARY KEY (idSucursal)
);

/*==============================================================*/
/* Table:ImagenesProducto							            */
/*==============================================================*/
create table ImagenesProducto (
	idImagen int  not null,
	nombreImagen varchar(100),
	imagen blob not null,
	principal char not null,
	idProducto int not null,
	CONSTRAINT PK_ImagenesProducto PRIMARY KEY (idImagen)
);
/*==============================================================*/
/* Table:ProductosProveedor							            */
/*==============================================================*/
create table ProductosProveedor (
	idProveedor int not null,
	idPresentacion int not null,
	diasRetardo int not null,
	precioEstandar float not null,
	precioUltimaCompra float not null,
	cantMinPedir int not null,
	cantMaxPedir int not null,
	CONSTRAINT PK_ProductosProveedor PRIMARY KEY (idProveedor, idPresentacion)
);
/*==============================================================*/
/* Table:PedidoDetalle								            */
/*==============================================================*/
create table PedidoDetalle (
	idPedidoDetalle int  not null,
	cantPedida int not null,
	precioCompra float not null,
	subTotal float not null,
	cantRecibida int not null,
	cantRechazada int not null,
	cantAceptada float not null,
	idPedido int not null,
	idPresentacion int not null,
	CONSTRAINT PK_PedidoDetalle PRIMARY KEY (idPedidoDetalle)
);
/*==============================================================*/
/* Table:Pedidos									            */
/*==============================================================*/
create table Pedidos (
	idPedido int  not null,
	fechaRegistro date not null,
	fechaRecepcion date not null,
	totalPagar float not null,
	cantidadPagada float not null,
	estatus char not null,
	idProveedor int not null,
	idSucursal int not null,
	idEmpleado int not null,
	CONSTRAINT PK_Pedidos PRIMARY KEY (idPedido)
);
/*==============================================================*/
/* Table:ContactosProveedor							            */
/*==============================================================*/
create table ContactosProveedor (
	idContacto int  not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	idProveedor int not null,
	CONSTRAINT PK_ContactosProveedor PRIMARY KEY (idContacto)
);
/*==============================================================*/
/* Table:Proveedores								            */
/*==============================================================*/
create table Proveedores (
	idProveedor int  not null,
	nombre varchar(80) not null,
	telefono varchar(12) not null,
	email varchar(100) not null,
	direccion varchar(80) not null,
	colonia varchar(50) not null,
	codigoPostal varchar(5) not null,
	CONSTRAINT PK_Proveedores PRIMARY KEY (idProveedor)
);
/*==============================================================*/
/* Table:CuentasProveedor							            */
/*==============================================================*/
create table CuentasProveedor (
	idCuentaProveedor int  not null,
	idProveedor int not null,
	noCuenta varchar(10) not null,
	banco varchar(30) not null,
	referenciaBancaria varchar(20) not null,
	CONSTRAINT PK_CuentasProveedor PRIMARY KEY (idCuentaProveedor)
);
/*==============================================================*/
/* Table:Pagos										            */
/*==============================================================*/
create table Pagos (
	idPago int not null,
	fecha date not null,
	importe float not null,
	idPedido int not null,
	idFormaPago int not null,
	CONSTRAINT PK_Pagos PRIMARY KEY (idPago)
);

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

ALTER TABLE Turnos
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Puestos
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Estados
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE DocumentacionEmpleado
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Percepciones
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Deducciones
ADD CHECK (estatus = 'A' or estatus = 'I');

ALTER TABLE Deducciones
ADD CHECK (porcentaje > 0 AND porcentaje < 100);

/* Creación de usuarios */
CREATE USER Victor IDENTIFIED BY 'ERP123';
GRANT ALL PRIVILEGES ON Turnos TO 'Victor';
GRANT ALL PRIVILEGES ON Ciudades TO 'Victor';
GRANT ALL PRIVILEGES ON Departamentos TO 'Victor';
GRANT ALL PRIVILEGES ON Estados TO 'Victor';
GRANT ALL PRIVILEGES ON Puestos TO 'Victor';
GRANT ALL PRIVILEGES ON Empleados TO 'Victor';
GRANT ALL PRIVILEGES ON DocumentacionEmpleado TO 'Victor';
GRANT ALL PRIVILEGES ON Percepciones TO 'Victor';
GRANT ALL PRIVILEGES ON Deducciones TO 'Victor';
GRANT ALL PRIVILEGES ON Periodos TO 'Victor';
FLUSH PRIVILEGES;