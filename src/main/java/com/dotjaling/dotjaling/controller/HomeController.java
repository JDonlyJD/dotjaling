package com.dotjaling.dotjaling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/view_main")
    public String view_main(){
        return "view_main";
    }

    @GetMapping("/view_detail")
    public String view_detail(){
        return "view_detail";
    }

}
