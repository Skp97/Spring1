package com.ty.springxml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonMain {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("ForPerson.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Person person=(Person) beanFactory.getBean("person");
		person.walk();
	}
}
