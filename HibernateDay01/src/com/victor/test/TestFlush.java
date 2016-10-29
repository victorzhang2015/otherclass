package com.victor.test;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.victor.entity.Emp;
import com.victor.util.HibernateUtil;

public class TestFlush {
	//@Test
	public void Test1(){
		Emp e = new Emp();
		e.setName("zhangsan");
		e.setAge(45);
		e.setBirthday(Date.valueOf("1920-2-2"));
		e.setMarry(true);
		e.setSalary(129.33);
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		session.save(e);
		ts.commit();
		Emp e1 = (Emp) session.get(Emp.class, e.getId());
		System.out.println(e.getName());
	}
	//@Test
	public void Test2(){
		Emp e = new Emp();
		e.setName("zhangsan1");
		e.setAge(45);
		e.setBirthday(Date.valueOf("1920-2-2"));
		e.setMarry(true);
		e.setSalary(129.33);
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		session.save(e);
		e.setName("change");
		ts.commit();
		session.close();
	}
	@Test
	public void Test3(){
		Session session = HibernateUtil.getSession();
		Emp e =(Emp) session.get(Emp.class, 17);
		e.setName("zhangs");
		session.flush();
		session.close();
	}
}
