package com.github.qiu121.dao;

import com.github.qiu121.entity.Student;

import java.util.List;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 */
public interface StudentDao {
    int insert(Student student);

    int delete(Long id);

    int update(Student student);

    List<Student> selectAll();
}
