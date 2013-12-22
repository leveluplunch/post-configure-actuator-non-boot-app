package com.levelup.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages="com.levelup.spring")
@PropertySource("classpath:com/levelup/properties/application.properties")
public class ComponentConfig {

}
