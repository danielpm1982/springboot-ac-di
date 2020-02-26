package com.danielpm1982.springboot2acdi;
import com.danielpm1982.springboot2acdi.controller.ConstructorInjectedController;
import com.danielpm1982.springboot2acdi.controller.PropertyInjectedController;
import com.danielpm1982.springboot2acdi.controller.SetterInjectedController;
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
		System.out.println("Getting a PropertyInjectedController instance and calling its getGreeting method, which uses the injected GreetingService bean:");
		System.out.println(((PropertyInjectedController)ctx.getBean("propertyInjectedController")).getGreeting("John Smith"));
		System.out.println("Getting a SetterInjectedController instance and calling its getGreeting method, which uses the injected GreetingService bean:");
		System.out.println(((SetterInjectedController)ctx.getBean("setterInjectedController")).getGreeting("John Smith"));
		System.out.println("Getting a ConstructorInjectedController instance and calling its getGreeting method, which uses the injected GreetingService bean:");
		System.out.println(((ConstructorInjectedController)ctx.getBean("constructorInjectedController")).getGreeting("John Smith"));
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
For testing these features just run this main class. No test classes produced.
*/

/*
Then, it was added 3 Controller classes for demonstrating the 3 types of dependency injections, in this
case a GreetingService dependency that returns a greeting for a person name argument passed to it. The
At the JUnit5 testing classes, the GreetingService dependency, that could be a Spring bean, is then
instantiated and manually injected at the Controllers, according to each respective injection strategy.
See the Controller classes, the Service classes and the test classes for more for testing these new features.
*/

/*
Instead of instantiating and injecting the beans manually at the test classes, as if simulating the real
Spring Dependency Injection, now we actually use Spring to do all that, and simply get each Controller
bean from the Application Context and call its getGreeting() method that uses the GreetingService bean
already instantiated and injected, according to Annotations, at each Controller. The stereotype annotations
used are @Service and @Component at the service package and the @Controller and @Autowired
at the controller package. In the case of the ConstructorInjectedController no @Autowired annotation is
necessary if only one constructor is present. The testing of these new features can be done by running this
main class, as with the initial features. No test classes produced.
*/
