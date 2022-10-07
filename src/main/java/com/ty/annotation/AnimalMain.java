package com.ty.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal.xml");
		Animal animal=(Animal) applicationContext.getBean("animal");
		animal.eat();
	}
}
