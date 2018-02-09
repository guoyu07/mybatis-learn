/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.shimh.model;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class Permission{

	private Integer id;
	
    private String name;
    
    private String permissionCold;

    private String description;

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

	public String getPermissionCold() {
		return permissionCold;
	}

	public void setPermissionCold(String permissionCold) {
		this.permissionCold = permissionCold;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", permissionCold=" + permissionCold + ", description="
				+ description + "]";
	}

   
}
