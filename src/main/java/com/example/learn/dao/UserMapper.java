package com.example.learn.dao;

import com.example.learn.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(String unionId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String unionId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}