package com.shimh.service;

import java.util.Map;

import com.shimh.model.User;

public interface UserService {
	
	Map getUserMapById(Integer id);
	
	User getUserById(Integer id);
	
	User getUserRoleAndPermissionByUserId(Integer id);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void removeUser(Integer id);
}
