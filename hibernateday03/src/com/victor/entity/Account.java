package com.victor.entity;

import java.sql.Date;
import java.util.Set;

public class Account {
	private Integer id;
	private Integer recommenderId;
	private String loginName;
	private String loginPassword;
	private String statue;
	public Set<Service> getServices() {
		return services;
	}
	public void setServices(Set<Service> services) {
		this.services = services;
	}
	private Date createDate;
	private Set<Service> services;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRecommenderId() {
		return recommenderId;
	}
	public void setRecommenderId(Integer recommenderId) {
		this.recommenderId = recommenderId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
