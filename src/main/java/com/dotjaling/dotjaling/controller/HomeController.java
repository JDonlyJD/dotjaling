package com.dotjaling.dotjaling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login.html")
    public String login(){
        return "login.html";
    }

    @GetMapping("/register.html")
    public String register(){
        return "register.html";
    }

}
