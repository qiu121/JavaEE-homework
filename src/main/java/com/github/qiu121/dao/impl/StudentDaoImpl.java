package com.github.qiu121.dao.impl;

import com.github.qiu121.dao.StudentDao;
import com.github.qiu121.entity.Student;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 */
// @Repository
@Setter
public class StudentDaoImpl implements StudentDao {
    @Override
    public int insert(Student student) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public List<Student> selectAll() {
        Student student = Student.builder()
                .id(1L)
                .name("LiHua")
                .className("A2074")
                .gender("male")
                .major("Software Engineering")
                .build();
        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        return list;
    }
}
