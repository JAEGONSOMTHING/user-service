package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final Greeting greeting;



    @GetMapping("/health_check")
    public String healthCheck(){
        return "It's Working";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return greeting.getMessage();
    }


}
