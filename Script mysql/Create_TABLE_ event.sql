CREATE TABLE evenement(
id_event INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(50),
nb_participant INT,
isCagnotte BOOLEAN,
montant_cagnotte INT,
lieu VARCHAR(50),
date_evenement DATE,
description VARCHAR(600),
theme VARCHAR(50),
place_restante INT,
place_max INTEGER,
id_organisateur INT,
isPublic BOOLEAN,
id_entreprise INT,
heure_debut TIME,
img VARCHAR(2000)
)