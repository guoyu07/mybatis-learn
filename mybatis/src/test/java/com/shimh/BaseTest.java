package com.shimh;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import com.shimh.model.User;
/**
 * 
 * @author shimh
 *
 * 2018年2月8日
 *
 */
public class BaseTest {
	
	protected SqlSession sqlSession;

	@Before
	public void before() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		sqlSession = sqlSessionFactory.openSession();
	}
	
	@After
	public void after(){
		if(sqlSession != null){
			sqlSession.close();
		}
	}
}
