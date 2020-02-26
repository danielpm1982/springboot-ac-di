package com.danielpm1982.springboot2acdi.service;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String nameToBeGreeted) {
        return "Hello, "+nameToBeGreeted+" !";
    }
}
