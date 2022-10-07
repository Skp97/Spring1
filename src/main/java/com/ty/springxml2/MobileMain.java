package com.ty.springxml2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MobileMain {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("ForMobile.xml") ;
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Mobile mobile=(Mobile)beanFactory.getBean("mobile");
		//System.out.println(mobile.name);//Without  Setter error
		//System.out.println(mobile.price);//Without Setter error as Properties tag internally uses setter method to set the values
		System.out.println(mobile.getName());//Highest priority is for property tag
		System.out.println(mobile.getPrice());
	}
}
