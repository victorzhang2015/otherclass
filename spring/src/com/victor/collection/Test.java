package com.victor.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		//ͨ��BeanFactory��ȡbean
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/victor/collection/beans.xml"));
		Department d1 =(Department) factory.getBean("department");
		d1.show();
		System.out.println("==============list====================");
		for(Employee emp:d1.getList()){
			System.out.println("��Ա����Ϊ:"+emp.getName());
		}
		System.out.println("==============set=====================");
		for(Employee emp:d1.getSet()){
			System.out.println("��Ա����Ϊ:"+emp.getName());
		}
		//ͨ��applicationContext��ȡbean
       // ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("===============map====================");
		for(Entry<String,Employee> e:d1.getMap().entrySet()){
			System.out.println(e.getKey()+"    "+e.getValue().getName());
		}
		System.out.println("===============map������====================");
		Iterator it = d1.getMap().keySet().iterator();
		while(it.hasNext()){
			Employee e = d1.getMap().get(it.next());
			System.out.println(e.getName());
		}
		System.out.println("===============properties====================");
		Properties pp=d1.getPp();
		for(Entry<Object, Object> entry:pp.entrySet()){
			System.out.println(entry.getKey().toString()+entry.getValue().toString());
			
		}
		System.out.println("===============properties   Enumeration===========");

		Enumeration e =pp.keys();
		while(e.hasMoreElements()){
			String key=(String) e.nextElement();
			System.out.println(key+pp.getProperty(key));
		}
	}
}
