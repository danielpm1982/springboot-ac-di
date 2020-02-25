package com.danielpm1982.springboot2acdi;
import com.danielpm1982.springboot2acdi.controller.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class Springboot2AcDiApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springboot2AcDiApplication.class, args);
		System.out.println("Application Context registered beans name list:");
		Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("***********************************************************************************");
		System.out.println("Getting instance of welcomeController bean from Application Context:");
		System.out.println(ctx.getBean("welcomeController"));
		System.out.println("Executing 'welcomeController' bean welcome() method:");
		System.out.println(((WelcomeController)ctx.getBean("welcomeController")).welcome("John Smith"));
		System.out.println("***********************************************************************************");
	}
}

/*
For now, this app receives the Application Context, gets and shows all beans names list registered at it
and then gets specifically the 'welcomeController' bean to call its method welcome(), passes a person name,
as argument, and finally gets the return from that controller method.
This example shows that all beans are instantiated automatically, using inversion of control, and then
the programmer can get one of its instances by requesting to the Application Context, using the name
of the bean, which by default is the name of the Annotated class begining with lowercase. This instance
from the Application Context can then be injected at the requesting class, preferably through a Constructor.
*/
