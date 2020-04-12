package com.capg.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.demo")
@PropertySource("app.properties")
public class EmployeeConfiguration {

	
}
