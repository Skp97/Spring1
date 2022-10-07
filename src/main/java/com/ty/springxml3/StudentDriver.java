package com.ty.springxml3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentDriver {
	public static void main(String[] args) {
		
		/*Resource resource= new ClassPathResource("StuTea.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Student student=(Student) beanFactory.getBean("student");*/
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StuTea.xml");
		Student student=(Student) applicationContext.getBean("student");
		System.out.println(student.getId());
		System.out.println(student.getEmail());
		System.out.println(student.getName());
		System.out.println(student.getPhone());
		System.out.println(student);
		
		
	}
}
