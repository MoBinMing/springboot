package com.mobinming.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class HelloJspController{
    @RequestMapping("/")
    public String getListaUtentiView(HttpServletRequest request){
        request.setAttribute("name", "我是/webapp/WEB-INF/views/index.jsp");
        return "index";
    }
}
