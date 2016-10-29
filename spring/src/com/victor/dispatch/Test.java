package com.victor.dispatch;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//通过BeanFactory获取bean
				BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/dispatch/beans.xml"));
				DBUtil db =(DBUtil) factory.getBean("dbutil");
				System.out.println(db.getAge()+db.getName()+db.getPassWord());
	}
		
}