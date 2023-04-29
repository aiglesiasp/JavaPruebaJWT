DROP TABLE IF EXISTS contactos;
DROP TABLE IF EXISTS usuarios;

CREATE TABLE IF NOT EXISTS contactos (
						id INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
                        celular VARCHAR(100) DEFAULT NULL,
                        email VARCHAR(100) DEFAULT NULL,
						PRIMARY KEY(id)
						);
                        
CREATE TABLE IF NOT EXISTS usuarios (
						id INT AUTO_INCREMENT,
						username VARCHAR(100) DEFAULT NULL,
                        password VARCHAR(100) DEFAULT NULL,
                        email VARCHAR(100) DEFAULT NULL,
						PRIMARY KEY(id)
						);


INSERT INTO usuarios (username, password, email) VALUES ('User1', '$2a$10$NQIpMLi1Fc4roXBLINm..u1lYe9BPYkjMyGfHseBnye8wYspDIcf6', 'email1');
INSERT INTO usuarios (username, password, email) VALUES ('User2', 'password2', 'email2');
INSERT INTO usuarios (username, password, email) VALUES ('User3', 'password3', 'email3');



INSERT INTO contactos (nombre, celular, email) VALUES ('Contacto1', 'Telefono1', 'emailContacto1');
INSERT INTO contactos (nombre, celular, email) VALUES ('Contacto2', 'Telefono2', 'emailContacto2');
INSERT INTO contactos (nombre, celular, email) VALUES ('Contact31', 'Telefono3', 'emailContacto3');
