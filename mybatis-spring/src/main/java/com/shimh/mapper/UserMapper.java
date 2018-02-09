package com.shimh.mapper;

import java.util.Map;

import com.shimh.model.User;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public interface UserMapper {
	
	Map getUserMapById(Integer id);
	
	User getUserById(Integer id);
	
	User getUserRoleAndPermissionByUserId(Integer id);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void removeUser(Integer id);
}
