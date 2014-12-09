package com.aug.actions;


import java.util.List;

import com.aug.entities.parn.Parn;
import com.aug.services.parn.ParnService;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

@ResultPath(value = "/")
public class ParnAction implements BaseAction{
    
	@Autowired
    private ParnService parnService;
    private Parn parn;
    private List<Parn> parns; 
	public ParnService getParnService() {
		return parnService;
	}

	public void setParnService(ParnService parnService) {
		this.parnService = parnService;
	}

	public Parn getParn() {
		return parn;
	}

	public void setParn(Parn parn) {
		this.parn = parn;
	}

	public List<Parn> getParns() {
		return parns;
	}

	public void setParns(List<Parn> parns) {
		this.parns = parns;
	}
	@Action(value ="initCreate", results={
			@Result(name = "input", location = "pages/parn/register.jsp")
	} )
	@Override
    public String initCreate() {
        return "input";
    }
	
	@Action(value ="initList", results={
			@Result(name = "input", location = "pages/parn/list.jsp")
	} )
    @Override
    public String initList() {
		parns = parnService.findAll();
		return "input";
    }

    @Override
    public String initUpdate() {
        return null;
    }

    @Override
    public String initDelete() {
        return null;
    }
    @Action(value ="create", results={
			@Result(name = "success", location = "list" ,type ="redirect")
	} )
    @Override
    public String create() {
    	parnService.save(parn);
        return "success";
    }
    
    @Action(value ="list", results={
			@Result(name = "success", location = "pages/parn/list.jsp")
	} )
    @Override
    public String list() {
    	parns = parnService.findAll();
		return "success";
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }
}
