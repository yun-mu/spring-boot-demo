package com.example.learn.service;

import com.example.learn.dao.UserMapper;
import com.example.learn.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String unionId) {
        return userMapper.selectByPrimaryKey(unionId);
    }

    public void insertUser(User user) {
        userMapper.insertSelective(user);
    }

    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
