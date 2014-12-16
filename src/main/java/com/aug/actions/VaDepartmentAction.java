package com.aug.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.va.Department;
import com.aug.services.va.DepartmentService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;



import java.util.List;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class VaDepartmentAction extends ActionSupport{
	
	    @Autowired
	    private DepartmentService departmentService;
	    private Department department;
	    private List<Department> departments;
	    public int id;
	    private Department deptsearch;
	    
	    

	    public Department getDeptsearch() {
			return deptsearch;
		}

		public void setDeptsearch(Department deptsearch) {
			this.deptsearch = deptsearch;
		}

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

	    
	    

	    @Action(value = "createdept", results = {
				@Result(name = "success",type="redirect",location = "listdept"),
				@Result(name = "failuer",location = "pages/va/createdept.jsp") })
	    public String executeAddDe() throws Exception {
	    	if(getDepartment().getName().isEmpty()==true){
	    		return "failuer";
	    	}else{
	    		departmentService.save(getDepartment());
	    		return SUCCESS;
	    	}
	    }

	    
	    @Action(value = "initcreatedept", results = {
				@Result(name = "input", location = "pages/va/createdept.jsp")})
	    public String initAdd() {
	        return INPUT;
	    }

	    
	    @Action(value = "updatedept", results = {
				@Result(name = "success",type="redirect", location = "listdept"),
				@Result(name = "failuer", location = "pages/va/updatedept.jsp")})
	    public String executeUpdateDe() {
	    	Department dept1  = departmentService.getId(department.getId());
	    	dept1.setName(this.department.getName());
	    	if(departmentService.update(dept1)==true){
	        return SUCCESS;
	    	}else{
	        addActionError("Can't update");
	    	return "failuer";
	    	}
	    }


	    @Action(value = "initupdatedept", results = {
				@Result(name = "input", location = "pages/va/updatedept.jsp") })
	    public String initUpdate() {
	    	department = departmentService.getId(id);
	    	System.out.println("department: "+department.getId());
	        return INPUT;
	    }

	    
	    @Action(value = "deletedept", results = {
				@Result(name = "success",type="redirect",location = "listdept")})
	    public String deleteDepartment() {
	    	department = departmentService.getId(id);
	    	System.out.println("deletedept: "+department.getId());
	    	Department dept1  = departmentService.getId(department.getId());
	    	dept1.setName(this.department.getName());
	    	departmentService.delete(dept1);
	    	return SUCCESS;
	    	
	    }


	    @Action(value = "listdept", results = {
				@Result(name = "success", location = "pages/va/finddepartment.jsp") })
	    public String executeListDe() {
	    	departments = departmentService.findAllDe();
	        return "success";
	    }
	    

	    @Action(value = "searchdept", results = {
				@Result(name = "success", location = "pages/va/finddepartment.jsp") })
	    public String searchdept() {
	    	setDepartment(getDeptsearch());
	    	departments = departmentService.findIdDept(department.getName());
	        return "success";
	    }

	    public String initList() {
	        return "success";
	    }

	}


