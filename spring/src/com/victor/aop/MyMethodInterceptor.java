package com.victor.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("����֪ͨ ��ʼ��");
		arg0.proceed();
		System.out.println("����֪ͨ ������");
		return null;
	}

}
