package com.ty.springxml4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MobSim.xml");
		Sim sim=(Sim) applicationContext.getBean("sim");
		
	}
}
