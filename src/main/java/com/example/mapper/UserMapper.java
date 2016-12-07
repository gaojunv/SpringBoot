package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    ArrayList<User> queryAll();

}