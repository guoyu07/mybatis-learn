package config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * https://github.com/mybatis/jpetstore-6
 * 
 * @author shimh
 *
 * 2018年2月9日
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages={"com.shimh.service"})
@Import(DataSourceConfig.class)
public class MybatisConfig {
	
	@Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
    	SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    	factoryBean.setDataSource(dataSource);
    	factoryBean.setTypeAliasesPackage("com.shimh.model");
    	
    	return factoryBean;
    }
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.shimh.mapper");
		
		return configurer;
	}
    
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
    	DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    	transactionManager.setDataSource(dataSource);
    	return transactionManager;
    }
    
}

