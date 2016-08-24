-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15-Ago-2016 às 02:30
-- Versão do servidor: 10.1.10-MariaDB
-- PHP Version: 7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `unipejet`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `passenger`
--

CREATE TABLE `passenger` (
  `id` int(11) NOT NULL,
  `name` varchar(200) COLLATE utf8_bin NOT NULL,
  `amount_paid` float DEFAULT NULL,
  `date_register` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `seats_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `seats`
--

CREATE TABLE `seats` (
  `id` int(11) NOT NULL,
  `seat_number` varchar(3) COLLATE utf8_bin NOT NULL,
  `is_busy` tinyint(1) NOT NULL DEFAULT '0',
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `seats`
--

INSERT INTO `seats` (`id`, `seat_number`, `is_busy`, `price`) VALUES
(1, 'A01', 0, 100),
(2, 'A02', 0, 100),
(3, 'A03', 0, 100),
(4, 'A04', 0, 100),
(5, 'A05', 0, 100),
(6, 'A06', 0, 100),
(7, 'A07', 0, 100),
(8, 'A08', 0, 100),
(9, 'A09', 0, 100),
(10, 'A10', 0, 100),
(11, 'B01', 0, 100),
(12, 'B02', 0, 100),
(13, 'B03', 0, 100),
(14, 'B04', 0, 100),
(15, 'B05', 0, 100),
(16, 'B06', 0, 100),
(17, 'B07', 0, 100),
(18, 'B08', 0, 100),
(19, 'B09', 0, 100),
(20, 'B10', 0, 100),
(21, 'C01', 0, 100),
(22, 'C02', 0, 100),
(23, 'C03', 0, 100),
(24, 'C04', 0, 100),
(25, 'C05', 0, 100),
(26, 'C06', 0, 100),
(27, 'C07', 0, 100),
(28, 'C08', 0, 100),
(29, 'C09', 0, 100),
(30, 'C10', 0, 100),
(31, 'D01', 0, 100),
(32, 'D02', 0, 100),
(33, 'D03', 0, 100),
(34, 'D04', 0, 100),
(35, 'D05', 0, 100),
(36, 'D06', 0, 100),
(37, 'D07', 0, 100),
(38, 'D08', 0, 100),
(39, 'D09', 0, 100),
(40, 'D10', 0, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `seats_id` (`seats_id`);

--
-- Indexes for table `seats`
--
ALTER TABLE `seats`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `seat_unique` (`seat_number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `passenger`
--
ALTER TABLE `passenger`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `seats`
--
ALTER TABLE `seats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `passenger`
--
ALTER TABLE `passenger`
  ADD CONSTRAINT `passenger_seats_id` FOREIGN KEY (`seats_id`) REFERENCES `seats` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
