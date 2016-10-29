package com.victor.test;

import java.sql.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.victor.entity.Emp;
import com.victor.util.HibernateUtil;

public class TestEmp {
	Session session = HibernateUtil.getSession();
	Transaction ts = session.beginTransaction();
	@Test
	public void add(){
		Emp e = new Emp();
		e.setName("jack");
		e.setAge(29);
		e.setSalary(1.2);
		e.setMarry(false);
		e.setBirthday(Date.valueOf("1983-10-20"));
		try{
			session.save(e);
			ts.commit();
		}catch(HibernateException e1){
			ts.rollback();
		}finally{
			session.close();
		}
	}

	public void findById(){
		try{
			Emp e =(Emp) session.get(Emp.class, 1);
			System.out.println(e.getName());
			System.out.println(e.getAge());
		}catch(HibernateException e1){
			ts.rollback();
		}finally{
			session.close();
		}
	}
	//@Test
	public void update(){
		Emp e =(Emp) session.get(Emp.class, 1);
		e.setName("jack1");
		e.setAge(30);
		try{
			session.update(e);
			ts.commit();
		}catch(HibernateException e1){
			ts.rollback();
		}finally{
			session.close();
		}
	}
	//@Test
	public void delete(){
		Emp e =(Emp) session.get(Emp.class, 1);
		try{
			session.delete(e);
			ts.commit();
		}catch(HibernateException e1){
			ts.rollback();
		}finally{
			session.close();
		}
	}
	@Test
	public void findAll(){
		Query query =session.createQuery("from Emp");
		List<Emp> list = query.list();
		for(Emp e:list){
			System.out.println(e.getName());
		}
		session.close();
	}
}
