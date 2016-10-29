package action;

import com.opensymphony.xwork2.ActionSupport;

public class Student extends ActionSupport{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String add(){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		return SUCCESS;
	}
	public String delete(){
		return ERROR;
	}
}
