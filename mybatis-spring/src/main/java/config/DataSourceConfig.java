package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @author shimh
 *
 * 2018年2月9日
 *
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
	
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.driver}")
	private String dirverClassName;
	
	
	
    @Bean(initMethod = "init")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(dirverClassName);
        dataSource.setInitialSize(2);   
        dataSource.setMinIdle(1);       
        dataSource.setMaxActive(20);    
        dataSource.setMaxWait(60000);   

        dataSource.setTimeBetweenEvictionRunsMillis(60000);

        dataSource.setMinEvictableIdleTimeMillis(300000);
        dataSource.setValidationQuery("SELECT 'x'");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);

        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        return dataSource;
    }
	

}

