package com.aug.actions;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;

public class LoginAction {

    private EmployeeService employeeService;
    private Employee employee;

    public void setEmployeeService(EmployeeService employeeBo) {
        this.employeeService = employeeBo;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String execute() {
        if(employeeService.isLogin(employee))
            return "welcome";
        return "input";
    }
}
