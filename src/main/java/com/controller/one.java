package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/main")
public class one {
    @RequestMapping(value="/adv", method = RequestMethod.GET)
    @ResponseBody
    public String one(){
        return "test Web";
    }
}
