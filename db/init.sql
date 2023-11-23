# 创建初始化数据库
CREATE DATABASE `student25` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

# 用户表
CREATE TABLE `student25`.`user25`
(
    # id自增无法正常注册，学号自增
    `id`      INT         NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    `age`     INT         NOT NULL COMMENT '年龄',
    `name`    VARCHAR(50) NOT NULL COMMENT '姓名',
    `sex`     TINYINT     NOT NULL COMMENT '性别',
    `pwd`     VARCHAR(50) NOT NULL COMMENT '密码',
    `subject` VARCHAR(50) NOT NULL COMMENT '学科'

) ENGINE = InnoDB
  DEFAULT CHARACTER SET utf8mb4 COMMENT '用户表';
