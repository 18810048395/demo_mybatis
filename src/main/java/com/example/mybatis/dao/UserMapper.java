package com.example.mybatis.dao;

import com.example.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    @Select("select * from t_user where user_id=#{userId}")
    User findUserById(Integer userId);
}
