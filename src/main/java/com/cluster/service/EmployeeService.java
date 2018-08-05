package com.cluster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cluster.dao.EmployeeDAO;

@Component
public class EmployeeService {

	
	@Autowired
	EmployeeDAO dao;

	public EmployeeService() {
		System.out.println("inside EmployeeService default constructor");
		
	}

	public void serviceM1() {

		System.out.println("inisde serviceM1() method");
		dao.sayHello();
	}

}
