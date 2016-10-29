package com.victor.constructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//通过BeanFactory获取bean
				BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/constructor/beans.xml"));
				Employee e =(Employee) factory.getBean("employee");
				System.out.println(e.getAge()+e.getName());
	}
		
}