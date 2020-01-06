package com.ncj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("user")
@Controller
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return"login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){

        session.setAttribute("userLoginInfo",username);
        return "main";
    }
}
