package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String add(){
		if(name==null||!"admin".equals(name)){
			this.addFieldError("name", "name is not right!");
			this.addFieldError("name", "name is too long!");
			return ERROR;
		}
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
