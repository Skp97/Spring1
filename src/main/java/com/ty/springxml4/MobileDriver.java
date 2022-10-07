package com.ty.springxml4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MobSim.xml");
		Mobile mobile=(Mobile) applicationContext.getBean("mobile");
		System.out.println(mobile);
		System.out.println(mobile.getSim());
		
		
		
	}
}
