/*
 Navicat Premium Data Transfer

 Source Server         : MySQLmk01
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : timeline

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 13/10/2019 12:21:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for moment
-- ----------------------------
DROP TABLE IF EXISTS `moment`;
CREATE TABLE `moment`  (
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `timeStamp` datetime(0) NULL DEFAULT NULL,
  `content` varchar(1023) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `imageUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lineCount` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of moment
-- ----------------------------
INSERT INTO `moment` VALUES ('FmnaUnm3', '2019-10-12 13:06:36', 'FmnaUnm3I5MueLf63g5G34wCBqtWN3A8lHgSeKrtcFLSjtSNIVyEHhWA9BUVuWqdHhf5kx68IhUYLiHElA1ZxA8D5tOTceBV9R0v6winIsQy6teN', 'Ak4jEnD1nXaqCjmy.pnc', NULL);
INSERT INTO `moment` VALUES ('8hkiRURS', '2019-10-12 13:13:21', '8hkiRURSAvLrIJftsCwSXOIXobVw3W9nCBcyIXzuHWSbDBwE0BVJs1CMdYBEBWJgfcbySOG5B0FcQHTrpv8LyoR7jrIlcwh7dudoPyHW223aVKkXY5FuoZ1nWv0EoVo7bGCkacYq5IHGYuq2uf5W2tMEYM1Jo8wsQDPp1P435JBz8o7c3tVQF3imEc4CzchFZGZLpo44VH5s9NOnUEJXk2z49bY', '8hkiRURSAvLrIJft.pnc', NULL);
INSERT INTO `moment` VALUES ('mloTxTQo', '2019-10-12 13:42:40', 'mloTxTQoDo7Gj3CuxoCp4QiQllXNXLvKBKnGTeZFaQJUv4p1j3O51Mlq53wnzjx58PiR2YcvbrDyJ9LRaUUnDyI6gZZ9dFqoDcTE2h8MVVh6fVb7FNBVkOec41HA9TcrD5FOVtlyCFjGhZ7XYSbtr1Gii5HNj2HAZURs1v0aub4Mr0VYCK1YMtshKgJuxHS1AUlhn7452fw1Xx2l1P1k52ynjoD7kXqZ5zLkMwnGNvfnUIxiYBFsANKAJjs0j97G1DKMCSlX8ju', 'mloTxTQoDo7Gj3Cu.pnc', NULL);
INSERT INTO `moment` VALUES ('bJG817Pa', '2019-10-12 13:46:53', 'bJG817Pa0KDCa7ntGUlL7O6Tzz24Lk9uqCWtVLMmgYJW00OdxWMdKPcWJdUG3qAokLaMBkr9PswKrwGQGEZwBO7eW', 'nJDmy6Slw7uOepcb.pnc', NULL);
INSERT INTO `moment` VALUES ('XrUN2MJ7', '2019-10-12 13:48:55', 'XrUN2MJ7SF62sHQfcRqYtma3NE4zvPIgpbn7awujyYiCrdJIL06BwRfVugjnnptON9gXn1n7MEHUkLzyMePuPVhzCuNtjpgF2O5nlcX27HKrtniN7nwXWjiXWCTbypN39aCxte5kqoq5zWMK9LSz94ne3grhhMA3pv8hVR4jQMdo', '9rQ1zMOiq20dwZFX.pnc', NULL);
INSERT INTO `moment` VALUES ('eJb20EQG', '2019-10-12 14:51:53', 'eJb20EQGV5CitS8Ab2TLU', 'eJb20EQGV5CitS8A.pnc', NULL);
INSERT INTO `moment` VALUES ('FzGmVIsg', '2019-10-12 14:53:22', 'FzGmVIsglFmi3v3x2Gkk2bCLKqB0mJ9WrpaJzCRS1Iz43kJ7NfL8zUiabwB5ynkYs8ZI1rZddTQ0AuKFj2OrhPjuoAsA7oDHSjyfC7z5eZreQj6ZICMA5D7QBlPUf0dAcIsNW9x8dgiKmPc4iTJfXu0prjE3mAbH8FIrVZ4FGckI19HKw41xtGLTAnxCD8kpqiMdyHm08H8pG9LJ9qLT', 'FzGmVIsglFmi3v3x.pnc', NULL);
INSERT INTO `moment` VALUES ('AIsirQgq', '2019-10-12 14:54:42', 'AIsirQgquGhIX8jLgm5iOBoH78oYusVtYfhP8Th6LLDA1y23foJBDfgHn2BoLjLHU6vbMn375Zz2ESBZKP2tZZZoff4G6kL8eNB8ayqxrUoF1CZBOEfb3tw7EkHw7RXJ5D5JwNd1Rb6C8ciaFBsNDaLPNkXPjCMcgLV1AXN6KRjJpYmhziDzZESCc', 'AIsirQgquGhIX8jL.pnc', NULL);

SET FOREIGN_KEY_CHECKS = 1;
