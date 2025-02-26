DROP DATABASE IF EXISTS SPORTTRACKER;
CREATE DATABASE SPORTTRACKER;
USE SPORTTRACKER;


CREATE TABLE DEPORTE (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(25) UNIQUE,
    NUMEROJUGADORES INTEGER NOT NULL,
    DESCRIPCION VARCHAR(600) NOT NULL,
    EMPATABLE BOOL DEFAULT TRUE,
    SOLICITUD BOOL DEFAULT FALSE,
    IMAGEN LONGBLOB  
);

CREATE TABLE USUARIO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    USUARIO VARCHAR(25) UNIQUE,
    CONTRASENA VARBINARY(100) NOT NULL, 
    NOMBRE VARCHAR(50) NOT NULL, 
    DNI VARCHAR(9) NOT NULL UNIQUE,
    FECHANACIMIENTO DATE NOT NULL,
    DENUNCIAS INT DEFAULT 0 NOT NULL
);



CREATE TABLE ROL (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(25) UNIQUE
);

INSERT INTO ROL (NOMBRE) VALUES ("Administrador");
INSERT INTO ROL (NOMBRE) VALUES ("Capitan");
INSERT INTO ROL (NOMBRE) VALUES ("Usuario");
INSERT INTO ROL (NOMBRE) VALUES ("Miembro");

CREATE TABLE INSCRIPCION (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_USUARIO INTEGER NOT NULL,
    ID_DEPORTE INTEGER,
    ID_ROL INTEGER NOT NULL,
    FECHAINSCRIPCION DATE NOT NULL,

    CONSTRAINT UQ_INSCRIPCION_USUARIO_DEPORTE_ROL
    UNIQUE (ID_USUARIO, ID_DEPORTE, ID_ROL),

    CONSTRAINT FK_INSCRIPCION_USUARIO
    FOREIGN KEY (ID_USUARIO)
    REFERENCES USUARIO (ID) ON DELETE CASCADE,

    CONSTRAINT FK_INSCRIPCION_DEPORTE
    FOREIGN KEY (ID_DEPORTE)
    REFERENCES DEPORTE (ID) ON DELETE CASCADE,

    CONSTRAINT FK_INSCRIPCION_ROL
    FOREIGN KEY (ID_ROL)
    REFERENCES ROL (ID) ON DELETE CASCADE
);

DELIMITER //

CREATE PROCEDURE INSCRIBIRUSUARIO(
    IN p_usuario VARCHAR(25),
    IN p_deporte VARCHAR(25)
)
BEGIN
    DECLARE v_usuario_id INT;
    DECLARE v_deporte_id INT;
    DECLARE v_rol_id INT;

    -- Obtener el ID del usuario
    SELECT ID INTO v_usuario_id FROM USUARIO WHERE USUARIO = p_usuario;

    -- Obtener el ID del deporte
    SELECT ID INTO v_deporte_id FROM DEPORTE WHERE NOMBRE = p_deporte;

    -- Obtener el ID del rol de usuario
    SELECT ID INTO v_rol_id FROM ROL WHERE NOMBRE = 'Usuario';

    -- Verificar si ya existe una inscripción para este usuario en este deporte
    IF NOT EXISTS (
        SELECT 1 FROM INSCRIPCION 
        WHERE ID_USUARIO = v_usuario_id 
        AND ID_DEPORTE = v_deporte_id
    ) THEN
        -- Si no hay ninguna inscripción, agregar una nueva
        INSERT INTO INSCRIPCION (ID_USUARIO, ID_DEPORTE, ID_ROL, FECHAINSCRIPCION)
        VALUES (v_usuario_id, v_deporte_id, v_rol_id, CURDATE());
    END IF;
END //

DELIMITER ;

DELIMITER //
CREATE TRIGGER trg_after_insert_usuario
AFTER INSERT ON USUARIO
FOR EACH ROW
BEGIN
    INSERT INTO INSCRIPCION (ID_USUARIO, ID_ROL, FECHAINSCRIPCION)
    VALUES (NEW.ID, (SELECT ID FROM ROL WHERE NOMBRE = 'Usuario'), CURDATE());
END;
//
DELIMITER ;

INSERT INTO USUARIO (USUARIO, CONTRASENA, NOMBRE, DNI, FECHANACIMIENTO) VALUES("admin", "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918", "admin", "000000000", "2002-06-15");
INSERT INTO INSCRIPCION (ID_USUARIO, ID_ROL, FECHAINSCRIPCION) VALUES ((SELECT ID FROM USUARIO WHERE NOMBRE = 'admin'), (SELECT ID FROM ROL WHERE NOMBRE = 'Administrador'), CURDATE());


