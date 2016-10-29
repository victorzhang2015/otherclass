package com.victor.inherit;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//通过BeanFactory获取bean
				BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/inherit/beans.xml"));
				Graduate g1 = (Graduate) factory.getBean("graduate");
				System.out.println(g1.getName()+"  "+g1.getAge()+"  "+g1.getDegree());
	}
		
}