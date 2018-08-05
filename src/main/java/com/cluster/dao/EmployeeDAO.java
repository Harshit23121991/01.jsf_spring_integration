package com.cluster.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	public EmployeeDAO() {
		System.out.println("inside employeeDAO default constructor");
	}
	

	public void sayHello() {
		System.out.println("inside sayHello() method of employeeDAO");
	}

}
