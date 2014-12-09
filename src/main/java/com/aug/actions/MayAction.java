package com.aug.actions;

import java.util.List;

import com.aug.entities.may.May;
import com.aug.services.may.MayService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

@ResultPath(value = "/")
public class MayAction extends ActionSupport implements BaseAction {

	@Autowired
	private MayService mayservice;
	private May may;
	private List<May> mays;
	public int id;

	public MayService getMayservice() {
		return mayservice;
	}

	public void setMayservice(MayService mayservice) {
		this.mayservice = mayservice;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public List<May> getMays() {
		return mays;
	}

	public void setMays(List<May> mays) {
		this.mays = mays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Action(value = "initAddMay", results = {@Result(name = "input", location = "pages/may/addmay.jsp")})
	public String initCreate() {
		return INPUT;
	}

	@Override
	public String initList() {
		return null;
	}

	@Override
	public String initUpdate() {
		return null;
	}

	@Override
	public String initDelete() {
		return null;
	}

	@Action(value = "addmay", results = {@Result(name = "success", location = "ListAll",type = "redirect")})
	public String create() {
		mayservice.save(may);
		return SUCCESS;
	}

	@Action(value = "ListAll", results = {@Result(name = "success", location = "pages/may/listall.jsp")})
	public String list() {
		mays = mayservice.findAllMay();
		return SUCCESS;
	}

	@Override
	public String update() {
		mayservice.update(may);
		return SUCCESS;
	}

	@Override
	public String delete() {
		if (mayservice.deleteMayById(id))
			return SUCCESS;
		return INPUT;
	}
}
