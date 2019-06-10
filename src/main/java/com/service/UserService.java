package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    int add(User  user);
    int del(User user);
    int update(User user);

    List<User>search();
}
