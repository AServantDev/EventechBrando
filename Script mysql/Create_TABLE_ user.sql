CREATE TABLE users(
id_user INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50),
prenom VARCHAR(50),
age INT,
metier VARCHAR(50),
centre_d_interet VARCHAR(200),
id_event INT,
id_entreprise INT
)