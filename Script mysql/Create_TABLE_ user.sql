CREATE TABLE users(
id_user INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50),
prenom VARCHAR(50),
age INT,
centre_d_interet VARCHAR(200),
email VARCHAR(50),
mot_de_passe VARCHAR(50),
isPro BOOLEAN,
id_event INT,
id_entreprise INT
)