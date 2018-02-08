package com.shimh.mapper;

import java.util.Map;

import org.junit.Test;

import com.shimh.BaseTest;
import com.shimh.model.Role;
import com.shimh.model.User;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class RoleMapperTest extends BaseTest{
	
	@Test
	public void save(){
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		Role role = new Role();
		role.setName("role1");
		role.setRoleCode("roleCode1");
		mapper.saveRole(role);
		sqlSession.commit();
	}
	
	@Test
	public void update(){
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		Role role = new Role();
		role.setId(3);
		role.setName("role11");
		role.setRoleCode("roleCode11");
		mapper.updateRole(role);
		sqlSession.commit();
	}
	
	@Test
	public void getUserMapById(){
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		Map r = mapper.getRoleMapById(1);
		System.out.println(r);
	}
	
	@Test
	public void getUserById(){
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		Role r = mapper.getRoleById(1);
		System.out.println(r);
	}
	
	@Test
	public void getUserRoleAndPermissionByUserId(){
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		Role r = mapper.getRoleAndPermissionByRoleId(1);
		System.out.println(r);
	}
}
