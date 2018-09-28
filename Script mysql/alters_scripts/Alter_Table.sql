ALTER TABLE evenement
ADD FOREIGN KEY (id_organisateur) REFERENCES users(id_user);

ALTER TABLE evenement
ADD FOREIGN KEY (id_entreprise) REFERENCES entreprise(id_entreprise);

ALTER TABLE users
ADD FOREIGN KEY (id_event) REFERENCES evenement(id_event);

ALTER TABLE users
ADD FOREIGN KEY (id_entreprise) REFERENCES entreprise(id_entreprise);

ALTER TABLE evenement
ADD COLUMN description_rapide VARCHAR(100);

ALTER TABLE evenement
ADD COLUMN img VARCHAR(2000)
