package com.ritu;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "com.ritu")

public class AppConfig {
	
	@Bean(name = "emp")
	Employee getEmployee() {
		return new Employee();
	}
	
	@Bean(name = "emp1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	Employee getEmployeetwo() {
		return new Employee();
	}
	
	Employee getEmployeeOne() {
		return new Employee(10,"Joe",25,true);
	}
	
	@Bean(name = "add")
	@Primary
	Address getAddress() {
		return new Address("Sopra 64","Noida","India");
	}
	
	@Bean(name = "add2")
	Address getAddressOne() {
		return new Address("Sopra 135","Noida","India");
	}


}
