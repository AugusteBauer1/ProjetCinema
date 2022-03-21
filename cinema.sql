-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 21 mars 2022 à 12:47
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
  `NomClient` varchar(30) NOT NULL,
  `PrenomClient` varchar(30) NOT NULL,
  `MailClient` varchar(45) NOT NULL,
  `MdpClient` varchar(10) NOT NULL,
  `DateNaissanceClient` date NOT NULL,
  `NumTelClient` int(8) NOT NULL,
  PRIMARY KEY (`IdClient`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`IdClient`, `Admin`, `NomClient`, `PrenomClient`, `MailClient`, `MdpClient`, `DateNaissanceClient`, `NumTelClient`) VALUES
(1, 1, 'Portalier', 'Vianney', 'vianney.portalier@gmail.com', 'mdpCinema', '2001-05-14', 786281482),
(2, 1, 'Bourdain', 'Mateo', 'mateo.bourdain@gmail.com', 'mdpMateo', '2000-04-22', 786651434),
(3, 0, 'Portalier', 'Mayeul', 'mayeul.portalier@gmail.com', 'CineCine', '2005-07-07', 781429482),
(4, 0, 'Dupont', 'Papy', 'papy.dupont@gmail.com', 'PapyCine', '1934-03-07', 678270239);

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
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `film`
--

INSERT INTO `film` (`IdFilm`, `TitreFilm`, `CategorieFilm`, `DureeFilm`, `AnneeSortieFilm`, `NoteFilm`) VALUES
(4, 'Avengers: Endgame', 'Super-héros', 181, 2019, 3.52),
(3, 'Avatar', 'Science-Fiction', 169, 2009, 4.20),
(5, 'Titanic', 'Drame romantique', 195, 1997, 3.71),
(6, 'Star Wars VII', 'Science-fiction', 135, 2015, 4.36),
(1, 'Black Panther', 'Super-héros', 134, 2018, 4.64),
(2, 'Harry Potter 7 partie 2', 'Fantastique', 130, 2011, 4.23);

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
