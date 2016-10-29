package com.victor.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//ͨ��applicationContext��ȡbean
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/victor/life/beans.xml");
		PersonService p=(PersonService) ac.getBean("personService");
		p.sayHi();
		//ͨ��BeanFactory��ȡbean
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/life/beans.xml"));
//		PersonService p1 =(PersonService) factory.getBean("personService");
//		p1.sayHi();
		         
	}
}