CREATE TABLE EQUIPO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(30) UNIQUE,
    ID_DEPORTE INTEGER NOT NULL,
    ID_CAPITAN INTEGER,
    IMAGEN LONGBLOB NOT NULL,
    ACTIVO BOOL NOT NULL DEFAULT TRUE,
    DISPONIBLE BOOL NOT NULL DEFAULT TRUE,
    LOCALIZACION VARCHAR(100) NOT NULL,    
    LATITUD DECIMAL(9,6) , 
    LONGITUD DECIMAL(9,6) ,

    CONSTRAINT FK_EQUIPO_DEPORTE
    FOREIGN KEY (ID_DEPORTE)
    REFERENCES DEPORTE (ID) ON DELETE CASCADE,

    CONSTRAINT FK_EQUIPO_USUARIO
    FOREIGN KEY (ID_CAPITAN)
    REFERENCES USUARIO (ID)
);

DELIMITER //
-- Trigger despues de eliminar un usuario
CREATE TRIGGER after_delete_usuario
BEFORE DELETE
ON USUARIO FOR EACH ROW
BEGIN
    -- Actualizar equipos donde el usuario era el capitan
    UPDATE EQUIPO
    SET ID_CAPITAN = NULL, ACTIVO = FALSE, DISPONIBLE = FALSE
    WHERE ID_CAPITAN = OLD.ID;
END;
//
DELIMITER ;


CREATE TABLE MIEMBROSEQUIPO (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_MIEMBRO INTEGER NOT NULL,
    ID_EQUIPO INTEGER NOT NULL, 

    CONSTRAINT UQ_MIEMBROSEQUIPO
    UNIQUE (ID_MIEMBRO, ID_EQUIPO),

    CONSTRAINT FK_MIEMBROSEQUIPO_EQUIPO
    FOREIGN KEY (ID_EQUIPO)
    REFERENCES EQUIPO (ID) ON DELETE CASCADE,

    CONSTRAINT FK_MIEMBROSEQUIPO_USUARIO
    FOREIGN KEY (ID_MIEMBRO)
    REFERENCES USUARIO (ID) ON DELETE CASCADE
);

DELIMITER //

CREATE PROCEDURE ACTUALIZAREQUIPO(
IN EQUIPONOMBRE VARCHAR(255))
BEGIN
    DECLARE JUGADORESCOUNT INT;
    DECLARE MAXJUGADORES INT;
    DECLARE EQUIPOID INT;
    
    -- Obtener el ID del equipo
    SELECT ID INTO EQUIPOID FROM EQUIPO WHERE NOMBRE = EQUIPONOMBRE;
    
    -- Obtener el número de jugadores en el equipo
    SELECT COUNT(*) INTO JUGADORESCOUNT FROM MIEMBROSEQUIPO WHERE ID_EQUIPO = EQUIPOID;
    
    -- Obtener el número máximo de jugadores permitidos para el deporte del equipo
    SELECT NUMEROJUGADORES INTO MAXJUGADORES FROM DEPORTE D JOIN EQUIPO E ON D.ID = E.ID_DEPORTE WHERE E.ID = EQUIPOID;
    
    -- Comprobar y actualizar la disponibilidad del equipo
    IF JUGADORESCOUNT < MAXJUGADORES * 2 THEN
        UPDATE EQUIPO SET DISPONIBLE = TRUE WHERE ID = EQUIPOID;
    ELSE
        UPDATE EQUIPO SET DISPONIBLE = FALSE WHERE ID = EQUIPOID;
    END IF;
    
END//

DELIMITER ;



DELIMITER //

CREATE PROCEDURE AGREGAR_EQUIPO(
    IN nombre_equipo_insertar VARCHAR(255),
    IN id_deporte_insertar INT,
    IN id_capitan_insertar INT,
    IN imagen_equipo LONGBLOB,
    IN ubicacion_equipo VARCHAR(100),
    IN latitud_equipo DECIMAL(9,6),
    IN longitud_equipo DECIMAL(9,6)
)
BEGIN
    DECLARE deporte_existente INT;
    DECLARE usuario_valido INT;
    DECLARE equipo_existente INT;
    DECLARE equipo_id INT;
    DECLARE deporte_id INT;

    -- Verificar si el deporte existe
    SELECT COUNT(*) INTO deporte_existente FROM DEPORTE WHERE ID = id_deporte_insertar;

    -- Verificar si el usuario esta inscrito en el mismo deporte y no tiene un rol de miembro o capitan
    SELECT COUNT(*) INTO usuario_valido FROM INSCRIPCION
    WHERE ID_USUARIO = id_capitan_insertar AND ID_DEPORTE = id_deporte_insertar AND ID_ROL IN (SELECT ID FROM ROL WHERE NOMBRE IN ('Miembro', 'Capitan'));

    -- Verificar si el equipo ya existe
    SELECT COUNT(*) INTO equipo_existente FROM EQUIPO WHERE NOMBRE = nombre_equipo_insertar;

    -- Insertar al usuario en MIEMBROSEQUIPO y la inscripcion con rol de capitan si todo es correcto y el equipo no existe
    IF deporte_existente = 1 AND usuario_valido = 0 AND equipo_existente = 0 THEN
        -- Insertar el equipo
        INSERT INTO EQUIPO (NOMBRE, ID_DEPORTE, ID_CAPITAN, IMAGEN, LOCALIZACION, LATITUD, LONGITUD)
        VALUES (nombre_equipo_insertar, id_deporte_insertar, id_capitan_insertar, imagen_equipo,ubicacion_equipo,latitud_equipo,longitud_equipo);

        -- Obtener el ID del nuevo equipo
        SELECT ID INTO equipo_id FROM EQUIPO WHERE NOMBRE = nombre_equipo_insertar;

        -- Insertar el usuario en MIEMBROSEQUIPO
        INSERT INTO MIEMBROSEQUIPO (ID_MIEMBRO, ID_EQUIPO)
        VALUES (id_capitan_insertar, equipo_id);

        -- Insertar una nueva inscripcion con rol de capitan
        INSERT INTO INSCRIPCION (ID_USUARIO, ID_DEPORTE, ID_ROL, FECHAINSCRIPCION)
        VALUES (id_capitan_insertar, id_deporte_insertar, (SELECT ID FROM ROL WHERE NOMBRE = 'Capitan'), CURDATE());

        
        -- CALL ACTUALIZAREQUIPO();
    ELSE
        -- Mostrar mensaje de error
        SELECT 'Error: Verifique que el deporte existe, el usuario es valido y el equipo no existe.' AS Mensaje;
        
    END IF;
