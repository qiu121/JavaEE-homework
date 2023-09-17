package com.github.qiu121.service.impl;

import com.github.qiu121.dao.StudentDao;
import com.github.qiu121.entity.Student;
import com.github.qiu121.service.StudentService;
import lombok.Setter;

import java.util.List;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 */
// @Service
@Setter
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Override
    public boolean add(Student student) {
        return studentDao.insert(student) > 0;
    }

    @Override
    public boolean delete(Long id) {
        return studentDao.delete(id) > 0;
    }

    @Override
    public boolean update(Student student) {
        return studentDao.update(student) > 0;
    }

    @Override
    public List<Student> list() {
        return studentDao.selectAll();
    }
}
