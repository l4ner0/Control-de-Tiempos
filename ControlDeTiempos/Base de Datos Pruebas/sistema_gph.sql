USE [master]
GO
/****** Object:  Database [sistema_gph]    Script Date: 11/08/2017 01:10:46 ******/
CREATE DATABASE [sistema_gph] ON  PRIMARY 
( NAME = N'sistema_gph', FILENAME = N'C:\Archivos de programa\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\sistema_gph.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'sistema_gph_log', FILENAME = N'C:\Archivos de programa\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\sistema_gph_log.LDF' , SIZE = 576KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [sistema_gph] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [sistema_gph].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [sistema_gph] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [sistema_gph] SET ANSI_NULLS OFF
GO
ALTER DATABASE [sistema_gph] SET ANSI_PADDING OFF
GO
ALTER DATABASE [sistema_gph] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [sistema_gph] SET ARITHABORT OFF
GO
ALTER DATABASE [sistema_gph] SET AUTO_CLOSE ON
GO
ALTER DATABASE [sistema_gph] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [sistema_gph] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [sistema_gph] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [sistema_gph] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [sistema_gph] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [sistema_gph] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [sistema_gph] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [sistema_gph] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [sistema_gph] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [sistema_gph] SET  ENABLE_BROKER
GO
ALTER DATABASE [sistema_gph] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [sistema_gph] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [sistema_gph] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [sistema_gph] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [sistema_gph] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [sistema_gph] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [sistema_gph] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [sistema_gph] SET  READ_WRITE
GO
ALTER DATABASE [sistema_gph] SET RECOVERY SIMPLE
GO
ALTER DATABASE [sistema_gph] SET  MULTI_USER
GO
ALTER DATABASE [sistema_gph] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [sistema_gph] SET DB_CHAINING OFF
GO
USE [sistema_gph]
GO
/****** Object:  Table [dbo].[Usuarios]    Script Date: 11/08/2017 01:10:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuarios](
	[nombre] [varchar](20) NOT NULL,
	[apellido] [varchar](20) NOT NULL,
	[Usuario] [varchar](20) NOT NULL,
	[contraseña] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Usuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[areasEmpresa]    Script Date: 11/08/2017 01:10:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[areasEmpresa](
	[idArea] [int] IDENTITY(1,1) NOT NULL,
	[nombreArea] [varchar](20) NULL,
	[descripcionArea] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[idArea] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[horario]    Script Date: 11/08/2017 01:10:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[horario](
	[idHorario] [int] IDENTITY(1,1) NOT NULL,
	[turno] [varchar](7) NOT NULL,
	[horaEntrada] [time](7) NOT NULL,
	[horaSalida] [time](7) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idHorario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[retencion]    Script Date: 11/08/2017 01:10:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[retencion](
	[idRetencion] [int] IDENTITY(1,1) NOT NULL,
	[nombreRetencion] [varchar](10) NOT NULL,
	[aporteObligatorio] [decimal](2, 2) NOT NULL,
	[comision] [decimal](2, 2) NOT NULL,
	[primaSeguro] [decimal](2, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idRetencion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[puesto]    Script Date: 11/08/2017 01:10:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[puesto](
	[idPuesto] [int] IDENTITY(1,1) NOT NULL,
	[nombrePuesto] [varchar](40) NOT NULL,
	[descripcionPuesto] [text] NOT NULL,
	[requerimientosPuesto] [text] NOT NULL,
	[sueldoBasico] [decimal](7, 2) NOT NULL,
	[vacantes] [int] NOT NULL,
	[idArea] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idPuesto] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_horario]    Script Date: 11/08/2017 01:11:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--horario----------------------------------------------------------------------------------------------------------------------
create proc [dbo].[usp_graba_horario]
@TURNO VARCHAR(7), @HORAEN TIME,@HORASA TIME
AS
begin
INSERT INTO horario VALUES(@TURNO,@HORAEN,@HORASA);
end
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_areas]    Script Date: 11/08/2017 01:11:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[usp_graba_areas]
@NOM VARCHAR(20), @DES text
AS
begin
INSERT INTO areasEmpresa VALUES(@NOM,@DES)
end
GO
/****** Object:  StoredProcedure [dbo].[usp_elimina_areas]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[usp_elimina_areas]
@idArea int
AS
begin
	delete  from areasEmpresa where idArea=@idArea
end
GO
/****** Object:  StoredProcedure [dbo].[usp_mostrar_areas]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*PROCEDIMIENTOS ALMACENDADOS*/
--areas-----------------------------------------------------------------------------------------------------------------------
create proc  [dbo].[usp_mostrar_areas]
as
begin
     select * from areasEmpresa
end
GO
/****** Object:  StoredProcedure [dbo].[usp_modifica_areas]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[usp_modifica_areas]
@idArea int, @NOM VARCHAR(20), @DES text
AS
begin
	update areasEmpresa set nombreArea=@nom, descripcionArea=@DES
	where idArea=@idArea
end
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_puesto]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--puesto-----------------------------------------------------------------------------------------------------------------------
create proc [dbo].[usp_graba_puesto]
@NOMPUESTO VARCHAR(40), @DESPUESTO TEXT,@REQUEPUESTO TEXT,
@SUELDO DECIMAL(7,2), @VACAN INT, @IdAREA INT 
AS
begin
INSERT INTO puesto VALUES(@NOMPUESTO,@DESPUESTO,@REQUEPUESTO,@SUELDO,@VACAN,@IdAREA);
end
GO
/****** Object:  Table [dbo].[HorarioPuesto]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HorarioPuesto](
	[idHoraPuesto] [int] IDENTITY(1,1) NOT NULL,
	[idPuesto] [int] NOT NULL,
	[idHorario] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idHoraPuesto] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[empleado]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[empleado](
	[idEmpleado] [char](8) NOT NULL,
	[fotoEmpleado] [varchar](200) NOT NULL,
	[nombres] [varchar](20) NOT NULL,
	[apellidoPaterno] [varchar](20) NOT NULL,
	[apellidoMaterno] [varchar](20) NOT NULL,
	[sexo] [varchar](10) NOT NULL,
	[DNI] [char](8) NOT NULL,
	[fechaNacimiento] [varchar](100) NULL,
	[DistritoResidencia] [varchar](15) NOT NULL,
	[direccion] [varchar](40) NOT NULL,
	[telefono] [char](9) NULL,
	[correoElectronico] [varchar](20) NULL,
	[asignacionFamiliar] [varchar](2) NOT NULL,
	[idArea] [int] NOT NULL,
	[idPuesto] [int] NOT NULL,
	[idRetencion] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idEmpleado] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [AK_DNI] UNIQUE NONCLUSTERED 
(
	[DNI] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[telefono] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[correoElectronico] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[asistencia]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[asistencia](
	[idAsistencia] [int] NOT NULL,
	[fechaAsistencia] [date] NOT NULL,
	[horaEntrada] [time](7) NOT NULL,
	[horaSalida] [time](7) NOT NULL,
	[idEmpleado] [char](8) NOT NULL,
	[idHorario] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idAsistencia] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  StoredProcedure [dbo].[usp_mostrar_empleados]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--Empleado---------------------------------------------------------------------------------------------------------------------
create proc [dbo].[usp_mostrar_empleados]
as
begin
     select * from empleado
end
GO
/****** Object:  StoredProcedure [dbo].[usp_modifica_empleado]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[usp_modifica_empleado]
@IdEMPLE CHAR(8), @NOMEMPLE VARCHAR(20), @APEPATERNO VARCHAR(20),
@APEMATERNO VARCHAR(20), @SEXO VARCHAR(10), @DNI CHAR(8),
@FECHANACI DATE, @DISTRITO VARCHAR(15), @DIREC VARCHAR(40),
@TELEF CHAR(9),@CORREO VARCHAR(20), @ASIGFAMILI VARCHAR(2),
@IdAREA INT, @IdPUESTO INT, @IdRETENCION INT
AS
begin
	update empleado set idEmpleado=@IdEMPLE,nombres=@NOMEMPLE,apellidoPaterno=@APEPATERNO,apellidoMaterno=@APEMATERNO,
			sexo=@SEXO,DNI=@DNI, fechaNacimiento=@FECHANACI,DistritoResidencia= @DISTRITO,direccion=@DIREC,telefono=@TELEF,
			correoElectronico=@CORREO,asignacionFamiliar=@ASIGFAMILI,idArea=@IdAREA,idPuesto=@IdPUESTO,idRetencion=@IdRETENCION 
			where idEmpleado=@IdEMPLE
end
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_HorarioPuesto]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--HorarioPuesto----------------------------------------------------------------------------------------------------------------
CREATE PROC [dbo].[usp_graba_HorarioPuesto]
@IdPUESTO INT, @IdHORARIO INT
AS
begin
INSERT INTO HorarioPuesto VALUES(@IdPUESTO,@IdHORARIO);
end
GO
/****** Object:  StoredProcedure [dbo].[usp_elimina_empleado]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[usp_elimina_empleado]
@IdEMPLE char(8)
as
begin
	delete from empleado where idEmpleado=@IdEMPLE
end
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_empleado]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[usp_graba_empleado]
@IdEMPLE CHAR(8),@fotoEMPLEADO varchar(200), @NOMEMPLE VARCHAR(20), @APEPATERNO VARCHAR(20),
@APEMATERNO VARCHAR(20), @SEXO VARCHAR(10), @DNI CHAR(8),
@FECHANACI VARCHAR(100), @DISTRITO VARCHAR(15), @DIREC VARCHAR(40),
@TELEF CHAR(9),@CORREO VARCHAR(20), @ASIGFAMILI VARCHAR(2),
@IdAREA INT, @IdPUESTO INT, @IdRETENCION INT 
AS
begin 
	INSERT INTO empleado VALUES(@IdEMPLE,@fotoEMPLEADO,@NOMEMPLE,@APEPATERNO,@APEMATERNO,
	@SEXO,@DNI,@FECHANACI,@DISTRITO,@DIREC,@TELEF,@CORREO,@ASIGFAMILI,@IdAREA,@IdPUESTO,@IdRETENCION);
end
GO
/****** Object:  StoredProcedure [dbo].[usp_graba_asistencia]    Script Date: 11/08/2017 01:11:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--Asistencia-------------------------------------------------------------------------------------------------------------------
CREATE PROC [dbo].[usp_graba_asistencia]
@IdASISTENCIA INT, @FECHA DATE, @HORAENTRA TIME, @HORASALE TIME,
@IdEMPLE CHAR(8),@IdHORARIO INT
AS
begin
INSERT INTO asistencia VALUES(@IdASISTENCIA,@FECHA,@HORAENTRA,@HORASALE,@IdEMPLE,@IdHORARIO);
end
GO
/****** Object:  Check [CK__horario__turno__08EA5793]    Script Date: 11/08/2017 01:10:48 ******/
ALTER TABLE [dbo].[horario]  WITH CHECK ADD CHECK  (([turno]='Tarde' OR [turno]='Mañana'))
GO
/****** Object:  Check [CK__empleado__asigna__24927208]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD CHECK  (([asignacionFamiliar]='No' OR [asignacionFamiliar]='Si'))
GO
/****** Object:  Check [CK__empleado__sexo__22AA2996]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD CHECK  (([sexo]='Femenino' OR [sexo]='Masculino'))
GO
/****** Object:  Check [CK__empleado__telefo__239E4DCF]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD CHECK  (([telefono] like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'))
GO
/****** Object:  ForeignKey [FK__puesto__idArea__117F9D94]    Script Date: 11/08/2017 01:10:48 ******/
ALTER TABLE [dbo].[puesto]  WITH CHECK ADD FOREIGN KEY([idArea])
REFERENCES [dbo].[areasEmpresa] ([idArea])
GO
/****** Object:  ForeignKey [FK__HorarioPu__idHor__173876EA]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[HorarioPuesto]  WITH CHECK ADD FOREIGN KEY([idHorario])
REFERENCES [dbo].[horario] ([idHorario])
GO
/****** Object:  ForeignKey [FK__HorarioPu__idPue__164452B1]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[HorarioPuesto]  WITH CHECK ADD FOREIGN KEY([idPuesto])
REFERENCES [dbo].[puesto] ([idPuesto])
GO
/****** Object:  ForeignKey [FK__empleado__idArea__25869641]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD FOREIGN KEY([idArea])
REFERENCES [dbo].[areasEmpresa] ([idArea])
GO
/****** Object:  ForeignKey [FK__empleado__idPues__267ABA7A]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD FOREIGN KEY([idPuesto])
REFERENCES [dbo].[puesto] ([idPuesto])
GO
/****** Object:  ForeignKey [FK__empleado__idRete__276EDEB3]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[empleado]  WITH CHECK ADD FOREIGN KEY([idRetencion])
REFERENCES [dbo].[retencion] ([idRetencion])
GO
/****** Object:  ForeignKey [FK__asistenci__idEmp__2C3393D0]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[asistencia]  WITH CHECK ADD FOREIGN KEY([idEmpleado])
REFERENCES [dbo].[empleado] ([idEmpleado])
GO
/****** Object:  ForeignKey [FK__asistenci__idHor__2D27B809]    Script Date: 11/08/2017 01:11:01 ******/
ALTER TABLE [dbo].[asistencia]  WITH CHECK ADD FOREIGN KEY([idHorario])
REFERENCES [dbo].[horario] ([idHorario])
GO
