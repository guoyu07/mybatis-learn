package com.shimh.mapper;

import java.util.Map;

import org.junit.Test;

import com.shimh.BaseTest;
import com.shimh.model.User;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class UserMapperTest extends BaseTest{
	
	@Test
	public void save(){
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User u = new User();
		u.setName("shimh2");
		u.setAge(2);
		mapper.saveUser(u);
		sqlSession.commit();
	}
	
	
	@Test
	public void getUserMapById(){
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		Map u = mapper.getUserMapById(1);
		System.out.println(u);
	}
	
	@Test
	public void getUserById(){
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User u = mapper.getUserById(1);
		System.out.println(u);
	}
	
	@Test
	public void getUserRoleAndPermissionByUserId(){
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User u = mapper.getUserRoleAndPermissionByUserId(1);
		System.out.println(u);
	}
}
