# Spring - Hibernate - Mysql



## sql Queries


** Create Database **

CREATE DATABASE /*!32312 IF NOT EXISTS*/`testspring` /*!40100 DEFAULT CHARACTER SET utf8 */;

** Create Table **

Table structure for table ** employee **

CREATE TABLE `employee` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `salary` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;