/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.17-log : Database - jet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jet`;

/*Table structure for table `user_info` */

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `nick_name` varchar(30) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `cell_phone` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `level` int(11) DEFAULT '0',
  `status` int(3) DEFAULT '0',
  `email_code` varchar(50) DEFAULT NULL,
  `birth_day` DATETIME DEFAULT NULL,
  `date_insert` DATETIME DEFAULT NULL,
  `date_update` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`name`,`nick_name`,`password`,`cell_phone`,`email`,`level`,`status`,`email_code`,`birth_day`,`date_insert`,`date_update`) values (1,'jeff','ljf','ljf92219','18761637019','285079883@qq.com',0,0,NULL,'2017-11-10','2017-11-10',NULL),(2,NULL,NULL,'ljf92219',NULL,'714951069@qq.com',0,0,'3bb176a2093ed03d1ed6240223ae79dc',NULL,'2017-11-28',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
