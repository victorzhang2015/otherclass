package com.victor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ChangerLetter changer =ac.getBean(ChangerLetter.class);
		System.out.println(changer.change());
	}
}
