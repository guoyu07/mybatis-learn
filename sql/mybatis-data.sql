/*
Navicat MySQL Data Transfer

Source Server         : r
Source Server Version : 50131
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50131
File Encoding         : 65001

Date: 2018-02-09 11:06:31
*/

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '用户添加', 'user:add', '用户添加按钮');
INSERT INTO `permission` VALUES ('2', '用户列表', 'user:list', '用户列表数据');
INSERT INTO `permission` VALUES ('3', '用户删除', 'user:delete', '用户删除按钮');


-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员角色', 'user_super');
INSERT INTO `role` VALUES ('2', '普通用户角色', 'user_common');



-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '1');
INSERT INTO `role_permission` VALUES ('2', '1', '2');
INSERT INTO `role_permission` VALUES ('3', '1', '3');
INSERT INTO `role_permission` VALUES ('4', '2', '2');



-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '超级管理员', '2');
INSERT INTO `user` VALUES ('2', '普通用户', '1');
INSERT INTO `user` VALUES ('10', 'shimh2', '2');



-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1');
INSERT INTO `user_role` VALUES ('2', '2', '2');
