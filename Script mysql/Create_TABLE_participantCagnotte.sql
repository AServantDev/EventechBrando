USE Eventech; 

CREATE TABLE participantCagnotte (
id_user INT, 
id_event INT, 
nom_event VARCHAR (50), 
nom_user VARCHAR(50), 
mail_user VARCHAR(50), 
valeur_don INT, 
FOREIGN KEY (id_user) REFERENCES users (id_user), 
FOREIGN KEY (id_event) REFERENCES evenement (id_event)
); 
