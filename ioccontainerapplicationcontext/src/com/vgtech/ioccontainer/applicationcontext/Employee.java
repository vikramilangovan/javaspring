package com.vgtech.ioccontainer.applicationcontext;

public class Employee {

	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void displayName(){
		System.out.println("Name is "+ name);
	}
}
