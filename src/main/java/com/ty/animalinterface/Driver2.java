package com.ty.animalinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal2.xml");
		Food food=(Food) applicationContext.getBean("food");
		food.animalEat();
	}
}
