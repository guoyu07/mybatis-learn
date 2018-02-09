package com.shimh.service;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.shimh.mapper.RoleMapper;
import com.shimh.model.Role;
import com.shimh.model.User;
import com.shimh.service.impl.RoleService;

import config.MybatisConfig;
/**
 * 
 * @author shimh
 *
 * 2018年2月9日
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MybatisConfig.class)
public class RoleServiceTest {
	
	@Autowired
	private RoleService roleService;

	@Test
	public void save(){
		Role role = new Role();
		role.setName("role1");
		role.setRoleCode("roleCode1");
		roleService.saveRole(role);
	}
	
	@Test
	public void update(){
		Role role = new Role();
		role.setId(3);
		role.setName("role11");
		role.setRoleCode("roleCode11");
		roleService.updateRole(role);
	}
	
	@Test
	public void getUserMapById(){
		Map r = roleService.getRoleMapById(1);
		System.out.println(r);
	}
	
	@Test
	public void getUserById(){
		Role r = roleService.getRoleById(1);
		System.out.println(r);
	}
	
	@Test
	public void getUserRoleAndPermissionByUserId(){
		Role r = roleService.getRoleAndPermissionByRoleId(1);
		System.out.println(r);
	}
}
