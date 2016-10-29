package com.victor.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {
	private String name;
	private String[] empName;
	private List<Employee> list;
	private Set<Employee> set;
	private Map<String,Employee> map;
	private Properties pp;
	public Properties getPp() {
		return pp;
	}

	public void setPp(Properties pp) {
		this.pp = pp;
	}

	public Map<String, Employee> getMap() {
		return map;
	}

	public void setMap(Map<String, Employee> map) {
		this.map = map;
	}

	public Set<Employee> getSet() {
		return set;
	}

	public void setSet(Set<Employee> set) {
		this.set = set;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getEmpName() {
		return empName;
	}

	public void setEmpName(String[] empName) {
		this.empName = empName;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public void show() {
		System.out.println("部门名称" + name);
		if (empName.length != 0) {
			for (String name1 : empName) {
				System.out.println("组员名字为" + name1);
			}

		}

	}
}
