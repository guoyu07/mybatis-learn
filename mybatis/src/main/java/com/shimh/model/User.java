package com.shimh.model;

import java.util.List;

/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class User {
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private List<Role> roles;
	
	private UserStatus status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", roles=" + roles + ", status=" + status + "]";
	}
	
	
	
	
}