END;

//
DELIMITER ;





CREATE TABLE COMPETICION (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(50) UNIQUE, 
    ID_DEPORTE INTEGER NOT NULL,
    NEQUIPOS INTEGER NOT NULL, -- controlar sea multiplo de 2 para liga y potencia de 2 para torneo
    -- NGESTORES INTEGER,
    ID_EQUIPO_GANADOR INTEGER,
    LOCALIDAD VARCHAR(100) NOT NULL,
    ID_CREADOR INTEGER,
    FECHA_COMIENZO DATE NOT NULL,
    TIPO INTEGER NOT NULL, -- 0 LIGA 1 TORNEO
    RONDA INTEGER DEFAULT -1,
    DISPONIBLE BOOLEAN DEFAULT TRUE,
    LATITUD DECIMAL(9,6) , 
    LONGITUD DECIMAL(9,6),

    CONSTRAINT FK_COMPETICION_USUARIO
    FOREIGN KEY (ID_CREADOR)
    REFERENCES USUARIO (ID),

    CONSTRAINT FK_COMPETICION_DEPORTE
    FOREIGN KEY (ID_DEPORTE)
    REFERENCES DEPORTE (ID) ON DELETE CASCADE,

    CONSTRAINT FK_COMPETICION_EQUIPO
    FOREIGN KEY (ID_EQUIPO_GANADOR)
    REFERENCES EQUIPO (ID)
);

DELIMITER //
CREATE TRIGGER before_delete_usuario
BEFORE DELETE ON USUARIO
FOR EACH ROW
BEGIN
    UPDATE COMPETICION
    SET ID_CREADOR = NULL
    WHERE ID_CREADOR = OLD.ID;
END;
//
DELIMITER ;




CREATE TABLE COMPETIDORES (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_COMPETICION INTEGER NOT NULL,
    ID_EQUIPO INTEGER NOT NULL,

    CONSTRAINT UQ_COMPETIDORES
    UNIQUE (ID_COMPETICION, ID_EQUIPO),

    CONSTRAINT FK_COMPETIDORES_COMPETICION
    FOREIGN KEY (ID_COMPETICION)
    REFERENCES COMPETICION (ID) ON DELETE CASCADE,

    CONSTRAINT FK_COMPETIDORES_EQUIPO
    FOREIGN KEY (ID_EQUIPO)
    REFERENCES EQUIPO (ID) ON DELETE CASCADE
);

 CREATE TABLE MIEMBROSCOMPETICION (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_COMPETIDORES INTEGER NOT NULL,
    ID_MIEMBROSEQUIPO INTEGER NOT NULL,

    CONSTRAINT UQ_MIEMBROSCOMPETICION
    UNIQUE (ID_COMPETIDORES, ID_MIEMBROSEQUIPO),

    CONSTRAINT FK_MIEMBROSCOMPETICION_COMPETIDORES
    FOREIGN KEY (ID_COMPETIDORES)
    REFERENCES COMPETIDORES (ID) ON DELETE CASCADE,

    CONSTRAINT FK_MIEMBROSCOMPETICION_MIEMBROSEQUIPO
    FOREIGN KEY (ID_MIEMBROSEQUIPO)
    REFERENCES MIEMBROSEQUIPO (ID) ON DELETE CASCADE
);

