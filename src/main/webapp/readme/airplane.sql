/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2020-08-12 23:08:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `airplane`
-- ----------------------------
DROP TABLE IF EXISTS `airplane`;
CREATE TABLE `airplane` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `airno` varchar(20) DEFAULT NULL,
  `time` int(5) DEFAULT NULL COMMENT '单位时间',
  `price` double DEFAULT NULL,
  `takeid` int(10) DEFAULT NULL COMMENT '起飞机场',
  `landid` int(10) DEFAULT NULL COMMENT '降落机场',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airplane
-- ----------------------------
INSERT INTO `airplane` VALUES ('1', '播音474', '123', '100', '1', '3');
INSERT INTO `airplane` VALUES ('2', '播音858', '56', '300', '3', '2');
