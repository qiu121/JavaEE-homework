package com.github.qiu121.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private final static long serialVersionUID = -8892097067287796128L;
    /**
     * 学号
     */
    private Integer id;
    /**
     * 年龄
     */
    private String age;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 学科
     */
    private String subject;
}
