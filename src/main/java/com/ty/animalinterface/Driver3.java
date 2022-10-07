package com.ty.animalinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver3 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Animal2.xml");
		Food3 food3=(Food3) applicationContext.getBean("food3");
		food3.animalEat();
	}
}
