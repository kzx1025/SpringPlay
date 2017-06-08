package com.springdemo.mapper;

import com.springdemo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by iceke on 17/6/8.
 */
@Repository
public interface UserMapper {
    User findById(int userId);
    int deleteById(int userId);

    int insert(User user);

    int update(User user);

    List<User> getAll();
}
