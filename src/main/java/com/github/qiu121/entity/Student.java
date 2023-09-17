package com.github.qiu121.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 * @desc 学生实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {

    private static final long serialVersionUID = 4187529421594000219L;
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 专业
     */
    private String major;
    /**
     * 班级
     */
    private String className;
}
