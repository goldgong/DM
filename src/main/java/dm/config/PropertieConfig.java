package dm.config;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.PropertySource; 
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer; 

/** 
* <PRE> 
* 1. author	:	정수원 
* 2. date	:	2015.04.26 
* </PRE> 
* 
*/ 
@Configuration 
@PropertySource({ 
"classpath:application.properties" 
}) 
public class PropertieConfig {
	@Bean 
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer(); 
	} 
}
