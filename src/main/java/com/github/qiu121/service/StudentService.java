package com.github.qiu121.service;

import com.github.qiu121.entity.Student;

import java.util.List;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 */
public interface StudentService {
    boolean add(Student student);

    boolean delete(Long id);

    boolean update(Student student);

    List<Student> list();
}
