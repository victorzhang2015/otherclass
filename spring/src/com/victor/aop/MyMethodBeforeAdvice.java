package com.victor.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * method:�����õķ���������
	 * object[]:��method���ݵĲ�����ֵ
	 * object:Ŀ�����
	 * 
	 * 
	 */
	@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��¼��־"+method.getName());
	}

}
