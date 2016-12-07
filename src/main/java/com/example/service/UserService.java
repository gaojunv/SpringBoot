package com.example.service;

import com.example.model.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private  UserMapper userMapper;

    public ArrayList<User> getUserList(){
        return userMapper.queryAll();
    }
}
