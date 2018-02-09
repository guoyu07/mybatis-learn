package com.shimh.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.shimh.core.mybatis.RoleSqlProvider;
import com.shimh.model.Role;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public interface RoleMapper {
	
	@Select("select * from role where id = #{id}")
	Map getRoleMapById(Integer id);
	
	@Results(value={
		@Result(property = "id", column = "id", id = true),
		@Result(property = "name", column = "name"),
		@Result(property = "roleCode", column = "roleCode")
	})
	@Select("select * from role where id = #{id}")
	Role getRoleById(Integer id);
	
	@ResultMap(value = "roleAndPermissionResultMap")  //复杂嵌套要在xml配置
	@Select("select "
			+ "r.id as role_id,"
			+ "r.name as role_name,"
			+ "r.roleCode as role_roleCode,"
			+ "p.id as permission_id,"
			+ "p.name as permission_name,"
			+ "p.permissionCold as permission_permissionCold,"
			+ "p.description as permission_description "
		+ "from role r "
			+ "left join role_permission rp on r.id = rp.role_id "
			+ "left join permission p on p.id = rp.permission_id "
		+ "where r.id = #{id}")
	Role getRoleAndPermissionByRoleId(Integer id);
	
	
	@Insert("insert into role (name,roleCode) values (#{name},#{roleCode})")
	void saveRole(Role role);
	
	@UpdateProvider(type = RoleSqlProvider.class, method = "updateRoleSql")
	void updateRole(Role role);
	
	@DeleteProvider(type = RoleSqlProvider.class, method = "removeRoleSql")  
	void removeRole(Integer id);
}
