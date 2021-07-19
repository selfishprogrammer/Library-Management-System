-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2020 at 05:49 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarymanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `slno` int(100) NOT NULL,
  `book_id` varchar(100) NOT NULL,
  `author_name` varchar(100) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  `edition` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `branch` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`slno`, `book_id`, `author_name`, `book_name`, `edition`, `date`, `branch`) VALUES
(1, '2133624', 'NK SINGH', 'PYTHON PROGRAMMING', '2', '22/11/2020', 'CSE'),
(2, '2178053', 'JK PAL', 'Engineering Drawing', '2', '22/11/2020', 'CE'),
(3, '217833', 'GOVIND SINGH', 'THERMODYNAMICS', '4', '22/11/2020', 'CSE'),
(4, '2111233', 'SHARMA PUBLISTION', 'DISTRECTE MATHEMATICS', '4', '22/10/2020', 'CSE'),
(5, '2130354', 'SK SINGH', 'JAVA PROGRAMMING', '1', '22/11/2020', 'CSE');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `book_id` varchar(100) NOT NULL,
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) NOT NULL,
  `book_name` varchar(100) NOT NULL,
  `author_name` varchar(100) NOT NULL,
  `department` varchar(100) NOT NULL,
  `date_of_issue` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`book_id`, `student_id`, `student_name`, `book_name`, `author_name`, `department`, `date_of_issue`) VALUES
('2111233', '2161438', 'Rahul Jha', 'DISTRECTE MATHEMATICS', 'SHARMA PUBLISTION', 'CSE', ''),
('217833', '2153777', 'Sourav De', 'THERMODYNAMICS', 'GOVIND SINGH', 'CSE', '30-Jul-2020');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `cpassword` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `email`, `password`, `cpassword`) VALUES
('tudhghdg', 'hghghggh', '123', '123'),
('Rahul Jha', 'rahuljha3246@gmaiil.com', 'Rahul@18', 'Rahul@18'),
('Sourav De', 'sde@gmail.com', '1234', '1234'),
('Abhinash Sharma', 'ab@gmai.com', '1235', '1235');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE `returnbook` (
  `student_id` varchar(100) NOT NULL,
  `book_id` varchar(100) NOT NULL,
  `date_of_issue` varchar(100) NOT NULL,
  `date_of_retutn` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`student_id`, `book_id`, `date_of_issue`, `date_of_retutn`) VALUES
('2153777', '2133624', '24-Jul-2020', '31-Jul-2020');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `slno` int(100) NOT NULL,
  `student_id` varchar(100) NOT NULL,
  `student_name` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `department` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`slno`, `student_id`, `student_name`, `gender`, `address`, `semester`, `department`) VALUES
(1, '2161438', 'Rahul Jha', 'Male', 'BANARHAT', '5th', 'CSE'),
(2, '2153777', 'Sourav De', 'Male', 'BANKURA', '5th', 'CSE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`slno`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`slno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `slno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `slno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
