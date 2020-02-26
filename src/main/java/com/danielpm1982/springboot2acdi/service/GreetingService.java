package com.danielpm1982.springboot2acdi.service;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    String greet(String nameToBeGreeted);
}
