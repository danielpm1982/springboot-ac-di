package com.danielpm1982.springboot2acdi.service;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceConstructor implements GreetingService {
    @Override
    public String greet(String nameToBeGreeted) {
        return "Hello, "+nameToBeGreeted+" from the ConstructorInjectedController !";
    }
}
