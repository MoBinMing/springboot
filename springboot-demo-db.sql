/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50162
Source Host           : localhost:3306
Source Database       : springboot-demo-db

Target Server Type    : MYSQL
Target Server Version : 50162
File Encoding         : 65001

Date: 2020-03-09 11:00:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('88', 'sss', '2020-03-08 23:27:45');
INSERT INTO `users` VALUES ('89', 'sss', '2020-03-09 01:14:10');
