package com.victor.life;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//通过applicationContext获取bean
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/victor/life/beans.xml");
		PersonService p=(PersonService) ac.getBean("personService");
		p.sayHi();
		//通过BeanFactory获取bean
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/life/beans.xml"));
//		PersonService p1 =(PersonService) factory.getBean("personService");
//		p1.sayHi();
		         
	}
}
