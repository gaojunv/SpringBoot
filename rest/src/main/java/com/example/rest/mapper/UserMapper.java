package com.example.rest.mapper;

import com.example.core.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryAll();

    User findByUsername(String username);
}