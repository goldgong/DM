package goldgong.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DSStart extends WebMvcConfigurerAdapter {

	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/html/");
	    resolver.setSuffix(".html");
	    return resolver;
	}

	@Override
	public void configureDefaultServletHandling(
           DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(DSStart.class, args);
    }
}