DELIMITER //
CREATE TRIGGER INSERT_COMPETIDOR
AFTER INSERT ON COMPETIDORES
FOR EACH ROW
BEGIN
    -- Insertar los miembros del equipo en la tabla MIEMBROSEQUIPO
    INSERT INTO MIEMBROSCOMPETICION (ID_COMPETIDORES, ID_MIEMBROSEQUIPO)
    SELECT NEW.ID , M.ID
    FROM MIEMBROSEQUIPO M
    WHERE M.ID_EQUIPO = NEW.ID_EQUIPO;
END;
//
DELIMITER ;

DELIMITER //

CREATE FUNCTION CREAR_COMPETICION (
    nombre_competicion VARCHAR(50),
    id_deporte VARCHAR(50),
    numero_equipos INT,
    localidad VARCHAR(150),
    usuario_creador VARCHAR(50),
    fecha_comienzo DATE,
    tipo_competicion INT,
    latitud DECIMAL(9,6),
    longitud DECIMAL(9,6),
    nombre_equipo VARCHAR(30)
) RETURNS VARCHAR(255) DETERMINISTIC
BEGIN
    DECLARE competicion_existente INT;
    DECLARE equipo_id INT;
    DECLARE competicion_id INT;
    DECLARE mensaje VARCHAR(255);

    -- Verificar si ya existe una competición con el mismo nombre
    SELECT COUNT(*) INTO competicion_existente FROM COMPETICION WHERE NOMBRE = nombre_competicion;

    IF competicion_existente = 0 THEN
        -- Insertar la competición
        INSERT INTO COMPETICION (NOMBRE, ID_DEPORTE, NEQUIPOS, LOCALIDAD, ID_CREADOR, FECHA_COMIENZO, TIPO, LATITUD, LONGITUD)
        VALUES (nombre_competicion, (SELECT ID FROM DEPORTE WHERE NOMBRE = id_deporte  ), numero_equipos, localidad, (SELECT ID FROM USUARIO WHERE USUARIO = usuario_creador  ), fecha_comienzo, tipo_competicion, latitud, longitud);

        -- Obtener el ID de la nueva competición
        SELECT ID INTO competicion_id FROM COMPETICION WHERE NOMBRE = nombre_competicion;

        -- Verificar si el equipo ya existe
        SELECT ID INTO equipo_id FROM EQUIPO WHERE NOMBRE = nombre_equipo;

        IF equipo_id IS NOT NULL THEN
            -- Insertar el equipo como competidor
            INSERT INTO COMPETIDORES (ID_COMPETICION, ID_EQUIPO)
            VALUES (competicion_id, equipo_id);
            SET mensaje := 'EXITO';
        ELSE
            SET mensaje := 'ERROR_EQUIPO';
        END IF;
    ELSE
        SET mensaje := 'ERROR_COMPETICION';
    END IF;

    RETURN mensaje;
END;
 //DELIMITER ;
 
 DELIMITER //

CREATE PROCEDURE VerificarCompetencia(IN nombreCompetencia VARCHAR(50))
BEGIN
    DECLARE competenciaID INT;
    DECLARE numEquipos INT;

    -- Obtener el ID de la competición
    SELECT ID INTO competenciaID FROM COMPETICION WHERE NOMBRE = nombreCompetencia;

    -- Contar el número de equipos competidores para la competición
    SELECT COUNT(*) INTO numEquipos FROM COMPETIDORES WHERE ID_COMPETICION = competenciaID;

    -- Si no hay equipos competidores, eliminar la competición
    IF numEquipos = 0 THEN
        DELETE FROM COMPETICION WHERE ID = competenciaID;
    
    -- Si el número de equipos competidores es igual al número de equipos de la competición, marcar como no disponible
    ELSEIF numEquipos = (SELECT NEQUIPOS FROM COMPETICION WHERE ID = competenciaID) THEN
        UPDATE COMPETICION SET DISPONIBLE = FALSE WHERE ID = competenciaID;
    
    -- Si no, marcar como disponible
    ELSE
        UPDATE COMPETICION SET DISPONIBLE = TRUE WHERE ID = competenciaID;
    END IF;
END; 

//DELIMITER ;



CREATE TABLE NOTICIA (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    ID_COMPETICION INTEGER NOT NULL UNIQUE,
    FECHA DATE NOT NULL,
    HORA TIME NOT NULL,

    CONSTRAINT FK_NOTICIA_COMPETICION
    FOREIGN KEY (ID_COMPETICION)
    REFERENCES COMPETICION (ID) ON DELETE CASCADE
);

DELIMITER //

