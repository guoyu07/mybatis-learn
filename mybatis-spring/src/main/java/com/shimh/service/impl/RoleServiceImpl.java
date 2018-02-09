package com.shimh.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shimh.mapper.RoleMapper;
import com.shimh.model.Role;
@Service
public class RoleServiceImpl implements RoleService{

	
	@Autowired
	private RoleMapper roleMapper;
	
	public Map getRoleMapById(Integer id) {
		return roleMapper.getRoleMapById(id);
	}

	public Role getRoleById(Integer id) {
		return roleMapper.getRoleById(id);
	}

	public Role getRoleAndPermissionByRoleId(Integer id) {
		return roleMapper.getRoleAndPermissionByRoleId(id);
	}

	@Transactional
	public void saveRole(Role role) {
		roleMapper.saveRole(role);		
	}
	@Transactional
	public void updateRole(Role role) {
		roleMapper.updateRole(role);		
	}
	@Transactional
	public void removeRole(Integer id) {
		roleMapper.removeRole(id);		
	}

}
