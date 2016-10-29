package com.victor.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App1 {
	public static void main(String[] args) {
		//从applicationContext取
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/victor/ioc/beans.xml");
		/*student student1 = (com.victor.ioc.student) ac.getBean("student");
		student student2 = (com.victor.ioc.student) ac.getBean("student");
		System.out.println(student1==student2);*/
		
//		student.printname();
		//从bean工厂取
//		BeanFactory factory= new XmlBeanFactory( new ClassPathResource("com/victor/ioc/beans.xml"));
//		factory.getBean("student");
		ApplicationContext ac = new FileSys
	}
}