CREATE TRIGGER competicion_actualizacion
AFTER UPDATE ON COMPETICION
FOR EACH ROW
BEGIN
    DECLARE equipo_existente INT;

    -- Verificar si ID_EQUIPO_GANADOR ha sido modificado
    IF NEW.ID_EQUIPO_GANADOR IS NOT NULL  THEN
        -- Comprobar la existencia del equipo ganador en COMPETIDORES
        SELECT COUNT(*) INTO equipo_existente FROM COMPETIDORES C
        WHERE C.ID_COMPETICION = NEW.ID AND C.ID_EQUIPO = NEW.ID_EQUIPO_GANADOR;

        -- Verificar si el equipo ganador ha sido actualizado
        IF NEW.ID_EQUIPO_GANADOR IS NOT NULL AND equipo_existente = 1 THEN
            DELETE FROM NOTICIA WHERE ID_COMPETICION = NEW.ID;
            INSERT INTO NOTICIA (ID_COMPETICION, FECHA, HORA) VALUES (NEW.ID, CURDATE(), CURTIME());
        ELSE
            -- Si el equipo no existe en COMPETIDORES, mostrar un mensaje de error o tomar alguna accion adecuada
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'El equipo ganador no esta inscrito en la competicion.';
        END IF;
    END IF;
END;
//

DELIMITER ;



CREATE TABLE COMENTARIO(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    ID_NOTICIA INTEGER NOT NULL, 
    TEXTO VARCHAR(100) NOT NULL,
    ID_USUARIO INTEGER NOT NULL,  
    FECHA DATE NOT NULL,
    HORA TIME NOT NULL,
    DENUNCIADO BOOLEAN NOT NULL DEFAULT FALSE,

    CONSTRAINT FK_COMENTARIO_NOTICIA
    FOREIGN KEY (ID_NOTICIA)
    REFERENCES NOTICIA (ID) ON DELETE CASCADE,

    CONSTRAINT FK_COMENTARIO_USUARIO
    FOREIGN KEY (ID_USUARIO)
    REFERENCES USUARIO (ID) ON DELETE CASCADE
);

DELIMITER //
CREATE TRIGGER DENUNCIA_COMENTARIO
BEFORE DELETE ON COMENTARIO FOR EACH ROW
BEGIN
    DECLARE usuarioId INT;
    
    -- Obtener el ID del usuario asociado al comentario eliminado
    SELECT ID_USUARIO INTO usuarioId FROM COMENTARIO WHERE ID = OLD.ID;
    
    -- Incrementar el numero de denuncias del usuario si el comentario estaba denunciado
    IF OLD.DENUNCIADO = TRUE THEN
        UPDATE USUARIO SET DENUNCIAS = DENUNCIAS + 1 WHERE ID = usuarioId;
    END IF;
END;
//
DELIMITER ;

CREATE TABLE INFORMAL(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    FECHA DATE NOT NULL,
    HORA VARCHAR(5) NOT NULL,
    LOCALIZACION VARCHAR(100) NOT NULL,    
    ID_DEPORTE INTEGER NOT NULL,
    LATITUD DECIMAL(9,6) , 
    LONGITUD DECIMAL(9,6),
    DISPONIBLE BOOL DEFAULT TRUE,

    CONSTRAINT FK_INFORMAL_DEPORTE
    FOREIGN KEY (ID_DEPORTE)
    REFERENCES DEPORTE (ID) ON DELETE CASCADE
);

CREATE TABLE JUGADORESINFORMAL (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    ID_INFORMAL INTEGER NOT NULL,
    ID_USUARIO INTEGER NOT NULL,

    CONSTRAINT UQ_JUGADORESINFORMAL
    UNIQUE (ID_INFORMAL, ID_USUARIO),

    CONSTRAINT FK_JUGADORESINFORMAL_INFORMAL
    FOREIGN KEY (ID_INFORMAL)
    REFERENCES INFORMAL (ID) ON DELETE CASCADE,

    CONSTRAINT FK_JUGADORESINFORMAL_USUARIO
    FOREIGN KEY (ID_USUARIO)
    REFERENCES USUARIO (ID) ON DELETE CASCADE
);


DELIMITER //
CREATE TRIGGER after_insert_jugadoresinformal
AFTER INSERT ON JUGADORESINFORMAL
FOR EACH ROW
BEGIN
    DECLARE jugadores_count INT;
    DECLARE max_jugadores INT;
    DECLARE informal_id INT;
    
    -- Obtener el numero actual de jugadores para el ID_INFORMAL insertado
    SELECT COUNT(*) INTO jugadores_count FROM JUGADORESINFORMAL WHERE ID_INFORMAL = NEW.ID_INFORMAL;
    
    -- Obtener el numero maximo de jugadores para el deporte de este informal
    SELECT NUMEROJUGADORES INTO max_jugadores FROM DEPORTE D JOIN INFORMAL I ON D.ID = I.ID_DEPORTE WHERE I.ID = NEW.ID_INFORMAL;
    
    -- Obtener el ID del informal para actualizar el DISPONIBLE
    SELECT ID_INFORMAL INTO informal_id FROM JUGADORESINFORMAL WHERE ID = NEW.ID;
    
    -- Si el numero de jugadores alcanza el maximo, actualizar DISPONIBLE a FALSE
    IF jugadores_count = (max_jugadores*2) THEN
        UPDATE INFORMAL SET DISPONIBLE = FALSE WHERE ID = informal_id;
    ELSE
        -- Si se añade un jugador y no alcanza el maximo, actualizar DISPONIBLE a TRUE
        UPDATE INFORMAL SET DISPONIBLE = TRUE WHERE ID = informal_id;
    END IF;
