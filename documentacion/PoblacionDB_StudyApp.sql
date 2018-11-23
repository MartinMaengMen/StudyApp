use StudyApp3;

-- Tabla Grupo
insert into Grupo values (1, 'Grupo 1')
insert into Grupo values (2, 'Grupo 2')
insert into Grupo values (3, 'Grupo 3')
insert into Grupo values (4, 'Grupo 4')
insert into Grupo values (5, 'Grupo 5')


--Tabla Grupo_Estudiante

insert into Grupo_Estudiante values (1,1)
insert into Grupo_Estudiante values (2,1)
insert into Grupo_Estudiante values (3,1)
insert into Grupo_Estudiante values (4,1)
insert into Grupo_Estudiante values (5,1)
insert into Grupo_Estudiante values (1,2)
insert into Grupo_Estudiante values (9,2)
insert into Grupo_Estudiante values (8,2)
insert into Grupo_Estudiante values (7,2)

-- Tabla Universidad

insert into Universidad values (1, 'Universidad Peruana de Ciencias Aplicadas')
insert into Universidad values (2, 'Universidad Nacional de Ingenieria')
insert into Universidad values (3, 'Universidad de Lima')

-- Tabla Sede

insert into Sede values (1, 'San Isidro', 1)
insert into Sede values (2, 'Monterrico', 1)
insert into Sede values (3, 'San Miguel', 1)
insert into Sede values (4, 'Villa', 1)

-- Tabla Facultad

insert into Facultad values (1, 'Facultad de Ingenieria')
insert into Facultad values (2, 'Facultad de Negocios')
insert into Facultad values (3, 'Facultad de Derecho')
insert into Facultad values (4, 'Facultad de Diseño')
insert into Facultad values (5, 'Facultad de Ciencias de la Salud')
insert into Facultad values (6, 'Facultad de Psicologia')
insert into Facultad values (7, 'Facultad de Educacion')


--Tabla Carrera

insert into Carrera values (1, 'Ingenieria de Software', 1, 1)
insert into Carrera values (2, 'Ingenieria Civil', 1, 1)
insert into Carrera values (3, 'Ingenieria Mecatronica', 1, 3)
insert into Carrera values (4, 'Ingenieria Industrial', 1, 1)
insert into Carrera values (5, 'Ingenieria de Sistemas de Informacion', 1, 1)
insert into Carrera values (6, 'Ingenieria Electronica', 1, 2)
insert into Carrera values (7, 'Medicina', 4, 5)
insert into Carrera values (8, 'Psicologia', 2, 6)
insert into Carrera values (9, 'Ingenieria de Software', 1, 2)
insert into Carrera values (10, 'Ingenieria de Software', 1, 3)

--Tabla Curso GO

insert into Curso values (1, 'Programacion 1', 1, 1)
insert into Curso values (2, 'Diseño y Patrones de Software', 5, 1)
insert into Curso values (3, 'Diseño De Base De Datos', 4, 1)
insert into Curso values (4, 'Algoritmos y Estructura de Datos', 3, 1)
insert into Curso values (5, 'Complejidad Algoritmica', 6, 1)
insert into Curso values (6, 'Programacion 2', 2, 1)
insert into Curso values (7, 'Fisica 3', 5, 1)
insert into Curso values (8, 'IHC y Tecnologias Moviles', 4, 1)

--Tabla Tema

insert into Tema values (1, 2, 'Patron Adapter')
insert into Tema values (2, 2, 'Diagrama de Secuencia')
insert into Tema values (3, 2, 'Patron Factory')
insert into Tema values (4, 2, 'Patron Builder')
insert into Tema values (5, 2, 'Pruebas Unitarias')
insert into Tema values (6, 2, 'Diagrama de Clases')

--Tabla Etiqueta

insert into Etiqueta values (1, 'URGENTE')
insert into Etiqueta values (2, 'Trabajo Final')
insert into Etiqueta values (3, 'Evaluacion Virtual')
insert into Etiqueta values (4, 'Tarea')
insert into Etiqueta values (5, 'Trabajo')
insert into Etiqueta values (6, 'Trabajo Parcial')
insert into Etiqueta values (7, 'PC')
insert into Etiqueta values (8, 'Examenes Parciales')
insert into Etiqueta values (9, 'Examenes Finales')

--Tabla Estudiante

