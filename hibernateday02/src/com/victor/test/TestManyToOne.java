package com.victor.test;

import org.hibernate.Session;
import org.junit.Test;

import com.victor.entity.Account;
import com.victor.entity.Service;
import com.victor.util.HibernateUtil;

public class TestManyToOne {
	@Test
	public void test1(){
		Session session = HibernateUtil.getSession();
		Service service =(Service) session.get(Service.class, 2);
		System.out.println(service.getOsUserName());
		System.out.println("==========================");
		Account account=service.getAccount();
		System.out.println(account.getLoginName());
		
	}
}
