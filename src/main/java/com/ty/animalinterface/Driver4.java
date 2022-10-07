package com.ty.animalinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver4 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal2.xml");
		Food4 food4=(Food4) applicationContext.getBean("food4");
		food4.animalEat();
	}
}
