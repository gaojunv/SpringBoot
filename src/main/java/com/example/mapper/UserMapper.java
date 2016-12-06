package com.example.mapper;

import com.example.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Test queryAll();

}