package com.aug.actions;

import com.aug.entities.Department;
import com.aug.services.DepartmentService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@ResultPath(value = "/")
public class DepartmentAction extends ActionSupport {

    @Autowired
    private DepartmentService departmentService;
    private Department department;
    private List<Department> departments;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Action(value = "department", results = {@Result(name = "input", location = "pages/department.jsp"), @Result(name = "success", location = "pages/welcome.jsp")})
    public String execute() {
            return "success";
    }

    @Action(value = "initDepartment", results = {@Result(name = "input", location = "pages/department.jsp")})
    public String init() {
        return INPUT;
    }

    @Action(value = "adddepartment", results = {@Result(name = "welcome", location = "pages/welcome.jsp")})
    public String executeAddDe() throws Exception {
        departmentService.save(department);
        return "welcome";
    }

    @Action(value = "initAddDepartment", results = {@Result(name = "input", location = "pages/adddepartment.jsp")})
    public String initAdd() {
        return INPUT;
    }

    @Action(value = "updatedepartment", results = {@Result(name = "success", location = "listalldepartment", type = "redirect")})
    public String executeUpdateDe() {
        departmentService.update(department);
        return SUCCESS;
    }


    @Action(value = "initUpdateDepartment", results = {@Result(name = "success", location = "pages/updatedepartment.jsp")})
    public String initUpdate() {
        department = departmentService.findDepartmentById(id);
        return "success";
    }

    @Action(value = "deleteDepartment", results = {
            @Result(name = "success", location = "listalldepartment", type = "redirect"),
            @Result(name = "input", location = "listalldepartment", type = "redirect")
    })
    public String deleteDepartment() {
        if(departmentService.deleteDepartmentById(id))
            return SUCCESS;
        return INPUT;
    }

    @Action(value = "listalldepartment", results = {@Result(name = "success", location = "pages/listdepartment.jsp")})
    public String executeListDe() {
        departments = departmentService.findAllDepartment();
        return "success";
    }

    @Action(value = "initListDepartment", results = {@Result(name = "success", location = "pages/welcome.jsp")})
    public String initList() {
        return "success";
    }

}
