package com.example.mybatis.service.impl;

import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.pojo.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(Integer userId) {
        return userMapper.findUserById(userId);
    }
}
