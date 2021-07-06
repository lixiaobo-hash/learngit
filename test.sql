/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 8.0.22 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET gbk */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `test`;

/*Table structure for table `friend` */

DROP TABLE IF EXISTS `friend`;

CREATE TABLE `friend` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `friend` */

insert  into `friend`(`id`,`name`,`phone`,`email`,`address`,`user_id`) values (1,'g\'s\'d\'g','gfsd','g\'s\'f','s',2),(11,'g\'s\'d\'g','gfsd','g\'s\'f','fgs',2),(23,'gfh','fghfg','g\'f\'h\'g\'f','gfhf',2),(24,'张三','1232412412','sdfgshs','143rwefs',2);

/*Table structure for table `t_emp` */

DROP TABLE IF EXISTS `t_emp`;

CREATE TABLE `t_emp` (
  `username` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `heir_date` date DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `professional` varchar(50) DEFAULT NULL,
  `experience` varchar(200) DEFAULT NULL,
  `flag` varchar(10) DEFAULT NULL,
  `super_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  KEY `super id` (`super_id`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_emp` */

insert  into `t_emp`(`username`,`name`,`password`,`sex`,`birthday`,`heir_date`,`position`,`qualification`,`professional`,`experience`,`flag`,`super_id`) values (1,'李沁','1234','girl','2021-06-09','2021-06-14','花瓶',NULL,NULL,'无',NULL,NULL),(2,'张艺谋','1234','man','2021-06-07','2021-06-04','花瓶',NULL,NULL,'',NULL,NULL),(3,'张艺谋','1234','男','2021-06-01','2021-06-10','花瓶',NULL,'计算机','演员',NULL,NULL),(4,'张艺谋','1234','男','2021-06-25','2021-06-03','花瓶',NULL,'计算机','wu',NULL,NULL);

/*Table structure for table `t_plan` */

DROP TABLE IF EXISTS `t_plan`;

CREATE TABLE `t_plan` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `plan_name` varchar(50) DEFAULT NULL,
  `plan_state` varchar(10) DEFAULT NULL,
  `feedback` varchar(10) DEFAULT NULL,
  `plan_begin_time` date DEFAULT NULL,
  `plan_end_time` date DEFAULT NULL,
  `plan_description` varchar(100) DEFAULT NULL,
  `plan_feedback` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `t_plan_ibfk_1` FOREIGN KEY (`id`) REFERENCES `t_task` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_plan` */

/*Table structure for table `t_task` */

DROP TABLE IF EXISTS `t_task`;

CREATE TABLE `t_task` (
  `id` int(11) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `task_name` varchar(50) DEFAULT NULL,
  `task_begin_time` date DEFAULT NULL,
  `task_end_time` date DEFAULT NULL,
  `task_description` varchar(200) DEFAULT NULL,
  `task_state` varchar(10) DEFAULT NULL,
  `staff_id` varchar(50) DEFAULT NULL,
  `emp_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `staff_id` (`staff_id`),
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `t_task_ibfk_2` FOREIGN KEY (`emp_id`) REFERENCES `t_emp` (`super_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_task` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(10) NOT NULL DEFAULT '普通用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`role`) values (1,'admin','123456','管理员'),(2,'zhangsan','123','普通用户'),(3,'lisi','456','普通用户'),(4,'lisi','1234','普通用户'),(5,'ww','123','普通用户'),(6,'ww','123','普通用户'),(7,'ww','123','普通用户'),(8,'ww','123','普通用户'),(9,'','','普通用户'),(10,'zhangsan','123','普通用户');

/* Procedure structure for procedure `add_pro` */

/*!50003 DROP PROCEDURE IF EXISTS  `add_pro` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `add_pro`(a int, b int, out sum int)
begin 
set sum=a+b;
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
