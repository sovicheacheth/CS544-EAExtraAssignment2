package edu.mum.cs544.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloapp");
		
		System.out.println(obj.getWelcome());
	}

}
