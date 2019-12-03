package com.ncj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");

        return "hello";
    }
}
