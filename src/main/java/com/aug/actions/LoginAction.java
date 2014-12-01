package com.aug.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmployeeService employeeBo;
	private Employee employee;

	public void setEmployeeBo(EmployeeService employeeBo) {
		this.employeeBo = employeeBo;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Action(value = "login", results = {
			@Result(name = "welcome", location = "welcome.tiles", type = "tiles"),
			@Result(name = "input", location = "login.jsp") })
	public String execute() {
		
		if (employeeBo.isLogin(employee))
			return "welcome";
		return "input";
	}
}
