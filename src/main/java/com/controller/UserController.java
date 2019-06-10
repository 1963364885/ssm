package com.controller;


import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserService userService;

    @RequestMapping("/search")
    @ResponseBody
    public List<User>  search (User user) {
        List<User> list = userService.search();
        return list;
    }
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(User user) {
        userService.add(user);
        return "123";
    }
    @RequestMapping("/del")
    @ResponseBody
    public String delUser(User user) {
        userService.del(user);
        return "456";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(User user) {
        userService.update(user);
        return "789";
    }
}
