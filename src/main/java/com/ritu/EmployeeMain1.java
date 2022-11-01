package com.ritu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain1 {
	
	    
	    public static void main(String[] args) {
	        
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
	        Employee1 book1 = (Employee1) context.getBean("emp");
	        Address1 book2 = (Address1) context.getBean("add");
	        
//	        obj.display();
	        
	        System.out.println("Emp info : " + book1);
	        System.out.println("Address info : " + book2);
	        
	        ((ClassPathXmlApplicationContext) context).close();
	                
	    }
	}


