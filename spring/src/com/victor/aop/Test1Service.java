package com.victor.aop;

public class Test1Service implements ServiceInterface,ServiceInterface2{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hi "+name);
	}
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("bye "+name);
	}
}
