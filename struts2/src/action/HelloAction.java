package action;

import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
import entity.User;

//public class HelloAction extends ActionSupport implements ModelDriven<User> {
public class HelloAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String realName;
	public String getRealName() {
		return realName;
	}
	private User user;
	public void setRealName(String realName) {
		System.out.println("×¢Èë²ÎÊýrealname");
		this.realName = realName;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String add(){
		return SUCCESS;
	}
	public String sayHello(){
		System.out.println("hello,action");
		System.out.println("realName"+"  "+realName);
		System.out.println("name "+user.getUsername());
		System.out.println("password  "+user.getPassword());
		return "success";
	}

//	public User getModel() {
//		// TODO Auto-generated method stub
//		return user;
//	}
}
