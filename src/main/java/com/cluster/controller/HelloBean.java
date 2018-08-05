package com.cluster.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cluster.service.EmployeeService;

@Controller
// @ManagedBean
//@SessionScoped
public class HelloBean {

	private String name;
	private String password;

	@Autowired
	EmployeeService employeeService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String checkUser() {
		String str = "failure";
		if (name.equalsIgnoreCase("sub") && password.equalsIgnoreCase("sub")) {
			str = "success";
			employeeService.serviceM1();
			
			/*//storing Integer(not int i.e. primitive data type), 
			Set integers = new HashSet();
			integers.add(1);
			integers.add(1);
			
			List<Integer> integers2 = new ArrayList<Integer>();
			
			Object[] array = integers2.toArray();
			
			List<Object> asList = Arrays.asList(array);*/
			
			
				
			
			
			
			
			
			
			
			
			return str;
		} else {
			return str;
		}
	}
	public void logoutUser(ActionEvent actionEvent)
	{
	
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		
		HttpSession session = (HttpSession) currentInstance.getExternalContext().getSession(true);
		session.invalidate();
		
		ServletRequest servletRequest = (ServletRequest) currentInstance.getExternalContext().getRequest();
		ServletResponse servletResponse = (ServletResponse) currentInstance.getExternalContext().getResponse();
		RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/Login.xhtml");
		try {
			requestDispatcher.forward(servletRequest,servletResponse);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
