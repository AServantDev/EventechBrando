ALTER TABLE compte
ADD FOREIGN KEY (id_user) REFERENCES users(id_user);

ALTER TABLE evenement
ADD FOREIGN KEY (hote) REFERENCES users(id_user);

ALTER TABLE users
ADD FOREIGN KEY (id_event) REFERENCES evenement(id_event);

ALTER TABLE users
ADD FOREIGN KEY (id_entreprise) REFERENCES entreprise(id_entreprise);

