/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : fitness

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-09-03 21:58:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `do_name` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('3', '老师', '甜甜', '2020-04-25 19:09:43', '墨轩', 'tiangouzi', '123456');
INSERT INTO `admin` VALUES ('4', '私人教练', '石头', '2020-04-25 19:10:17', '墨轩', 'shitou', '123456');
INSERT INTO `admin` VALUES ('5', '私人教练', '西卡', '2020-05-10 16:15:05', '墨轩', 'xika', '123456');
INSERT INTO `admin` VALUES ('6', '管理员', '舔钩子', '2020-05-10 16:15:34', '墨轩', '甜甜', '123456');
INSERT INTO `admin` VALUES ('7', '私人教练', '静男', '2020-05-10 16:15:56', '墨轩', 'jingjing', '321123');

-- ----------------------------
-- Table structure for advert
-- ----------------------------
DROP TABLE IF EXISTS `advert`;
CREATE TABLE `advert` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pic` varchar(255) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `show` tinyint(1) DEFAULT NULL,
  `sort_num` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advert
-- ----------------------------
INSERT INTO `advert` VALUES ('1', '这很', '下顿广告', '哈哈', '5', '50');

-- ----------------------------
-- Table structure for coaches
-- ----------------------------
DROP TABLE IF EXISTS `coaches`;
CREATE TABLE `coaches` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `specialization` varchar(100) DEFAULT NULL,
  `img` varchar(200) DEFAULT NULL,
  `des` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coaches
-- ----------------------------
INSERT INTO `coaches` VALUES ('1', 'Alex Conaughey', '26', '8', '男', '健身,体能', '', '帅气逼人，强壮可靠');
INSERT INTO `coaches` VALUES ('2', 'Paul Hudson', '25', '9', '男', '体能', null, '肌肉男，男友力很强');
INSERT INTO `coaches` VALUES ('3', 'Jenny Paster', '25', '9', '女', '塑型', null, '美女，身材很好，笑容很甜美');
INSERT INTO `coaches` VALUES ('4', 'Nikolas', '22', '5', '男', '健身', null, '年轻小伙子，没有男朋友的可以找他');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) DEFAULT NULL,
  `course_dir` varchar(100) DEFAULT NULL,
  `coaches` varchar(30) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `do_name` varchar(30) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '下蹲', '增肌', '	Paul Hudson', '2020-05-15 15:25:27', '2020-05-16 15:25:30', '2020-05-14 15:25:42', 'shitou2', '500');

-- ----------------------------
-- Table structure for course_type
-- ----------------------------
DROP TABLE IF EXISTS `course_type`;
CREATE TABLE `course_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_type
-- ----------------------------

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `des` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '下蹲', '50', '666');
INSERT INTO `project` VALUES ('2', '俯卧撑', '30', '233');

-- ----------------------------
-- Table structure for recharge
-- ----------------------------
DROP TABLE IF EXISTS `recharge`;
CREATE TABLE `recharge` (
  `id` int NOT NULL AUTO_INCREMENT,
  `recharge_qq` varchar(20) DEFAULT NULL,
  `recharge_name` varchar(30) DEFAULT NULL,
  `recharge_time` datetime DEFAULT NULL,
  `recharge_money` double DEFAULT NULL,
  `do_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recharge
-- ----------------------------
INSERT INTO `recharge` VALUES ('1', '3307208233', '西卡', '2020-05-17 16:03:19', '100', '石头');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '私人教练');
INSERT INTO `role` VALUES ('2', '销售');
INSERT INTO `role` VALUES ('3', '管理员');
INSERT INTO `role` VALUES ('4', '老师');

-- ----------------------------
-- Table structure for suggestion
-- ----------------------------
DROP TABLE IF EXISTS `suggestion`;
CREATE TABLE `suggestion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sug_time` datetime DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of suggestion
-- ----------------------------
INSERT INTO `suggestion` VALUES ('1', '2020-05-18 13:53:50', '下蹲', '练习时间太短');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `teach_dir` varchar(30) DEFAULT NULL,
  `teach_year` varchar(30) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `name` varchar(30) DEFAULT NULL COMMENT '真实姓名',
  `money` double DEFAULT NULL COMMENT '账户余额',
  `birthday` date DEFAULT NULL COMMENT '出生年月',
  `level` int DEFAULT NULL COMMENT '会员等级',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '入会时间',
  `gendar` varchar(20) DEFAULT NULL COMMENT '性别',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `isVerify` int DEFAULT NULL COMMENT '手机号是否经过验证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'moxuan', '789456', '墨轩', '1000000', '2020-04-29', '2', '2020-05-19 13:18:45', '男', '18871138178', 'moxuan@126.com', '1');
INSERT INTO `user` VALUES ('2', 'xika', '123456', '西卡', '1000000', '2020-09-03', '2', '2020-09-03 21:57:25', '男', '15872405771', 'yanghai_softeem@126.com', '1');

-- ----------------------------
-- Table structure for videoo
-- ----------------------------
DROP TABLE IF EXISTS `videoo`;
CREATE TABLE `videoo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `des` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of videoo
-- ----------------------------
INSERT INTO `videoo` VALUES ('1', '锻炼', null, '下蹲');

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip` (
  `id` int NOT NULL AUTO_INCREMENT,
  `qq_num` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `do_name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vip
-- ----------------------------
INSERT INTO `vip` VALUES ('1', '3307108233', '15822223333', '杜矿磊', '武汉', '666', '2020-05-13 16:58:38', '石头', '123789');
