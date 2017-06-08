package com.springdemo.service;

import com.springdemo.mapper.UserMapper;
import com.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iceke on 17/6/8.
 */
@Service
public class UserService {
    //自动依赖注入
    @Autowired
    private UserMapper userMapper;

    public User findById(int userId) {
        return userMapper.findById(userId);
    }

    public int deleteById(int userId) {
        return userMapper.deleteById(userId);
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }
}