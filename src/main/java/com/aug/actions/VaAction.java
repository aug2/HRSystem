package com.aug.actions;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.aug.actions.BaseAction;


import com.aug.entities.va.Department;
import com.aug.entities.va.TestBeen;
import com.aug.entities.va.Va;
import com.aug.services.va.DepartmentService;
import com.aug.services.va.VaService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;


@ResultPath(value = "/")
public class VaAction extends ActionSupport implements BaseAction{
//implements BaseAction,ServletRequestAware 
  
	private static final long serialVersionUID = 1L;
     Va vaobj;
	private Va vasearch;
    List<Va> employees;
	public Map intid;
	//public Map session ;
	@Autowired
	VaService vaservice;
	@Autowired
	DepartmentService deService;
	Department department;
	List<Department> departmentlist;
	String iddept;
	int dept;
	
	


	public String getIddept() {
		return iddept;
	}


	public void setIddept(String iddept) {
		this.iddept = iddept;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Department> getDepartmentlist() {
		return departmentlist;
	}


	public void setDepartmentlist(List<Department> departmentlist) {
		this.departmentlist = departmentlist;
	}


	
	
	
	
	
	public Integer id;
	
	List<Va> emp;


	public List<Va> getEmp() {
		return emp;
	}


	public void setEmp(List<Va> emp) {
		this.emp = emp;
	}

	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public Va getVaobj() {
		return vaobj;
	}


	public void setVaobj(Va vaobj) {
		this.vaobj = vaobj;
	}

	

	public Va getVasearch() {
		return vasearch;
	}


	public void setVasearch(Va vasearch) {
		this.vasearch = vasearch;
	}


	public List<Va> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Va> employees) {
		this.employees = employees;
	}
	
	
	
	/*HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}


	public HttpServletRequest getRequest() {
		return request;
	}
	
	
     TestBeen beanTest;
	


	public TestBeen getBeanTest() {
		return beanTest;
	}


	public void setBeanTest(TestBeen beanTest) {
		this.beanTest = beanTest;
	}*/

	

	@Action(value = "initcreate", results = {
			@Result(name = "input", location = "pages/va/createemp.jsp")})
	@Override
    public String initCreate() {
		departmentlist = deService.findAllDe();
		for(Department id:departmentlist){
			System.out.println(id);
		}
        return INPUT;
    }
    
	
	
    @Override
    public String initList() {
        return INPUT;
    }

	@Action(value = "initupdate", results = {
			@Result(name = "input", location = "pages/va/updateemp.jsp") })
    @Override
    public String initUpdate() {
		
		System.out.println(id);
		/*String param = getRequest().getParameter("id");
		System.out.println("param: "+getRequest().getAttribute("param"));*/
		vaobj = vaservice.getId(id);
		System.out.println(vaobj.getId());
		
		/*
		System.out.println(id);
		session = ActionContext.getContext().getSession();
		session.put("id",id);
		setVaobj(vaservice.getId(id));
		System.out.println("id:"+ session.get("id"));
        return INPUT;*/
		
		return INPUT;
    }

	
	
   
    @Override
    public String initDelete() {
        return SUCCESS;
    }

    @Action(value = "createva", results = {
			@Result(name = "success",type="redirect",location = "listemp"),
			@Result(name = "failuer",location = "pages/va/createemp.jsp") })
    @Override
    public String create() {
    	
    	System.out.println("id: "+iddept);
    	
    	List<Department> listdept = deService.findIdDept(iddept);
    	for(Department dep:listdept){
    		vaobj.setDepartment(dep);
    	}
    
    	
    	 
    	  System.out.println("objdept#2: "+vaobj.getDepartment().getId());
    	if(vaobj.getAge()<18){
    		addActionError("your age is less than 18");
    		return "failuer";
    	}
    	
    	if(vaservice.save(getVaobj())==true){
    	return SUCCESS;
    	}else{
    		return "failuer";
    	}
    }

    @Action(value = "listemp", results = {
			@Result(name = "success", location = "pages/va/showlist.jsp") })
    @Override
    public String list() {
    	employees = vaservice.findAll();
    	System.out.println(employees.size());
        return SUCCESS;
    	
    }

    
    @Action(value = "updateva", results = {
			@Result(name = "success",type="redirect", location = "listemp"),
			@Result(name = "failuer", location = "pages/va/updateemp.jsp")})
    @Override
    public String update() { 
    	
    	Va va1 =  vaservice.getId(vaobj.getId()); ;
    	System.out.println("va1: "+va1.getId());
    	va1.setName(this.vaobj.getName());  	
    	va1.setAge(this.vaobj.getAge());
    	va1.setEmail(this.vaobj.getEmail());
    	va1.setVa(this.vaobj.getVa());
    	
    	List<Department> listdept = deService.findIdDept(this.vaobj.getDepartment().getName());
    	for(Department dept:listdept){
    		va1.setDepartment(dept);
    	}
    	
    	
    	

    	if(vaservice.update(va1)==false||va1.getAge()<18){
    		if(vaservice.update(va1)==false){
    		  addActionError("name is dupicate");	
	    	  if(va1.getAge()<18){
	    		  addActionError("age is less than 18");	
	    	  }
	    		  
    		}else if(vaservice.update(va1)==true&&va1.getAge()<18){
    			 addActionError("age is less than 18");
    		}
    		return "failuer";
	    }
    	else{
    	addActionMessage("Update Success");
    		return SUCCESS;
    	}
    	
    	/*session = ActionContext.getContext().getSession();
    	System.out.println("session"+session.get("id"));
    	id = (Integer) session.get("id");
    	System.out.println(id);
    	Va va1 = vaservice.getId(id); 
    	System.out.println(this.vaobj.getAge());
    	va1.setAge(this.vaobj.getAge());
    	vaservice.update(va1);
        return SUCCESS;*/
    }

    
    @Action(value = "deleteemp", results = {
			@Result(name = "success",type="redirect", location = "listemp") })
    @Override
    public String delete() {
    	System.out.println("id delete: "+id);
    	Va va1 = vaservice.getId(id);
    	vaservice.delete(va1);
    	return SUCCESS;
       
    }
    
    
    @Action(value = "searchemp", results = {
			@Result(name = "success",location = "pages/va/showlist.jsp")})
   // @Override
    public String Search() {
    	setVaobj(vasearch);
    	System.out.println("name vaobj: "+vaobj.getName());
    	employees = vaservice.search(vaobj);
    	return SUCCESS;
    
       
    }
    
   

}
