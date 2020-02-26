package com.danielpm1982.springboot2acdi.service;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("greetingServiceMultiLang")
@Profile("ES")
public class GreetingServiceMultiLangEs implements GreetingService{
    @Override
    public String greet(String nameToBeGreeted) {
        return "Hola, "+nameToBeGreeted+" - en Español !";
    }
}
