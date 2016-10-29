package com.victor.aop;

public class Test2Service implements ServiceInterface2{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("bye "+name);
	}
}
