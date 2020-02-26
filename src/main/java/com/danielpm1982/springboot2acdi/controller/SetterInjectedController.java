package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    @Autowired
    @Qualifier("greetingServiceSetter")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(String name){
        return greetingService.greet(name);
    }
}