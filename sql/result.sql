/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : thesis

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 25/12/2024 00:39:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for result_certificateinfo
-- ----------------------------
DROP TABLE IF EXISTS `result_certificateinfo`;
CREATE TABLE `result_certificateinfo`  (
                                           `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
                                           `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '档案标题',
                                           `certificate_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '证书类型',
                                           `obtain_time` timestamp(0) NOT NULL COMMENT '获得时间',
                                           `certificate_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '证书编号',
                                           `issuing_institution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '授予机构',
                                           `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                           `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                           `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步状态',
                                           `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                           `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                           `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                           `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '档案资料上传表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_certificateinfo
-- ----------------------------

-- ----------------------------
-- Table structure for result_continuing_education_material
-- ----------------------------
DROP TABLE IF EXISTS `result_continuing_education_material`;
CREATE TABLE `result_continuing_education_material`  (
                                                         `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '材料ID',
                                                         `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '材料标题',
                                                         `training_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '培训单位',
                                                         `hours` decimal(10, 1) NOT NULL COMMENT '课时',
                                                         `score` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '评分/等级',
                                                         `obtain_time` timestamp(0) NOT NULL COMMENT '获得时间',
                                                         `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                                         `project_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '关联课题ID',
                                                         `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步',
                                                         `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                                         `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                                         `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                                         `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '继续教育材料' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_continuing_education_material
-- ----------------------------

-- ----------------------------
-- Table structure for result_copyright
-- ----------------------------
DROP TABLE IF EXISTS `result_copyright`;
CREATE TABLE `result_copyright`  (
                                     `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '著作权ID',
                                     `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '著作权名称',
                                     `certificate_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '证书号',
                                     `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                     `finish_time` timestamp(0) NULL DEFAULT NULL COMMENT '开发完成时间',
                                     `puttime` timestamp(0) NOT NULL COMMENT '获得时间',
                                     `register_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登记号',
                                     `copyright_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '著作权类型',
                                     `copyright_owner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '著作权人',
                                     `description` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                     `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步',
                                     `created` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
                                     `updated` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
                                     `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息（存储作者信息及单位）',
                                     `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题ID',
                                     `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                     `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                     `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '软件著作权' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_copyright
-- ----------------------------

-- ----------------------------
-- Table structure for result_other
-- ----------------------------
DROP TABLE IF EXISTS `result_other`;
CREATE TABLE `result_other`  (
                                 `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
                                 `achievement_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '成果名称',
                                 `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                 `obtain_time` timestamp(0) NOT NULL COMMENT '获得时间',
                                 `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                 `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                 `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步状态',
                                 `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息',
                                 `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                 `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                 `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                 `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '其他上传表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_other
-- ----------------------------

-- ----------------------------
-- Table structure for result_papers
-- ----------------------------
DROP TABLE IF EXISTS `result_papers`;
CREATE TABLE `result_papers`  (
                                  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                                  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '论文标题',
                                  `paper_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '论文类型',
                                  `research_field` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '论文领域',
                                  `author_rank` int(0) NOT NULL DEFAULT 1 COMMENT '位序',
                                  `corresponding_author` tinyint(1) NULL DEFAULT NULL COMMENT '是否为通讯作者（是/否）',
                                  `journal_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '刊物名称',
                                  `indexing` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '收录检索',
                                  `publish_date` timestamp(0) NOT NULL COMMENT '发表时间',
                                  `doi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'DOI号',
                                  `citation_count` int(0) NULL DEFAULT 0 COMMENT '引用次数',
                                  `keywords` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '关键词',
                                  `page_range` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '起止页码',
                                  `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                  `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息（存储作者信息及单位）',
                                  `impact_factor` decimal(5, 3) NULL DEFAULT NULL COMMENT '影响因子',
                                  `volume_number` int(0) NULL DEFAULT NULL COMMENT '卷号',
                                  `issue_number` int(0) NULL DEFAULT NULL COMMENT '期号',
                                  `issn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'ISSN号',
                                  `cn_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'CN号',
                                  `abstract` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '摘要',
                                  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                  `pdf_path` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                  `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成功同步',
                                  `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                  `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '关联用户id',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '论文表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_papers
-- ----------------------------
INSERT INTO `result_papers` VALUES (17, '11', '学位论文', NULL, 3, NULL, '11111', '[\"SSCI\", \"自然指数杂志\"]', '2024-10-16 00:00:00', NULL, NULL, NULL, NULL, NULL, '[{\"name\": \"121\", \"rank\": 1, \"identity\": \"老师\", \"institution\": \"212\", \"coFirstAuthor\": false, \"corresponding\": false}, {\"name\": \"1\", \"rank\": 2, \"identity\": \"博士生\", \"institution\": \"11\", \"coFirstAuthor\": false, \"corresponding\": false}]', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '2024-12-24 21:26:44', '2024-12-25 00:30:41', 'b0f8549f-2ee0-451d-8a29-4cde92d20951');
INSERT INTO `result_papers` VALUES (23, '121', '会议论文集', NULL, 1, NULL, '1212', '[\"SSCI\", \"ESCI\", \"CPCI-SSH (ISSHP)\"]', '2024-10-19 00:00:00', NULL, NULL, NULL, NULL, NULL, '[{\"name\": \"\", \"rank\": null, \"identity\": \"\", \"institution\": \"\", \"coFirstAuthor\": false, \"corresponding\": false}]', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '2024-12-24 21:26:44', '2024-12-25 00:30:41', 'b0f8549f-2ee0-451d-8a29-4cde92d20951');
INSERT INTO `result_papers` VALUES (24, '12', '会议论文集', NULL, 2, NULL, '123', '[\"SCIE\", \"SSCI\"]', '2024-10-01 00:00:00', NULL, NULL, NULL, NULL, NULL, '[{\"name\": \"\", \"rank\": null, \"identity\": \"\", \"institution\": \"\", \"coFirstAuthor\": false, \"corresponding\": false}]', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, '2024-12-24 21:26:44', '2024-12-25 00:30:41', 'b0f8549f-2ee0-451d-8a29-4cde92d20951');
INSERT INTO `result_papers` VALUES (41, '21111111111111111', '会议论文集', NULL, 1, NULL, '2', '[\"SSCI\",\"SCIE\"]', '2024-11-21 00:00:00', NULL, NULL, NULL, NULL, NULL, '[{\"rank\":1,\"name\":\"1\",\"identity\":\"博士生\",\"institution\":\"1\",\"corresponding\":false,\"coFirstAuthor\":false}]', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'c25e9e9f-f056-4750-a8be-d62685fa9b26.pdf', NULL, '2024-12-24 21:26:44', '2024-12-25 00:30:41', 'b0f8549f-2ee0-451d-8a29-4cde92d20951');

-- ----------------------------
-- Table structure for result_patents
-- ----------------------------
DROP TABLE IF EXISTS `result_patents`;
CREATE TABLE `result_patents`  (
                                   `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键，自动递增的专利ID',
                                   `patent_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '专利名称',
                                   `patent_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '专利类型',
                                   `patent_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '专利状态',
                                   `patent_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '专利编号',
                                   `patent_owner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '专利权人',
                                   `authorization_date` timestamp(0) NULL DEFAULT NULL COMMENT '授权公告日',
                                   `application_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '申请编号',
                                   `application_date` timestamp(0) NULL DEFAULT NULL COMMENT '专利申请日',
                                   `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                   `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                   `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                   `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息',
                                   `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步',
                                   `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                   `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                   `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                   `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '专利信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_patents
-- ----------------------------

-- ----------------------------
-- Table structure for result_personal_award
-- ----------------------------
DROP TABLE IF EXISTS `result_personal_award`;
CREATE TABLE `result_personal_award`  (
                                          `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '荣誉ID',
                                          `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '荣誉名称',
                                          `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                          `award_level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '获奖名次',
                                          `level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '级别',
                                          `granting_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '授予单位',
                                          `award_time` timestamp(0) NOT NULL COMMENT '获奖时间',
                                          `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                          `project_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '关联课题ID',
                                          `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者',
                                          `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '成果同步',
                                          `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                          `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                          `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                          `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                          PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '个人获奖表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_personal_award
-- ----------------------------

-- ----------------------------
-- Table structure for result_publication
-- ----------------------------
DROP TABLE IF EXISTS `result_publication`;
CREATE TABLE `result_publication`  (
                                       `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '著作ID',
                                       `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '著作名称',
                                       `isbn` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出版号',
                                       `role` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '身份',
                                       `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                       `publisher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '出版社',
                                       `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '著作类型',
                                       `word_count` decimal(10, 1) NULL DEFAULT NULL COMMENT '字数(千字)',
                                       `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出版地',
                                       `publish_date` date NOT NULL COMMENT '出版时间',
                                       `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                       `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                       `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息',
                                       `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步',
                                       `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                       `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                       `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                       `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                       PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '著作信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_publication
-- ----------------------------

-- ----------------------------
-- Table structure for result_report
-- ----------------------------
DROP TABLE IF EXISTS `result_report`;
CREATE TABLE `result_report`  (
                                  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
                                  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '新闻事件标题',
                                  `media_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '媒体名称',
                                  `media_level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '媒体级别',
                                  `report_time` datetime(0) NOT NULL COMMENT '报道时间',
                                  `column_section` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '栏目/版面',
                                  `online_link` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '在线链接',
                                  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                  `project_id` int(0) NULL DEFAULT NULL COMMENT '关联课题',
                                  `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成果同步状态',
                                  `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                  `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                  `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '新闻报道上传表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_report
-- ----------------------------

-- ----------------------------
-- Table structure for result_student_award
-- ----------------------------
DROP TABLE IF EXISTS `result_student_award`;
CREATE TABLE `result_student_award`  (
                                         `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '奖项ID',
                                         `competition_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '比赛名称',
                                         `award_students` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '获奖学生',
                                         `author_rank` int(0) NOT NULL COMMENT '本人排名',
                                         `award_level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '获奖名次',
                                         `level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '级别',
                                         `granting_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '授予单位',
                                         `award_time` timestamp(0) NOT NULL COMMENT '获奖时间',
                                         `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注信息',
                                         `project_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '关联课题ID',
                                         `author_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '作者信息',
                                         `sync_status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '同步状态',
                                         `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
                                         `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                         `pdf_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                         `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '学生获奖信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_student_award
-- ----------------------------

-- ----------------------------
-- Table structure for sys_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin`  (
                              `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
                              `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
                              `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
                              `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
                              `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
                              `updated_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
                              PRIMARY KEY (`id`) USING BTREE,
                              UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '管理员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_admin
-- ----------------------------
INSERT INTO `sys_admin` VALUES (1, 'admin', 'password123', 'admin@example.com', '2024-12-24 22:04:42', '2024-12-24 22:04:42');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
                             `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '管理员的唯一标识符',
                             `userAccount` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户的的用户名，用于登录',
                             `userPassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户的的密码，通常需要加密存储',
                             `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '管理员的电子邮件地址',
                             `status` enum('active','inactive','locked') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT 'active' COMMENT '管理员的状态（激活、禁用、锁定）',
                             `created_at` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间，记录账号的创建时间',
                             `last_login_at` timestamp(0) NULL DEFAULT NULL COMMENT '最后登录时间，记录最后一次登录',
                             `login_attempts` int(0) NULL DEFAULT 0 COMMENT '登录尝试次数，用于安全管理',
                             `userAvatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '管理员的头像（可选），用于展示',
                             `userPhone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电话号码（可选），用于联系或身份验证',
                             `userName` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户昵称',
                             `userRole` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                             `openId` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                             `highestDegree` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                             PRIMARY KEY (`id`) USING BTREE,
                             UNIQUE INDEX `username`(`userAccount`) USING BTREE,
                             UNIQUE INDEX `email`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '管理员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (4, '吴厚霖111', '26a1f9a0cceb264dc1637ab22830a41b', NULL, 'active', '2024-09-30 13:39:38', NULL, 0, NULL, NULL, '1', NULL, 'b0f8549f-2ee0-451d-8a29-4cde92d20951', '博士');

SET FOREIGN_KEY_CHECKS = 1;
