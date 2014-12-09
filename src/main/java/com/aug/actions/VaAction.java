package com.aug.actions;


import java.util.ArrayList;
import java.util.List;

import com.aug.actions.BaseAction;


import com.aug.entities.va.Va;
import com.aug.services.va.VaService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;


@ResultPath(value = "/")
public class VaAction extends ActionSupport implements BaseAction{
  
	private static final long serialVersionUID = 1L;
	public Va va;
	public Va newva;
	public List<Va> employees = new ArrayList<Va>();
	@Autowired
	VaService vaservice;
	
	

	public Va getVa() {
		return va;
	}


	public void setVa(Va va) {
		this.va = va;
	}


	public List<Va> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Va> employees) {
		this.employees = employees;
	}
	
	

	public Va getNewva() {
		return newva;
	}


	public void setNewva(Va newva) {
		this.newva = newva;
	}


	@Action(value = "initcreate", results = {
			@Result(name = "input", location = "pages/va/createemp.jsp")})
	@Override
    public String initCreate() {
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
        return INPUT;
    }

    @Override
    public String initDelete() {
        return null;
    }

    @Action(value = "createva", results = {
			@Result(name = "success",type="redirect",location = "initcreate"),
			@Result(name = "failuer", location = "pages/va/createemp.jsp") })
    @Override
    public String create() {
    	if(vaservice.save(va)==true){
        return SUCCESS;
    	}else{
    	return "failuer";
    	}
    	
    }

    @Action(value = "showlist", results = {
			@Result(name = "success", location = "pages/va/showlist.jsp") })
    @Override
    public String list() {
    	employees = vaservice.findAll();
    	System.out.println(employees.size());
        return SUCCESS;
    	
    }

    @Action(value = "updateva", results = {
			@Result(name = "success",type="redirect", location = "initupdate") })
    @Override
    public String update() {
    	
    	vaservice.update(va);
        return SUCCESS;
    }

    @Override
    public String delete() {
        return null;
    }
}
