package com.shimh.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shimh.mapper.UserMapper;
import com.shimh.model.User;
import com.shimh.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Transactional(readOnly=true)
	public Map getUserMapById(Integer id) {
		return userMapper.getUserMapById(id);
	}

	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}

	@Transactional(readOnly=true)
	public User getUserRoleAndPermissionByUserId(Integer id) {
		return userMapper.getUserRoleAndPermissionByUserId(id);
	}

	@Transactional
	public void saveUser(User user) {
		userMapper.saveUser(user);		
	}
	@Transactional
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
	@Transactional
	public void removeUser(Integer id) {
		userMapper.removeUser(id);		
	}

}
