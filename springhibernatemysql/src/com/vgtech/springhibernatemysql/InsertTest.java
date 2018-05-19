package com.vgtech.springhibernatemysql;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao dao = (EmployeeDao) factory.getBean("empdao");

		Employee e = new Employee();
		e.setId(115);
		e.setName("arun");
		e.setSalary(50000);

		//dao.saveEmployee(e);
		
		//dao.updateEmployee(e);
		
		Employee empdetail=dao.getById(115);
		System.out.println(empdetail.getSalary());
		
		
		List<Employee> list= dao.getEmployees();
		for(Employee emp:list){
			System.out.println(emp.getName());
		}
		
	}
}
