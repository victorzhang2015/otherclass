package com.victor.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("环绕通知 开始了");
		arg0.proceed();
		System.out.println("环绕通知 结束了");
		return null;
	}

}
