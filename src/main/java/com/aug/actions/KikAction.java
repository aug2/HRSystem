package com.aug.actions;

import java.util.List;

import com.aug.actions.BaseAction;
import com.aug.entities.kik.Kik;
import com.aug.services.kik.KikService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

@ResultPath(value = "/")
public class KikAction extends ActionSupport implements BaseAction {

	@Autowired
	private KikService KikService;
	private Kik kik;
	private List<Kik> kiks;
	private int id;
	private String search;

	public KikService getKikService() {
		return KikService;
	}

	public void setKikService(KikService kikService) {
		this.KikService = kikService;
	}

	public Kik getKik() {
		return kik;
	}

	public void setKik(Kik kik) {
		this.kik = kik;
	}

	public List<Kik> getKiks() {
		return kiks;
	}

	public void setKiks(List<Kik> kiks) {
		this.kiks = kiks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String initList() {

		return null;
	}

	
	
	
	@Action(value = "InitAddKik", results = { @Result(name = "input", location = "pages/kik/add.jsp") })
	@Override
	public String initCreate() {

		return INPUT;
	}

	@Action(value = "addkik", results = { @Result(name = "success", location = "ListAllKik", type = "redirect") })
	@Override
	public String create() {

		KikService.save(kik);
		return SUCCESS;
		
		
		
		
	}

	@Action(value = "ListAllKik", results = { @Result(name = "success", location = "pages/kik/list.jsp") })
	@Override
	public String list() {

		kiks = KikService.findAllKik();
		return SUCCESS;
	}
	
	
	
	

	@Action(value = "InitUpdateKik", results = { @Result(name = "input", location = "pages/kik/update.jsp") })
	@Override
	public String initUpdate() {

		kik = KikService.findById(id);

		return INPUT;

	}
	

	@Action(value = "UpdateKik", results = { @Result(name = "success", location = "ListAllKik.action", type = "redirect") })
	@Override
	public String update() {

		KikService.update(kik);

		return SUCCESS;
	}
	
	
	

	@Action(value = "DeleteKik", results = { @Result(name = "success", location = "ListAllKik.action", type = "redirect") })
	public String delete() {
		if (KikService.delete(id))
			return "success";

		return null;
	}

	@Override
	public String initDelete() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	@Action(value = "SearchKik", results = { @Result(name = "success", location = "pages/kik/search.jsp") })	
	public String search() {
		
		if (KikService.search(search) != null){
			kiks = KikService.search(search);
			return "success";
		}

		return null;
	}

}
