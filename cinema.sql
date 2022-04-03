-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 03 avr. 2022 à 15:16
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `cinema`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `IdClient` int(11) NOT NULL AUTO_INCREMENT,
  `Admin` tinyint(1) NOT NULL,
  `connection` tinyint(1) NOT NULL DEFAULT '0',
  `NomClient` varchar(30) NOT NULL,
  `PrenomClient` varchar(30) NOT NULL,
  `MailClient` varchar(45) NOT NULL,
  `MdpClient` varchar(64) NOT NULL,
  `DateNaissanceClient` date NOT NULL,
  `NumTelClient` int(8) NOT NULL,
  PRIMARY KEY (`IdClient`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`IdClient`, `Admin`, `connection`, `NomClient`, `PrenomClient`, `MailClient`, `MdpClient`, `DateNaissanceClient`, `NumTelClient`) VALUES
(1, 1, 0, 'Portalier', 'Vianney', 'vianney.portalier@gmail.com', 'f89b81149c6af07fee1d4373474fe34f44f2b17cf610d65f4f6220cc5a7f5d01', '2001-05-14', 786281482),
(2, 1, 0, 'Bourdain', 'Mateo', 'mateo.bourdain@gmail.com', 'ded0c1fe70d2b5b7cdf9e041ad343ec30176d035397b82d8a07c6c2c07bb512', '2000-04-22', 786651434),
(3, 0, 1, 'Portalier', 'Mayeul', 'mayeul.portalier@gmail.com', 'ad7aeeb8a3f7f8c476dc0616baf8b031ab0657d6b1923c453b1ae6c01a2bc637', '2005-07-07', 781429482),
(4, 1, 0, 'Dujardin', 'Dylan', 'truc@gmoul.com', '46996aa935f7cee76fedd80040d29c2dbff4b3dba94b4df828aca7650dc98a15', '2001-03-16', 9010100),
(5, 0, 0, 'Bauer', 'Auguste', 'augustebauer3@gmail.com', 'e029f71e07ace2a2e098a465bdf1acd0e62fc556fa43fed0bad99db4e338e9ca', '2001-10-30', 102030405),
(6, 0, 0, 'Louis', 'Michel', 'louismichel@gmail.com', 'adba2f021140ed1d4a3dc60a8e22c4a036ee05925c34f27f1f24091455114277', '2004-03-10', 60606),
(7, 0, 0, 'Raf', 'Villa', 'rafvilla@gmole.com', '40f02c29851d8b2c99f80e2dd8d55f09f84d88210e15e1983096706b48d600f5', '2001-12-31', 7896754),
(8, 0, 0, 'augier', 'balta', 'a@g.com', 'f2a3394eca4af29764d20a4ca832166fcb942398bc095c48ceeb78e413c8b3bc', '2001-04-06', 8070605),
(9, 0, 0, 'Vandessel', 'Robin', 'robinvs@majeurenull.com', 'fb6846e51c42fc8da87d9f9d45ff4b9c399650cee1f2bd8d95e78d8dac9e8e8c', '2001-06-17', 7866767);

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

DROP TABLE IF EXISTS `film`;
CREATE TABLE IF NOT EXISTS `film` (
  `IdFilm` int(11) NOT NULL AUTO_INCREMENT,
  `TitreFilm` varchar(30) NOT NULL,
  `CategorieFilm` varchar(30) NOT NULL,
  `DureeFilm` int(11) NOT NULL,
  `AnneeSortieFilm` year(4) NOT NULL,
  `NoteFilm` double(5,2) NOT NULL,
  PRIMARY KEY (`IdFilm`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `film`
--

INSERT INTO `film` (`IdFilm`, `TitreFilm`, `CategorieFilm`, `DureeFilm`, `AnneeSortieFilm`, `NoteFilm`) VALUES
(4, 'Avengers: Endgame', 'Super-héros', 181, 2019, 3.52),
(3, 'Avatar', 'Science-Fiction', 169, 2009, 4.20),
(5, 'Titanic', 'Drame romantique', 195, 1997, 3.71),
(6, 'Star Wars VII', 'Science-fiction', 135, 2015, 4.36),
(1, 'Black Panther', 'Super-héros', 134, 2018, 4.64),
(2, 'Harry Potter 7 partie 2', 'Fantastique', 130, 2011, 4.23),
(23, 'Fight Club', 'Drame', 139, 1999, 4.55),
(26, 'Mad Max: Fury Road', 'Action', 120, 2015, 4.22);

-- --------------------------------------------------------

--
-- Structure de la table `reduction`
--

DROP TABLE IF EXISTS `reduction`;
CREATE TABLE IF NOT EXISTS `reduction` (
  `IdReduc` int(11) NOT NULL AUTO_INCREMENT,
  `TauxReduc` float NOT NULL,
  `TitreReduc` varchar(20) NOT NULL,
  `NombrePlace` int(11) NOT NULL,
  `AgeMin` int(11) NOT NULL,
  `AgeMax` int(11) NOT NULL,
  `DateInf` date NOT NULL,
  `DateSup` date NOT NULL,
  PRIMARY KEY (`IdReduc`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reduction`
--

INSERT INTO `reduction` (`IdReduc`, `TauxReduc`, `TitreReduc`, `NombrePlace`, `AgeMin`, `AgeMax`, `DateInf`, `DateSup`) VALUES
(1, 0.8, 'Soldes', -1, -1, 18, '2022-04-03', '2022-04-17'),
(3, 0.9, 'Noel', 3, -1, -1, '2022-04-03', '2022-04-17');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `IdResa` int(11) NOT NULL AUTO_INCREMENT,
  `MontantResa` double NOT NULL,
  `IdResaSeance` int(11) NOT NULL,
  `IdResaClients` int(11) NOT NULL,
  `ResaNbPlace` int(11) NOT NULL,
  PRIMARY KEY (`IdResa`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`IdResa`, `MontantResa`, `IdResaSeance`, `IdResaClients`, `ResaNbPlace`) VALUES
(1, 6.5, 1, 2, 2),
(2, 5, 2, 3, 4);

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `IdSalle` int(11) NOT NULL AUTO_INCREMENT,
  `NbPlaceSalle` int(11) NOT NULL,
  `SpecificationSalle` text NOT NULL,
  PRIMARY KEY (`IdSalle`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`IdSalle`, `NbPlaceSalle`, `SpecificationSalle`) VALUES
(1, 25, '3D et Dolby Atmos'),
(2, 40, ''),
(3, 30, 'IMAX'),
(4, 30, '');

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

DROP TABLE IF EXISTS `seance`;
CREATE TABLE IF NOT EXISTS `seance` (
  `IdSeance` int(11) NOT NULL AUTO_INCREMENT,
  `IdFilmSeance` int(11) NOT NULL,
  `IdSalleSeance` int(11) NOT NULL,
  `DebutSeance` datetime NOT NULL,
  `FinSeance` datetime DEFAULT NULL,
  PRIMARY KEY (`IdSeance`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `seance`
--

INSERT INTO `seance` (`IdSeance`, `IdFilmSeance`, `IdSalleSeance`, `DebutSeance`, `FinSeance`) VALUES
(1, 3, 2, '2022-03-16 14:23:57', '2022-03-16 15:23:57'),
(2, 6, 1, '2022-03-15 18:28:36', '2022-03-15 18:28:36'),
(5, 15, 4, '2022-04-21 11:13:54', '2022-04-21 15:13:54');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
