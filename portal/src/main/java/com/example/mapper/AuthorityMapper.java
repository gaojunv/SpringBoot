package com.example.mapper;

import com.example.model.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorityMapper {

    List<Authority> getAuthorityByUserName(String userName);

}