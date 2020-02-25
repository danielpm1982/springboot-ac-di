package com.danielpm1982.springboot2acdi.controller;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
    public String welcome(String name){
        return "Welcome "+name+" !";
    }
}
