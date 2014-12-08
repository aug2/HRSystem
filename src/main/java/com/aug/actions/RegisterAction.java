package com.aug.actions;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

@ResultPath(value = "/")
public class RegisterAction extends ActionSupport {

    @Autowired
    private EmployeeService employeeService;
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Action(value = "register", results = {@Result(name = "welcome", location = "pages/welcome.jsp")})
    public String execute() {
        employeeService.save(employee);
        return "welcome";

    }

    @Action(value = "initRegister", results = {@Result(name = "input", location = "pages/register.jsp")})
    public String init() {
        return INPUT;
    }
}
