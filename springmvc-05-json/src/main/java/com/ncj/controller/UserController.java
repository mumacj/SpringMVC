package com.ncj.controller;

import com.alibaba.fastjson.JSON;
import com.ncj.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    @RequestMapping("/j1")
    @ResponseBody
    public String json1(){
        User user = new User("ncj",22,"男");

        return user.toString();

    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2(){
        User user1 = new User("ncj",22,"男");
        User user2 = new User("ncj1",22,"男");
        User user3 = new User("ncj2",22,"男");
        User user4 = new User("ncj3",22,"男");
        User user5 = new User("ncj4",22,"男");
        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return JSON.toJSONString(users);
    }
}