END
//
DELIMITER ;

DELIMITER //
CREATE TRIGGER after_delete_jugadoresinformal
AFTER DELETE ON JUGADORESINFORMAL
FOR EACH ROW
BEGIN
    DECLARE jugadores_count INT;
    DECLARE max_jugadores INT;
    DECLARE informal_id INT;
    
    -- Obtener el numero actual de jugadores para el ID_INFORMAL afectado
    SELECT COUNT(*) INTO jugadores_count FROM JUGADORESINFORMAL WHERE ID_INFORMAL = OLD.ID_INFORMAL;
    
    -- Obtener el numero maximo de jugadores para el deporte de este informal
    SELECT NUMEROJUGADORES INTO max_jugadores FROM DEPORTE D JOIN INFORMAL I ON D.ID = I.ID_DEPORTE WHERE I.ID = OLD.ID_INFORMAL;
    
    -- Obtener el ID del informal para actualizar DISPONIBLE
    SET informal_id = OLD.ID_INFORMAL;
    
    -- Si el numero de jugadores alcanza 0, eliminar el informal
    IF jugadores_count = 0 THEN
        DELETE FROM INFORMAL WHERE ID = informal_id;
    ELSE
        -- Si quedan jugadores, actualizar DISPONIBLE a TRUE
        UPDATE INFORMAL SET DISPONIBLE = TRUE WHERE ID = informal_id;
    END IF;
END;
//
DELIMITER ;




CREATE TABLE AMISTOSO(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    FECHA DATE NOT NULL,
    HORA VARCHAR(5) NOT NULL,
    LOCALIZACION VARCHAR(100) NOT NULL,
    ID_DEPORTE INTEGER NOT NULL,
    ID_EQUIPO1 INTEGER ,
    ID_EQUIPO2 INTEGER ,
    PUNTOS_EQUIPO1 INTEGER NOT NULL DEFAULT -1,
    PUNTOS_EQUIPO2 INTEGER NOT NULL DEFAULT -1,
    LATITUD DECIMAL(9,6) , 
    LONGITUD DECIMAL(9,6) , 
    DISPONIBLE BOOLEAN DEFAULT TRUE,

    CONSTRAINT FK_AMISTOSO_DEPORTE
    FOREIGN KEY (ID_DEPORTE)
    REFERENCES DEPORTE (ID) ON DELETE CASCADE,

    CONSTRAINT FK_AMISTOSO_EQUIPO1
    FOREIGN KEY (ID_EQUIPO1)
    REFERENCES EQUIPO (ID) ON DELETE CASCADE,

    CONSTRAINT FK_AMISTOSO_EQUIPO2
    FOREIGN KEY (ID_EQUIPO2)
    REFERENCES EQUIPO (ID) ON DELETE CASCADE
);

CREATE TABLE JORNADA(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT, 
    ID_COMPETICION INTEGER NOT NULL,
    EQUIPOSRESTANTES INTEGER NOT NULL,
    FECHA DATE NOT NULL,
    HORA VARCHAR(5) NOT NULL,
    LOCALIZACION VARCHAR(100) NOT NULL,
    ID_EQUIPO1 INTEGER NOT NULL,
    ID_EQUIPO2 INTEGER NOT NULL,
    PUNTOS_EQUIPO1 INTEGER DEFAULT NULL,
    PUNTOS_EQUIPO2 INTEGER DEFAULT NULL,
    LATITUD DECIMAL(9,6), 
    LONGITUD DECIMAL(9,6), 

    CONSTRAINT FK_JORNADA_COMPETICION
    FOREIGN KEY (ID_COMPETICION)
    REFERENCES COMPETICION (ID) ON DELETE CASCADE,

    CONSTRAINT FK_JORNADA_EQUIPO1
    FOREIGN KEY (ID_EQUIPO1)
    REFERENCES EQUIPO (ID),

    CONSTRAINT FK_JORNADA_EQUIPO2
    FOREIGN KEY (ID_EQUIPO2)
    REFERENCES EQUIPO (ID)
);

DELIMITER //

