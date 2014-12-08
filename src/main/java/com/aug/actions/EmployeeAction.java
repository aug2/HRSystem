package com.aug.actions;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class EmployeeAction extends ActionSupport {

    @Autowired
    private EmployeeService employeeService;
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Action(value = "showemployee", results = {@Result(name = "input", location = "pages/showemployee.jsp"), @Result(name = "welcome", location = "pages/welcome.jsp")})
    public String lists() {
        employees = employeeService.findAll();
        if (employees.size() != 0) return "input";
        else return "welcome";
    }

    @Action(value = "register", results = {@Result(name = "success", location = "pages/success.jsp"), @Result(name = "input", location = "pages/register.jsp")})
    public String save() {
        employeeService.save(employee);
        return "success";

    }

    @Action(value = "initRegister", results = {@Result(name = "input", location = "pages/register.jsp")})
    public String init() {
        return INPUT;
    }

    @Action(value = "delete", results = {@Result(name = "success", location = "pages/success.jsp"), @Result(name = "input", location = "pages/showemployee.jsp")})
    public String delete() {
        if (employeeService.delete(employee.getId())) return "success";
        return "input";

    }
}
