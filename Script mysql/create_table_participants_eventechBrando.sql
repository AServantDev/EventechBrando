USE Eventech;
CREATE TABLE participants(
id_event INT,
id_user INT,
email_user VARCHAR(50),
nom_event VARCHAR(50),
FOREIGN KEY (id_event) REFERENCES evenement(id_event),
FOREIGN KEY (id_user) REFERENCES users(id_user));