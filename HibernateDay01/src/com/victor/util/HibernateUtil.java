package com.victor.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	public static SessionFactory sessionFactory;
	static{
		Configuration conf = new Configuration();
		conf.configure("/hibernate.cfg.xml");
		sessionFactory=conf.buildSessionFactory();
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	public static void main(String[] args) {
		System.out.println(getSession());
	}
}
