package com.victor.ioc;

public class student {
	public student(){
		System.out.println("bean init");
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printname(){
		System.out.println(name);
	}
}
