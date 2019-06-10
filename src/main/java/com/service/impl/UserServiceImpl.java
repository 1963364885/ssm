package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public int add(User user) {
         user.setUsername("456781324");
         user.setPassword("45678912");
         user.setName("456789");
        return userDao.add(user);
    }
    public int del(User user) {
        user.setId(178);
        return userDao.del(user);
    }

    public int update(User user) {
        user.setId(168);
        user.setUsername("4567813249");
        user.setPassword("456789129");
        user.setName("4567899");
        return userDao.update(user);
    }



    public List<User> search() {
        return userDao.search();
    }
}
