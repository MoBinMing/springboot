package com.mobinming.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HitchController {
    @RequestMapping("/")
    public String indexUrl(Map<String,Object> map) {
        map.put("text","<h1>这是th:text=\"${text}\"</h1>");
        map.put("utext","<h1>这是th:text=\"${utext}\"</h1>");
        map.put("v","<h1>这是[[${v}]]取值</h1>");
        map.put("v1","<h1>这是[(${v})]取值</h1>");
        map.put("users", Arrays.asList("张三","李四","仙五"));
        return "thymeleaf";
    }
}