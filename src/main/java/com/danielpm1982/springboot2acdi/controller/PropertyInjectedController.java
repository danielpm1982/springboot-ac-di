package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(String name){
        return greetingService.greet(name);
    }
}
