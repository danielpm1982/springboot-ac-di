package com.danielpm1982.springboot2acdi.controller;
import com.danielpm1982.springboot2acdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()); //manually simulating the instantiation and setter injection of the GreetingService bean at the Controller, for later being used at the Controller methods. When injected, the bean instance would be accessable through a Controller property to all Controller methods, as in all 3 types of bean injection. This would be a setter-injection strategy.
    }
    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting("John Smith")); //testing the use of the setter injected bean from inside a Controller method.
    }
}
