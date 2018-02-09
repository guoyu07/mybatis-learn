package com.shimh.core.mybatis;

import org.apache.ibatis.jdbc.SQL;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class RoleSqlProvider {
	
	private static final String TABLE_NAME = "role";
	
	
	public String updateRoleSql() {
		  return new SQL() {{
		    UPDATE(TABLE_NAME);
		    SET("name = #{name}");
		    SET("roleCode = #{roleCode}");
		    WHERE("id = #{id}");
		  }}.toString();
		}
	
	
	public String removeRoleSql() {
		  return new SQL() {{
		    DELETE_FROM(TABLE_NAME);
		    WHERE("id = #{id}");
		  }}.toString();
		}
}
