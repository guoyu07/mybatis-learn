package com.shimh.service.impl;

import java.util.Map;

import com.shimh.model.Role;

public interface RoleService {
	Map getRoleMapById(Integer id);
	
	Role getRoleById(Integer id);
	
	Role getRoleAndPermissionByRoleId(Integer id);
	
	
	void saveRole(Role role);
	
	void updateRole(Role role);
	
	void removeRole(Integer id);
}
