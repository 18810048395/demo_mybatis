package com.example.mybatis.service;


import com.example.mybatis.pojo.User;

import java.util.List;

/**
 * UserService
 * @author v_jingwen
 *
 */
public interface UserService {

    List<User> findAll();

    User findUserById(Integer userId);
}