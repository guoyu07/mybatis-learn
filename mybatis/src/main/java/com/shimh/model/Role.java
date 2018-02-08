package com.shimh.model;

import java.util.List;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class Role {
	
	private Integer id;
	
	private String name;
	
	private String roleCode;
	
	private List<Permission> permissions;

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

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", roleCode=" + roleCode + ", permissions=" + permissions + "]";
	}
	
	
}