CREATE PROCEDURE ELIMINAR_EQUIPO(IN nombreEquipo VARCHAR(30))
BEGIN
    DECLARE equipoID INT;
    DECLARE fechaHoraActual DATETIME;
    
    SET fechaHoraActual = NOW();
    
    -- Obtener el ID del equipo dado el nombre proporcionado
    SELECT ID INTO equipoID FROM EQUIPO WHERE NOMBRE = nombreEquipo;

    -- Eliminar todos los miembros del equipo dado su ID
    DELETE FROM MIEMBROSEQUIPO WHERE ID_EQUIPO = equipoID;
    
    -- Modificar los amistosos con ID_EQUIPO1 igual al ID del equipo eliminado
    -- y cuya fecha y hora sean anteriores a la fecha y hora actual
    UPDATE AMISTOSO
    SET PUNTOS_EQUIPO1 = 1, PUNTOS_EQUIPO2 = 0
    WHERE ID_EQUIPO1 = equipoID AND CONCAT(FECHA, ' ', HORA) < fechaHoraActual AND PUNTOS_EQUIPO1 = -1;

    -- Modificar los amistosos con ID_EQUIPO2 igual al ID del equipo eliminado
    -- y cuya fecha y hora sean anteriores a la fecha y hora actual
    UPDATE AMISTOSO
    SET PUNTOS_EQUIPO1 = 0, PUNTOS_EQUIPO2 = 1
    WHERE ID_EQUIPO2 = equipoID AND CONCAT(FECHA, ' ', HORA) < fechaHoraActual AND PUNTOS_EQUIPO2 = -1;

    -- Modificar los amistosos con fecha posterior a la fecha y hora actual
    -- donde el equipo eliminado es el ID_EQUIPO1
    UPDATE AMISTOSO
    SET ID_EQUIPO1 = NULL , DISPONIBLE = FALSE , ID_EQUIPO2 = NULL
    WHERE ID_EQUIPO1 = equipoID AND CONCAT(FECHA, ' ', HORA) > fechaHoraActual;

    -- Modificar los amistosos con fecha posterior a la fecha y hora actual
    -- donde el equipo eliminado es el ID_EQUIPO2
    UPDATE AMISTOSO
    SET ID_EQUIPO2 = NULL , DISPONIBLE = TRUE
    WHERE ID_EQUIPO2 = equipoID AND CONCAT(FECHA, ' ', HORA) > fechaHoraActual;

    -- Eliminar participación del equipo en jornadas futuras
    DELETE FROM JORNADA
    WHERE (ID_EQUIPO1 = equipoID OR ID_EQUIPO2 = equipoID) AND FECHA > fechaHoraActual;

    -- Marcar la competición como disponible si aún no ha comenzado y el equipo ha sido eliminado
    UPDATE COMPETICION
    SET DISPONIBLE = TRUE
    WHERE ID IN (SELECT ID_COMPETICION FROM COMPETIDORES WHERE ID_EQUIPO = equipoID) 
    AND FECHA_COMIENZO > fechaHoraActual;
    
    -- Eliminar participación del equipo en competiciones futuras
    DELETE FROM COMPETIDORES
    WHERE ID_EQUIPO = equipoID AND ID_COMPETICION IN (SELECT ID FROM COMPETICION WHERE FECHA_COMIENZO > fechaHoraActual);

    
    
    -- Modificar el equipo para establecer ID_CAPITAN, ACTIVO y DISPONIBLE como NULL
    UPDATE EQUIPO 
    SET ID_CAPITAN = NULL, ACTIVO = FALSE, DISPONIBLE = FALSE 
    WHERE NOMBRE = nombreEquipo;
END//

DELIMITER ;

CREATE VIEW VISTA_LIGA AS
SELECT
    C.NOMBRE AS COMPETICION,
    E.NOMBRE AS EQUIPO,
    D.NOMBRE AS DEPORTE,
    D.IMAGEN AS IMAGEN_DEPORTE,
    COUNT(CASE WHEN J.PUNTOS_EQUIPO1 IS NOT NULL AND J.PUNTOS_EQUIPO2 IS NOT NULL
           THEN J.ID END) AS PARTIDOS_JUGADOS,
    COUNT(CASE WHEN (COALESCE(J.PUNTOS_EQUIPO1, 0) > COALESCE(J.PUNTOS_EQUIPO2, 0) AND J.ID_EQUIPO1 = E.ID) OR
                    (COALESCE(J.PUNTOS_EQUIPO2, 0) > COALESCE(J.PUNTOS_EQUIPO1, 0) AND J.ID_EQUIPO2 = E.ID)
               THEN 1 END) AS PARTIDOS_GANADOS,
    COUNT(CASE WHEN J.PUNTOS_EQUIPO1 IS NOT NULL AND J.PUNTOS_EQUIPO2 IS NOT NULL AND (
                    COALESCE(J.PUNTOS_EQUIPO1, 0) = COALESCE(J.PUNTOS_EQUIPO2, 0) AND
                    ((J.ID_EQUIPO1 = E.ID AND D.EMPATABLE = TRUE) OR
                     (J.ID_EQUIPO2 = E.ID AND D.EMPATABLE = TRUE)))
               THEN 1 END) AS PARTIDOS_EMPATADOS,
    COUNT(CASE WHEN (COALESCE(J.PUNTOS_EQUIPO1, 0) < COALESCE(J.PUNTOS_EQUIPO2, 0) AND J.ID_EQUIPO1 = E.ID) OR
                    (COALESCE(J.PUNTOS_EQUIPO2, 0) < COALESCE(J.PUNTOS_EQUIPO1, 0) AND J.ID_EQUIPO2 = E.ID)
               THEN 1 END) AS PARTIDOS_PERDIDOS
