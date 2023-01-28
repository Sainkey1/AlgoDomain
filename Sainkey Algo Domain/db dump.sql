/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.31 : Database - algodomain
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`algodomain` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `algodomain`;

/*Table structure for table `discount` */

DROP TABLE IF EXISTS `discount`;

CREATE TABLE `discount` (
  `id` bigint NOT NULL,
  `delivery_charge` decimal(38,2) DEFAULT NULL,
  `discount` int DEFAULT NULL,
  `gst` int DEFAULT NULL,
  `product_category` varchar(255) DEFAULT NULL,
  `discount_percentage` int DEFAULT NULL,
  `gst_percantage` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `discount` */

insert  into `discount`(`id`,`delivery_charge`,`discount`,`gst`,`product_category`,`discount_percentage`,`gst_percantage`) values 
(53,350.00,NULL,NULL,'Electronics',15,18),
(54,800.00,NULL,NULL,'Home Appliances',22,24),
(55,0.00,NULL,NULL,'Clothing',40,12),
(56,300.00,NULL,NULL,'Furniture',10,18);

/*Table structure for table `discount_seq` */

DROP TABLE IF EXISTS `discount_seq`;

CREATE TABLE `discount_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `discount_seq` */

insert  into `discount_seq`(`next_val`) values 
(151);

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `product_id` bigint NOT NULL,
  `product_category` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` decimal(38,2) DEFAULT NULL,
  `product_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `product` */

insert  into `product`(`product_id`,`product_category`,`product_name`,`product_price`,`product_type`) values 
(1001,'Electronics','Lenevo Yoga',45000.00,'Laptop'),
(1002,'Home Appliances','LG Washing Machine ',25000.00,'Washing Machine'),
(1003,'Electronics','HP Pavilion 360',60000.00,'Laptop'),
(1004,'Clothing','US Polo Assn',1200.00,'T-Shirt'),
(1005,'Furniture','Neelkamal Been Bag',350.00,'Sofa Set');

/*Table structure for table `product_seq` */

DROP TABLE IF EXISTS `product_seq`;

CREATE TABLE `product_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `product_seq` */

insert  into `product_seq`(`next_val`) values 
(101);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
