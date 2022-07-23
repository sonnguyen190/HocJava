package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "greetingService")
public class GreetingService {
	
	@Autowired 
	private Language language;
	
	
	public void sayGreeting() {
	       String greeting = language.getGreeting();
	       System.out.println("Greeting: " + greeting);
	   }
}

