package dm.config;

//import javax.annotation.Resource; 
import javax.sql.DataSource; 

import org.apache.commons.dbcp.BasicDataSource; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Profile; 
import org.springframework.core.env.Environment; 
import org.springframework.jdbc.datasource.DataSourceTransactionManager; 
//import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup; 
import org.springframework.transaction.annotation.EnableTransactionManagement; 
/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
@Configuration 
@EnableTransactionManagement 
public class DatabaseConfig {

	@Autowired Environment env; 

	@Bean 
	public DataSource dataSource() { 

		BasicDataSource ds = new BasicDataSource(); 
		try{ 
			ds.setDriverClassName(env.getProperty("db.oracle.driverClassName")); 
			ds.setUrl(env.getProperty("db.oracle.url")); 
			ds.setUsername(env.getProperty("db.oracle.username")); 
			ds.setPassword(env.getProperty("db.oracle.password")); 
			ds.setMaxActive(Integer.parseInt(env.getProperty("db.oracle.maxActive"))); 
			ds.setMaxIdle(Integer.parseInt(env.getProperty("db.oracle.maxIdle"))); 
			ds.setMaxWait(Integer.parseInt(env.getProperty("db.oracle.maxWait"))); 
			
		}catch(Exception e){ 
			e.printStackTrace(); 
		} 
		return ds; 
	} 


	@Bean 
	@Autowired 
	public DataSourceTransactionManager txManager(DataSource dataSource){ 
		DataSourceTransactionManager txManager = new DataSourceTransactionManager(); 
		txManager.setDataSource(dataSource);
		return txManager; 
	} 

}
