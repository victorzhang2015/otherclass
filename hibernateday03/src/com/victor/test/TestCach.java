package com.victor.test;

import java.sql.Date;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.victor.entity.Account;
import com.victor.entity.Service;
import com.victor.util.HibernateUtil;

public class TestCach {
	//@Test
	public void test1(){
		
		Account account = new Account();
		account.setLoginName("risk");
		account.setLoginPassword("12345");
		account.setStatue("yes");
		account.setRecommenderId(12345);
		account.setCreateDate(Date.valueOf("2012-12-02"));
		Service service1 = new Service();
		service1.setAccount(account);
		service1.setCreateDate(Date.valueOf("2012-11-1"));
		service1.setLoginPassword("12345");
		service1.setOsUserName("op1");
		service1.setStatue("yes");
		service1.setUnixHost("123.12.1");
		
		Service service2 = new Service();
		service2.setAccount(account);
		service2.setCreateDate(Date.valueOf("2012-11-1"));
		service2.setLoginPassword("1234567");
		service2.setOsUserName("op2");
		service2.setStatue("no");
		service2.setUnixHost("123.12.2");
		
		account.setServices(new HashSet<Service>());
		account.getServices().add(service1);
		account.getServices().add(service2);
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		try{
			session.save(account);
			ts.commit();
		}catch(Exception e){
			ts.rollback();
		}finally{
			session.close();
		}
	}
	@Test
	public void test2(){
		Session session = HibernateUtil.getSession();
		Transaction ts =session.beginTransaction();
		Account a =(Account) session.get(Account.class, 6);
		try{
			session.delete(a);
			ts.commit();
		}catch(Exception e){
			ts.rollback();
		}finally{
			session.close();
		}
	}
}
