package com.example.rest.mapper;

import com.example.core.model.Authority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorityMapper {

    List<Authority> getAuthorityByUserName(String userName);

}