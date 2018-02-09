package com.shimh.service;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.shimh.model.User;

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
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void save(){
		User u = new User();
		u.setName("shimh2");
		u.setAge(2);
		userService.saveUser(u);
	}
	
	@Test
	public void getUserMapById(){
		Map u = userService.getUserMapById(1);
		System.out.println(u);
	}
	
	@Test
	public void getUserById(){
		User u = userService.getUserById(1);
		System.out.println(u);
	}
	
	@Test
	public void getUserRoleAndPermissionByUserId(){
		User u = userService.getUserRoleAndPermissionByUserId(1);
		System.out.println(u);
	}
}
