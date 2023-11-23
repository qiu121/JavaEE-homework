package com.github.qiu121.service;

import com.github.qiu121.entity.User;
import com.github.qiu121.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public boolean login(int id, String password) {
        return userMapper.login(id, password) != null;
    }

    public boolean register(User user) {
        return userMapper.register(user) > 0;
    }

    public List<User> list() {
        return userMapper.list();
    }
}
