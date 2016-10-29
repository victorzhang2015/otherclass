package com.victor.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * method:被调用的方法的名字
	 * object[]:给method传递的参数的值
	 * object:目标对象
	 * 
	 * 
	 */
	@Override
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("记录日志"+method.getName());
	}

}
