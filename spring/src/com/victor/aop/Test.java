package com.victor.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/victor/aop/beans.xml");
		ServiceInterface server1 =(ServiceInterface) ac.getBean("proxyFactoryBean");
		//ServiceInterface2 server2 =(ServiceInterface2) ac.getBean("proxyFactoryBean");
		server1.sayHello();
		System.out.println("=============================");
		ServiceInterface2 server2=(ServiceInterface2) server1;
		server2.sayBye();
		
	}
}
