/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : weibo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-14 11:09:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for diary
-- ----------------------------
DROP TABLE IF EXISTS `diary`;
CREATE TABLE `diary` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `pub_time` datetime DEFAULT NULL,
  `user_id` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of diary
-- ----------------------------
INSERT INTO `diary` VALUES ('1', 'title1', 'content1', '2017-12-05 11:24:21', '1');
INSERT INTO `diary` VALUES ('2', 'title1', 'content1', '2017-12-04 09:49:38', '2');

-- ----------------------------
-- Table structure for diary_tags
-- ----------------------------
DROP TABLE IF EXISTS `diary_tags`;
CREATE TABLE `diary_tags` (
  `diary_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,
  `extras` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of diary_tags
-- ----------------------------
INSERT INTO `diary_tags` VALUES ('1', '1', 'weerwer');
INSERT INTO `diary_tags` VALUES ('2', '2', 'weerwer');

-- ----------------------------
-- Table structure for tags
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `creator` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tags` VALUES ('1', 'wewe', '23');
INSERT INTO `tags` VALUES ('2', 'wrwr', '90');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('qw', 'qw');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `psw` varchar(255) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `sign` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT '0',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'name1', 'psw1', 'mn', 'sss', 'sfs', '20');
INSERT INTO `users` VALUES ('2', 'name2', 'psw2', 'dd', 'sss', 'ss', '0');
