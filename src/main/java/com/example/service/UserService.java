package com.example.service;

import com.example.mapper.AuthorityMapper;
import com.example.model.Authority;
import com.example.model.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private  UserMapper userMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    public List<User> getUserList(){
        List<User> users;
        users =  userMapper.queryAll();
        for (User user : users){
            String userName = user.getUsername();
            List<Authority> authorities = authorityMapper.getAuthorityByUserName(userName);
            user.setAuthorities(authorities);
        }
        return users;
    }

    public User findByUsername(String userName){
        User user =  userMapper.findByUsername(userName);
        List<Authority> authorities = authorityMapper.getAuthorityByUserName(userName);
        user.setAuthorities(authorities);

        return user;
    }
}
