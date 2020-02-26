package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(String name){
        return greetingService.greet(name);
    }
}
