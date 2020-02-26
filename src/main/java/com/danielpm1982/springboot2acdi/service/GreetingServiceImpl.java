package com.danielpm1982.springboot2acdi.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String nameToBeGreeted) {
        return "Hello, "+nameToBeGreeted+" !";
    }
}
