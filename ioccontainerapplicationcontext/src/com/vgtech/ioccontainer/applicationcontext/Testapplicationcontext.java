package com.vgtech.ioccontainer.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testapplicationcontext {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp=(Employee)context.getBean("employeebean");
		emp.displayName();
	}
	
}
