package com.ty.animalinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal2.xml");
		Animal animal1=(Animal) applicationContext.getBean("lion");
		Animal animal2=(Animal) applicationContext.getBean("cow");
		animal1.eat();
		animal2.eat();
		
	}
}
