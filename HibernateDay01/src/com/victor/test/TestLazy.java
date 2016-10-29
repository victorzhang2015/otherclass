package com.victor.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.victor.entity.Emp;
import com.victor.util.HibernateUtil;

public class TestLazy {
	//@Test
	public void test1(){
		Session session = HibernateUtil.getSession();
		Emp emp =(Emp) session.get(Emp.class, 17);
		//Emp emp =(Emp) session.load(Emp.class, 17);
		System.out.println("==============");
		System.out.println(emp.getName());
		session.close();
	}
	@Test
	public void test2(){
		Session session = HibernateUtil.getSession();
		Query query =session.createQuery("from Emp");
		List<Emp> list =query.list();
		//Iterator<Emp> it= query.iterate();
		System.out.println("==============");
//		for(Emp emp:list){
//			System.out.println(emp.getName());
//		}
//		while(it.hasNext()){
//			System.out.println(it.next().getName());
//		}
		session.close();
	}
}
