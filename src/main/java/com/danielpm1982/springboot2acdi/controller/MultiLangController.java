package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MultiLangController {
    private GreetingService greetingService;
    public MultiLangController(@Qualifier("greetingServiceMultiLang")GreetingService greetingService){ //setting a dubious @Qualifier for a bean with multiple profiles. From these beans who match this qualifier name, the one to be injected will depend also on the profile value (set at the application.properties or set as default)
        this.greetingService = greetingService;
    }
    public String getGreeting(String name){
        return greetingService.greet(name);
    }
}
