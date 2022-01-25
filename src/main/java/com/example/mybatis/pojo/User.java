package com.example.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private Integer userId;

    private String userName;

    private String userSex;

    private String userAddress;
}