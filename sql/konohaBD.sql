DROP DATABASE IF EXISTS Naruto_David_Santos;

CREATE DATABASE Naruto_David_Santos;

USE Naruto_David_Santos;

CREATE TABLE `Aldea`(
    `idAldea` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nombre` VARCHAR(255) NOT NULL,
    `Descripcion` VARCHAR(255) NOT NULL
);
CREATE TABLE `Mision`(
    `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Descripcion` VARCHAR(255) NOT NULL,
    `Rango` VARCHAR(255) NOT NULL,
    `Recompensa` VARCHAR(255) NOT NULL
);
CREATE TABLE `MisionNinja`(
    `IDNinja` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `IDMision` INT UNSIGNED NOT NULL,
    `FechaInicio` DATE NULL,
    `FechaFin` DATE NULL
);

CREATE TABLE `Ninja`(
    `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nombre` VARCHAR(255) NOT NULL,
    `Rango` VARCHAR(255) NOT NULL,
    `Aldea` INT UNSIGNED NOT NULL
);
CREATE TABLE `Habilidad`(
    `IDNinja` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nombre` VARCHAR(255) NOT NULL,
    `Descripcion` VARCHAR(255) NOT NULL
);
ALTER TABLE `Ninja` ADD CONSTRAINT `ninja_id_foreign` FOREIGN KEY(`ID`) REFERENCES `Habilidad`(`IDNinja`);
ALTER TABLE `Ninja` ADD CONSTRAINT `ninja_mision_foreign` FOREIGN KEY(`ID`) REFERENCES `MisionNinja`(`IDNinja`);

ALTER TABLE `MisionNinja` ADD CONSTRAINT `misionninja_idmision_foreign` FOREIGN KEY(`IDMision`) REFERENCES `Mision`(`ID`);
ALTER TABLE `Ninja` ADD CONSTRAINT `ninja_aldea_foreign` FOREIGN KEY(`Aldea`) REFERENCES `Aldea`(`idAldea`);


-- inserciones

INSERT INTO Aldea (idAldea, Nombre, Descripcion) VALUES 
(1, "Aldea de la hoja", "tiene muchas hojas" );
INSERT INTO Aldea (idAldea, Nombre, Descripcion) VALUES 
(2, "Aldea de la arena", "Tiene mucha arena" );
INSERT INTO Aldea (idAldea, Nombre, Descripcion) VALUES 
(3, "Aldea de la niebla", "Tiene mucha niebla");
INSERT INTO Aldea (idAldea, Nombre, Descripcion) VALUES 
(4, "aldea del agua", "hay mucha agua" );
INSERT INTO Aldea (idAldea, Nombre, Descripcion) VALUES 
(5, "aldea del rayo", "caen muchos rayos");


INSERT INTO Habilidad (IDNinja, Nombre, Descripcion)VALUES 
(1, "rasengan", "hace girar airesito");
INSERT INTO Habilidad (IDNinja, Nombre, Descripcion)VALUES 
(2, "tsunami de arena", "lanza mucha arena");
INSERT INTO Habilidad (IDNinja, Nombre, Descripcion)VALUES 
(3, "niebla densa", "opaca la vision del enemigo con niebla");
INSERT INTO Habilidad (IDNinja, Nombre, Descripcion)VALUES 
(4, "cortes de megalodon", "la espada es un tiburon");
INSERT INTO Habilidad (IDNinja, Nombre, Descripcion)VALUES 
(5, "8 colas", "se convierte y maneja a voluntad el 8 colas");

INSERT INTO Mision (ID, Descripcion, Rango, Recompensa) VALUES
(1, "salvar a sasuke", "younin", "las gracias");
INSERT INTO Mision (ID, Descripcion, Rango, Recompensa) VALUES
(2, "no dejarse salvar de naruto", "younin", "que deje de molestar");
INSERT INTO Mision (ID, Descripcion, Rango, Recompensa) VALUES
(3, "no servir pa nada", "genin", "no salir mas en boruto");
INSERT INTO Mision (ID, Descripcion, Rango, Recompensa) VALUES
(4, "Cuidar al hokage en su visita a otra aldea", "chunin", "l000000 bolivares");
INSERT INTO Mision (ID, Descripcion, Rango, Recompensa) VALUES
(5, "matar a pain", "younin", "que lo revivan");

INSERT INTO MisionNinja (IDNinja,IDMision ,FechaInicio, FechaFin)VALUES
(1, 1, "2020-01-02", "2024-01-01");
INSERT INTO MisionNinja (IDNinja,IDMision ,FechaInicio, FechaFin)VALUES
(2, 2, "2010-10-12", "2021-11-11");
INSERT INTO MisionNinja (IDNinja,IDMision ,FechaInicio, FechaFin)VALUES
(3, 3, "2015-04-12", "2022-11-10");
INSERT INTO MisionNinja (IDNinja,IDMision ,FechaInicio, FechaFin)VALUES
(4, 4, "2021-01-02", "2022-09-03");
INSERT INTO MisionNinja (IDNinja,IDMision ,FechaInicio, FechaFin)VALUES
(5, 5, "2023-04-07", "2024-01-11");

INSERT INTO Ninja (ID, Nombre, Rango, Aldea) VALUES
(1, "Naruto", "younin", 1);
INSERT INTO Ninja (ID, Nombre, Rango, Aldea) VALUES
(2, "Gaara", "younin", 2);
INSERT INTO Ninja (ID, Nombre, Rango, Aldea) VALUES
(3, "sabuza", "younin", 3);
INSERT INTO Ninja (ID, Nombre, Rango, Aldea) VALUES
(4, "Kizame", "younin", 4);
INSERT INTO Ninja (ID, Nombre, Rango, Aldea) VALUES
(5, "Bee", "younin", 5);




