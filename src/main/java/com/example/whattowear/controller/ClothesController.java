package com.example.whattowear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClothesController {
    @GetMapping("/hello")
    public String helloBack(){
        return "Hello Back!";
    }
}
