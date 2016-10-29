package com.victor.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	public String execute(){
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1", "a1");
		return SUCCESS;
	}

	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application=application;
	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
}
