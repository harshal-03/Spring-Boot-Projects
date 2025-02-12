package com.telsukoHarshal.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greets(){
        return "Welcome home!!";

    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "We are here to learn Spring Boot";
    }
}
