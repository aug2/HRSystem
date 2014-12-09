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
	public int id;
	
	
	
	public KikService getKikService() {
		return KikService;
	}



	public void setKikService(KikService kikService) {
		KikService = kikService;
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

	
	
	
	
	
  
   @Override
    public String initList() {
    	
        return null;
    }
    
    
	
   @Override
	public String initUpdate() {
		
		  return null;

	}
	

   @Action(value = "InitAddKik", results = { @Result(name = "input", location = "pages/arm/add.jsp") })
	public String initCreate() {
		
		return INPUT;
	}



   @Action(value = "addkik", results = { @Result(name = "success", location = "ListAll", type = "redirect") })
	public String create() {
		KikService.save(kik);
		return SUCCESS;
	}



	@Action(value = "ListAll", results = { @Result(name = "success", location = "pages/arm/list.jsp") })
	public String list() {
		
		kiks = KikService.findAllKik();
		return SUCCESS;
	}



	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String initDelete() {
		// TODO Auto-generated method stub
		return null;
	}



    
}
