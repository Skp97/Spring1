package com.ty.springxml3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TeacherDriver {
	public static void main(String[] args) {
		/*Resource resource=new ClassPathResource("StuTea.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Teacher teacher=(Teacher) beanFactory.getBean("teacher");*/
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("StuTea.xml");
		Teacher teacher=(Teacher) applicationContext.getBean("teacher");
		System.out.println(teacher.getId());
		System.out.println(teacher.getName());
		System.out.println(teacher.getAddress());
		System.out.println(teacher.getStudent().getEmail());
		
	}
}
