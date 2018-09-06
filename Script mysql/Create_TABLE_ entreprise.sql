CREATE TABLE entreprise(
id_entreprise INT NOT NULL AUTO_INCREMENT,
nom VARCHAR(50),
raison_sociale VARCHAR(50),
nb_employes INT,
PRIMARY KEY(id_entreprise, nom)
)