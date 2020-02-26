package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;
    public ConstructorInjectedController(@Qualifier("greetingServiceConstructor") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(String name){
        return greetingService.greet(name);
    }
}
