-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-11-23 08:17:01.45
create database StudyApp3
use StudyApp3
-- tables
-- Table: Carrera
CREATE TABLE Carrera (
    CCarrera int  NOT NULL,
    NCarrera nvarchar(255)  NOT NULL,
    CSede int  NOT NULL,
    CFacultad int  NOT NULL,
    CONSTRAINT Carrera_pk PRIMARY KEY  (CCarrera)
);

-- Table: Curso
CREATE TABLE Curso (
    CCurso int  NOT NULL,
    NCurso nvarchar(255)  NOT NULL,
    NumCiclo int  NOT NULL,
    CCarrera int  NOT NULL,
    CONSTRAINT Curso_pk PRIMARY KEY  (CCurso)
);

-- Table: Estudiante
CREATE TABLE Estudiante (
    CEstudiante int  NOT NULL,
    NNombre nvarchar(255)  NOT NULL,
    NApellido nvarchar(255)  NOT NULL,
    NEdad int  NOT NULL,
    Cid int  NOT NULL,
    contrasenia varchar(20)  NOT NULL,
    TEmail nvarchar(255)  NOT NULL,
    CSede int  NOT NULL,
    CONSTRAINT Estudiante_pk PRIMARY KEY  (CEstudiante)
);

-- Table: Etiqueta
CREATE TABLE Etiqueta (
    CEtiqueta int  NOT NULL,
    NEtiqueta nvarchar(255)  NOT NULL,
    CONSTRAINT Etiqueta_pk PRIMARY KEY  (CEtiqueta)
);

-- Table: Facultad
CREATE TABLE Facultad (
    CFacultad int  NOT NULL,
    NFacultad nvarchar(255)  NOT NULL,
    CONSTRAINT Facultad_pk PRIMARY KEY  (CFacultad)
);

-- Table: Grupo
CREATE TABLE Grupo (
    CGrupo int  NOT NULL,
    NGrupo nvarchar(255)  NOT NULL,
    CONSTRAINT Grupo_pk PRIMARY KEY  (CGrupo)
);

-- Table: Grupo_Estudiante
CREATE TABLE Grupo_Estudiante (
    CEstudiante int  NOT NULL,
    CGrupo int  NOT NULL,
    CONSTRAINT Grupo_Estudiante_pk PRIMARY KEY  (CEstudiante,CGrupo)
);

-- Table: Pregunta
CREATE TABLE Pregunta (
    CPregunta int  NOT NULL,
    NTitulo nvarchar(255)  NOT NULL,
    TContexto text  NULL,
    CEstudiante int  NOT NULL,
    CTema int  NOT NULL,
    CEtiqueta int  NOT NULL,
    CONSTRAINT Pregunta_pk PRIMARY KEY  (CPregunta)
);

-- Table: Respuesta
CREATE TABLE Respuesta (
    CRespuesta int  NOT NULL,
    CEstudiante int  NOT NULL,
    CPregunta int  NOT NULL,
    NCalificacion int  NOT NULL,
    TRespuesta text  NOT NULL,
    CONSTRAINT Respuesta_pk PRIMARY KEY  (CRespuesta,CEstudiante,CPregunta)
);

-- Table: Sede
CREATE TABLE Sede (
    CSede int  NOT NULL,
    NSede nvarchar(255)  NOT NULL,
    CUniversidad int  NOT NULL,
    CONSTRAINT Sede_pk PRIMARY KEY  (CSede)
);

-- Table: Tema
CREATE TABLE Tema (
    CTema int  NOT NULL,
    CCurso int  NOT NULL,
    NTema nvarchar(255)  NOT NULL,
    CONSTRAINT Tema_pk PRIMARY KEY  (CTema)
);

-- Table: Universidad
CREATE TABLE Universidad (
    CUniversidad int  NOT NULL,
    NUniversidad nvarchar(255)  NOT NULL,
    CONSTRAINT Universidad_pk PRIMARY KEY  (CUniversidad)
);

-- foreign keys
-- Reference: Carrera_Facultad (table: Carrera)
ALTER TABLE Carrera ADD CONSTRAINT Carrera_Facultad
    FOREIGN KEY (CFacultad)
    REFERENCES Facultad (CFacultad);

-- Reference: Carrera_Sede (table: Carrera)
ALTER TABLE Carrera ADD CONSTRAINT Carrera_Sede
    FOREIGN KEY (CSede)
    REFERENCES Sede (CSede);

-- Reference: Curso_Carrera (table: Curso)
ALTER TABLE Curso ADD CONSTRAINT Curso_Carrera
    FOREIGN KEY (CCarrera)
    REFERENCES Carrera (CCarrera);

-- Reference: Estudiante_Sede (table: Estudiante)
ALTER TABLE Estudiante ADD CONSTRAINT Estudiante_Sede
    FOREIGN KEY (CSede)
    REFERENCES Sede (CSede);

-- Reference: Grupo_Estudiante (table: Grupo_Estudiante)
ALTER TABLE Grupo_Estudiante ADD CONSTRAINT Grupo_Estudiante_Estudiante
    FOREIGN KEY (CEstudiante)
    REFERENCES Estudiante (CEstudiante);
	--ESTAAAAA^
-- Reference: Grupo_Estudiante_Grupo (table: Grupo_Estudiante)
ALTER TABLE Grupo_Estudiante ADD CONSTRAINT Grupo_Estudiante_Grupo
    FOREIGN KEY (CGrupo)
    REFERENCES Grupo (CGrupo);

-- Reference: Pregunta_Estudiante (table: Pregunta)
ALTER TABLE Pregunta ADD CONSTRAINT Pregunta_Estudiante
    FOREIGN KEY (CEstudiante)
    REFERENCES Estudiante (CEstudiante);

-- Reference: Pregunta_Etiqueta (table: Pregunta)
ALTER TABLE Pregunta ADD CONSTRAINT Pregunta_Etiqueta
    FOREIGN KEY (CEtiqueta)
    REFERENCES Etiqueta (CEtiqueta);

-- Reference: Pregunta_Tema (table: Pregunta)
ALTER TABLE Pregunta ADD CONSTRAINT Pregunta_Tema
    FOREIGN KEY (CTema)
    REFERENCES Tema (CTema);

-- Reference: Respuesta_Estudiante (table: Respuesta)
ALTER TABLE Respuesta ADD CONSTRAINT Respuesta_Estudiante
    FOREIGN KEY (CEstudiante)
    REFERENCES Estudiante (CEstudiante);

-- Reference: Respuesta_Pregunta (table: Respuesta)
ALTER TABLE Respuesta ADD CONSTRAINT Respuesta_Pregunta
    FOREIGN KEY (CPregunta)
    REFERENCES Pregunta (CPregunta);

-- Reference: Sede_Universidad (table: Sede)
ALTER TABLE Sede ADD CONSTRAINT Sede_Universidad
    FOREIGN KEY (CUniversidad)
    REFERENCES Universidad (CUniversidad);

-- Reference: Tema_Curso (table: Tema)
ALTER TABLE Tema ADD CONSTRAINT Tema_Curso
    FOREIGN KEY (CCurso)
    REFERENCES Curso (CCurso);

-- End of file.

