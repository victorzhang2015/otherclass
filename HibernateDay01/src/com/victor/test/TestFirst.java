package com.victor.test;

import org.hibernate.Session;
import org.junit.Test;

import com.victor.entity.Emp;
import com.victor.util.HibernateUtil;

public class TestFirst {
	
	//@Test
	public void test1(){
		Session session =HibernateUtil.getSession();
		Emp emp = (Emp) session.get(Emp.class, 3);
		System.out.println(emp.getName());
		System.out.println("===============================");
		Emp emp2 = (Emp) session.get(Emp.class, 3);
		System.out.println(emp2.getName());
	}
	//@Test
	public void test2(){
		Session session =HibernateUtil.getSession();
		Emp emp = (Emp) session.get(Emp.class, 3);
		System.out.println(emp.getName());
		System.out.println("===============================");
		session =HibernateUtil.getSession();
		Emp emp2 = (Emp) session.get(Emp.class, 3);
		System.out.println(emp2.getName());
	}
	@Test
	public void test3(){
		Session session =HibernateUtil.getSession();
		Emp emp = (Emp) session.get(Emp.class, 3);
		System.out.println(emp.getName());
		System.out.println("===============================");
		//session.clear();
		session.evict(emp);
		Emp emp2 = (Emp) session.get(Emp.class, 3);
		System.out.println(emp2.getName());
		session.close();
	}
	
	
}
