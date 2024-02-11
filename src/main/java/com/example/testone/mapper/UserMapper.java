package com.example.testone.mapper;

import com.example.testone.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<user> findAll();

}
