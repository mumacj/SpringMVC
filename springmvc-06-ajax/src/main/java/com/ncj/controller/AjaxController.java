package com.ncj.controller;

import org.junit.runners.Parameterized;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping(value = "/a1",produces = "text/html;charset=UTF-8")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if ("nnn".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }

    }
}
