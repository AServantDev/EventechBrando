USE Eventech;

CREATE TABLE collecte (
id_user INT, 
id_event INT, 
montant INT,
typeUser VARCHAR (50), 
nom VARCHAR(50), 
prenom VARCHAR(50), 
entreprise VARCHAR(50), 
email VARCHAR(50), 
dateNaissance VARCHAR(50), 
rue VARCHAR(50), 
codePostal VARCHAR(50), 
ville VARCHAR(50), 
pays VARCHAR(50), 
FOREIGN KEY (id_user) REFERENCES users (id_user), 
FOREIGN KEY (id_event) REFERENCES evenement (id_event)
); 