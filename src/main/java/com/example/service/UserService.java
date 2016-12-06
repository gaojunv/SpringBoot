package com.example.service;

import com.example.entity.Test;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private  UserMapper userMapper;

    public Test getUserNum(){
        return userMapper.queryAll();
    }
}