FROM EQUIPO E
LEFT JOIN COMPETIDORES CO ON E.ID = CO.ID_EQUIPO
LEFT JOIN COMPETICION C ON CO.ID_COMPETICION = C.ID
LEFT JOIN JORNADA J ON C.ID = J.ID_COMPETICION AND (E.ID = J.ID_EQUIPO1 OR E.ID = J.ID_EQUIPO2)
LEFT JOIN DEPORTE D ON C.ID_DEPORTE = D.ID
WHERE C.TIPO = 0 -- Tipo 0 para competiciones de liga
GROUP BY C.NOMBRE, E.NOMBRE, D.NOMBRE, D.IMAGEN, D.EMPATABLE
ORDER BY PARTIDOS_GANADOS DESC, PARTIDOS_PERDIDOS ASC;





CREATE VIEW FINALTORNEO AS
SELECT 
    J.ID AS JornadaID,
    C.NOMBRE AS NombreCompeticion,
    D.NOMBRE AS NombreDeporte,
    D.IMAGEN AS ImagenDeporte,
    J.FECHA,
    J.EQUIPOSRESTANTES,
    E1.NOMBRE AS Equipo1,
    E1.IMAGEN AS FotoEquipo1,
    E2.NOMBRE AS Equipo2,
    E2.IMAGEN AS FotoEquipo2,
    IFNULL(J.PUNTOS_EQUIPO1, -1) AS Puntos1,
    IFNULL(J.PUNTOS_EQUIPO2, -1) AS Puntos2
FROM 
    JORNADA J
JOIN (
    SELECT 
        ID_COMPETICION, 
        MIN(EQUIPOSRESTANTES) AS MinEquiposRestantes
    FROM 
        JORNADA
    GROUP BY 
        ID_COMPETICION
) MJ ON J.ID_COMPETICION = MJ.ID_COMPETICION AND J.EQUIPOSRESTANTES = MJ.MinEquiposRestantes
JOIN 
    COMPETICION C ON J.ID_COMPETICION = C.ID
JOIN 
    EQUIPO E1 ON J.ID_EQUIPO1 = E1.ID
JOIN 
    EQUIPO E2 ON J.ID_EQUIPO2 = E2.ID
JOIN 
    DEPORTE D ON C.ID_DEPORTE = D.ID
WHERE 
    C.TIPO = 1;




CREATE OR REPLACE VIEW ESTADISTICAS_USUARIO_DEPORTE AS
SELECT
    D.NOMBRE AS DEPORTE,
    U.USUARIO AS USUARIO,
    MAX(E.NOMBRE) AS EQUIPO,  
    MAX(E.IMAGEN) AS ESCUDO ,
    COUNT(DISTINCT JI.ID) AS INFORMALES,
    COUNT(DISTINCT A.ID) AS AMISTOSOS,
    COUNT(DISTINCT MC.ID) AS COMPETICIONES,
    -- COUNT(DISTINCT GC.ID) AS GESTIONES,
    COUNT(DISTINCT CASE WHEN C.ID_EQUIPO_GANADOR = E.ID AND MC.ID IS NOT NULL THEN C.ID END) AS TROFEOS,
    MAX(CASE WHEN R.NOMBRE = 'Administrador' THEN true ELSE false END) AS TIENE_ADMINISTRADOR
FROM USUARIO U
LEFT JOIN INSCRIPCION I ON U.ID = I.ID_USUARIO
RIGHT JOIN DEPORTE D ON I.ID_DEPORTE = D.ID
LEFT JOIN MIEMBROSEQUIPO ME ON ME.ID_MIEMBRO = U.ID
LEFT JOIN EQUIPO E ON E.ID = ME.ID_EQUIPO AND D.ID = E.ID_DEPORTE
LEFT JOIN INFORMAL PI ON PI.ID_DEPORTE = D.ID 
LEFT JOIN JUGADORESINFORMAL JI ON JI.ID_USUARIO = U.ID AND JI.ID_INFORMAL = PI.ID
LEFT JOIN AMISTOSO A ON (E.ID = A.ID_EQUIPO1 OR E.ID = A.ID_EQUIPO2) AND D.ID = A.ID_DEPORTE
LEFT JOIN COMPETICION C ON C.ID_DEPORTE = D.ID 
LEFT JOIN COMPETIDORES CO ON CO.ID_COMPETICION = C.ID AND CO.ID_EQUIPO = E.ID
LEFT JOIN MIEMBROSCOMPETICION MC ON CO.ID = MC.ID_COMPETIDORES
LEFT JOIN INSCRIPCION IR ON U.ID = IR.ID_USUARIO
LEFT JOIN ROL R ON IR.ID_ROL = R.ID AND R.NOMBRE = 'Administrador'
GROUP BY  D.ID, U.ID;

