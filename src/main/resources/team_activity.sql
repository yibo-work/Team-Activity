/*
 Navicat Premium Data Transfer

 Source Server         : local Mysql57
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : team_activity

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 11/06/2020 23:54:33
*/
create database if not exists team_activity;

use team_activity;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity`
(
    `id`         int(11)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `team_id`    int(11)                                                       NOT NULL COMMENT '团队id',
    `name`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '活动名称',
    `content`    text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci         NULL COMMENT '活动内容',
    `start_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '活动开始时间',
    `budget`     int(11)                                                       NULL DEFAULT NULL COMMENT '总预算',
    `avg_budget` int(11)                                                       NULL DEFAULT NULL COMMENT '个人预算',
    `amount`     int(11)                                                       NULL DEFAULT NULL COMMENT '总费用',
    `avg_fee`    int(11)                                                       NULL DEFAULT NULL COMMENT '分摊费用',
    `end_time`   datetime(0)                                                   NULL DEFAULT NULL COMMENT '活动结束时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '活动表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for activity_user
-- ----------------------------
DROP TABLE IF EXISTS `activity_user`;
CREATE TABLE `activity_user`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `activity_id` int(11) NOT NULL COMMENT '活动id',
    `user_id`     int(11) NOT NULL COMMENT '会员id',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '活动成员'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for append
-- ----------------------------
DROP TABLE IF EXISTS `append`;
CREATE TABLE `append`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `activity_id` int(11) NOT NULL COMMENT '活动id',
    `user_id`     int(11) NOT NULL COMMENT '会员id',
    `append_fee`  int(11) NOT NULL COMMENT '追加费用',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '活动追加费用'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`
(
    `id`           int(11)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `name`         varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '团队名',
    `team_user_id` int(11)                                                       NOT NULL COMMENT '团长id',
    `create_time`  datetime(0)                                                   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '团队创建时间',
    `team_fee`     int(11)                                                       NOT NULL DEFAULT 0 COMMENT '团费',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '团队'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team`
VALUES (1, '开心每一天', 5, '2020-06-11 23:01:56', 1000);

-- ----------------------------
-- Table structure for team_user
-- ----------------------------
DROP TABLE IF EXISTS `team_user`;
CREATE TABLE `team_user`
(
    `id`      int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `team_id` int(11) NOT NULL COMMENT '团队id',
    `user_id` int(11) NOT NULL COMMENT '队员id',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '团队成员'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of team_user
-- ----------------------------
INSERT INTO `team_user`
VALUES (1, 1, 3);
INSERT INTO `team_user`
VALUES (2, 1, 2);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`       int(11)                                                       NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
    `name`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
    `gender`   int(11)                                                       NOT NULL DEFAULT 1 COMMENT '角色编号，1、男 0、女',
    `age`      int(11)                                                       NULL     DEFAULT NULL COMMENT '年龄',
    `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '123' COMMENT '密码',
    `phone`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '电话',
    `address`  varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '地址',
    `email`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL     DEFAULT NULL COMMENT '邮箱',
    `role_id`  int(11)                                                       NOT NULL COMMENT '角色编号，1、管理员 2、会员',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES (1, 'admin', 0, NULL, '123', '', '', '', 1);
INSERT INTO `user`
VALUES (2, 'user', 1, 12, '123', 'asd ', 'xzc ', '阿什顿', 2);
INSERT INTO `user`
VALUES (3, '测试', 0, 12, '123', '13', '123', '', 2);
INSERT INTO `user`
VALUES (5, 'user1', 1, NULL, '123', NULL, NULL, NULL, 2);

SET FOREIGN_KEY_CHECKS = 1;
