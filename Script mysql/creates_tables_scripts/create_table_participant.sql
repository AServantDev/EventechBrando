CREATE TABLE `participants` (
  `id_event` int(11),
  `id_user` int(11),
  `email_user` varchar(50),
  `nom_event` varchar(50),
FOREIGN KEY (`id_event`) REFERENCES `evenement` (`id_event`),
FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`)
);
