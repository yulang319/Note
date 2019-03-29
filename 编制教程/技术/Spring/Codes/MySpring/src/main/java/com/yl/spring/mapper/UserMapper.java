package com.yl.spring.mapper;

import com.yl.spring.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> getUsers();

}
