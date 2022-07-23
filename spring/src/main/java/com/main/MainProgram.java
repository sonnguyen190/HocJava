package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfiguration;
import com.service.GreetingService;
import com.service.Language;
import com.utils.MyComponent;

public class MainProgram {

	   public static void main(String[] args) {

	       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

	       Language language = (Language) context.getBean("language");
	     
	       System.out.println("Bean Language: "+ language);
	       System.out.println("Call language.sayBye(): "+ language.getBye());
	     
	       System.out.println("----------");
	     
	       GreetingService service = (GreetingService) context.getBean("greetingService");
	 
	       service.sayGreeting();
	 
	       System.out.println("----------");
	     
	       MyComponent myComponent = (MyComponent) context.getBean("myComponent");
	     
	       myComponent.showAppInfo();
	     
	   }
	 
	}