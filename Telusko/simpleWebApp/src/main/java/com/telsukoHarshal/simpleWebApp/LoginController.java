package com.telsukoHarshal.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // as we are using RestController instead of Controller we don't need to use ResponseBody
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "here you perfom login";
    }
}
