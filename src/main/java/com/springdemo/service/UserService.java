package com.springdemo.service;

import com.springdemo.mapper.UserMapper;
import com.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by iceke on 17/6/8.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService {
    //自动依赖注入
    @Autowired
    private UserMapper userMapper;

    public User findById(int userId) {
        return userMapper.findById(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int deleteById(int userId) {
        return userMapper.deleteById(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public int update(User user) {
        return userMapper.update(user);
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }
}