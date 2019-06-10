package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    int add(@Param("Pojo")  User user);
    int del(@Param("Pojo") User user);
    int update(@Param("Pojo") User user);
    List<User> search();
}
