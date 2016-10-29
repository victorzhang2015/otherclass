package com.victor.test;

import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.victor.entity.Account;
import com.victor.entity.Service;
import com.victor.util.HibernateUtil;

public class TestOneToMany {
	@Test
	public void test1(){
		Session session = HibernateUtil.getSession();
		Account account = (Account) session.get(Account.class,1);
		System.out.println(account.getLoginName());
		System.out.println("=========================");
		Set<Service> services =account.getServices();
		for(Service service:services){
			System.out.println(service.getOsUserName());
		}
		session.close();
	}
}
