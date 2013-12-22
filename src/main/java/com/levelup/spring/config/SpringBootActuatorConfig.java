package com.levelup.spring.config;

import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.actuate.endpoint.mvc.EndpointHandlerAdapter;
import org.springframework.boot.actuate.endpoint.mvc.EndpointHandlerMapping;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableConfigurationProperties
@Configuration
@Import({
	EndpointAutoConfiguration.class
})
public class SpringBootActuatorConfig {

	@Bean
	public EndpointHandlerMapping endpointHandlerMapping() {
		return new EndpointHandlerMapping();
	}
	
	@Bean
	public EndpointHandlerAdapter endpointHandlerAdapter() {
		return new EndpointHandlerAdapter();
	}
}