insert into Estudiante values (1, 'Kevin', 'Burga', 21, 79463513,'1234', 'kevinb@gmail.com', 1)
insert into Estudiante values (2, 'Andy', 'Eulogio', 19, 80645653,'1234', 'andye@gmail.com', 1)
insert into Estudiante values (3, 'Martin', 'Ng', 20, 80654648,'1234', 'martinn@gmail.com', 1)
insert into Estudiante values (4, 'Aldair', 'Cuarez', 19, 79688101,'1234', 'aldairc@gmail.com', 1)
insert into Estudiante values (5, 'Piero', 'Molina', 19, 79999842,'1234', 'pierom@gmail.com', 1)
insert into Estudiante values (6, 'Milagros', 'Basurto', 18, 79321456,'1234', 'milagrosb@gmail.com', 2)
insert into Estudiante values (7, 'Adriana', 'Gil', 21, 79951456,'1234', 'adrianag@gmail.com', 2)
insert into Estudiante values (8, 'Diego', 'Tapia', 20, 79789541,'1234', 'diegot@gmail.com', 2)
insert into Estudiante values (9, 'Victor', 'Baldeon', 21, 80123456,'1234', 'victorb@gmail.com', 2)
insert into Estudiante values (10, 'Julio', 'Cardenas', 18, 81128528,'1234', 'julioc@gmail.com', 3)
insert into Estudiante values (11, 'Emanuel', 'Gonzales', 20, 78951478,'1234', 'emanuelg@gmail.com', 3)
insert into Estudiante values (12, 'Alvaro', 'Toconas', 21, 78951654,'1234', 'alvarot@gmail.com', 3)
insert into Estudiante values (13, 'Marcelo', 'Rios', 20, 78621032,'1234', 'marcelor@gmail.com', 4)
insert into Estudiante values (14, 'Omar', 'Troncos', 22, 77951236,'1234', 'omart@gmail.com', 4)
insert into Estudiante values (15, 'Alex', 'Sipan', 22, 77102103,'1234', 'alexs@gmail.com', 4)
insert into Estudiante values (16, 'Mayra', 'Soto', 22, 77951234,'1234', 'mayras@gmail.com', 4)
insert into Estudiante values (17, 'Rodrigo', 'Rojas', 21, 76156321,'1234', 'rodrigor@gmail.com', 1)
insert into Estudiante values (18, 'Alejandro', 'Maldonado', 21, 76025064,'1234', 'alejandrom@gmail.com', 1)
insert into Estudiante values (19, 'Andres', 'Perez', 23, 76023152,'1234', 'andresp@gmail.com', 1)

-- Tabla Pregunta

insert into Pregunta values (1, '¿Videos con ejemplos del patron adapter?', 'para la pc2 de patrones', 1, 1, 7)
insert into Pregunta values (2, '¿El diagrama de secuencias viene para el examen final?', 'pasen ejemplos porfa', 2, 6, 9)
insert into Pregunta values (3, 'Alguien que ya haya visto patrones que pase ejemplos del patron adapter', '', 3, 4, 7)
insert into Pregunta values (4, '¿Los diagramas de clases vienen para el final?', '', 4, 2, 9)
insert into Pregunta values (5, '¿Las pruebas unitarias se incluyen en nuestro trabajo final?', '', 5, 5, 2)
insert into Pregunta values (6, '¿Para el examen final vienen conceptos de lo que hemos visto en el curso o solo práctica?', '', 1, 5, 9)

--Tabla Respuesta

insert into Respuesta values (1, 14, 2, 1, 'Tengo un amigo que ya llevó el curso aqui te dejo su correo: emanuelg@gmail.com')
insert into Respuesta values (2, 14, 2, 0, 'Aqui tengo otro: victorb@gmail.com')
insert into Respuesta values (3, 6, 5, 0, 'En una de las clases la profesora nos dijo que no estarán incluidos')
insert into Respuesta values (4, 18, 4, 0, 'No vienen')
insert into Respuesta values (5, 19, 3, 5, 'En estos links lo explican: 
				https://rootear.com/desarrollo/patron-adapter  
				https://www.youtube.com/watch?v=wGBeAx8Ocuw  
			http://migranitodejava.blogspot.com/2011/06/adapter.html
			https://programacion.net/articulo/patrones_de_diseno_vii_patrones_estructurales_adapter_1008')



