package com.ncj.controller;

import com.ncj.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {


    //@RequestParam注解的使用
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){

        model.addAttribute("msg",name);
        return "test";
    }


    //前端传参为user对象
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
}
