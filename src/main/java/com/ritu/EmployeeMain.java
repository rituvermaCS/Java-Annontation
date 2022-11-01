package com.ritu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	
    public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = (Employee) context.getBean("emp");
		Employee emp1 = (Employee) context.getBean("emp1");
		
		System.out.println("emp : " + emp);
		
		emp.setId(2);
		emp.setName("Shankar");
		emp.setAge(25);
		emp.setContract(true);

		System.out.println("emp : " + emp);		
		System.out.println("emp1 : " + emp1);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
