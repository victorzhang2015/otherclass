package com.victor.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyException implements ThrowsAdvice {
	public void afterThrowing(Method m,Object[] os,Object target,Exception e){
		System.out.println("��������"+e.getMessage());
	}
}
