package com.aug.actions;


import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.convention.annotation.Result;
import com.aug.actions.BaseAction;
import com.aug.entities.jub.Jub;
import com.aug.services.jub.JubService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
public class JubAction extends ActionSupport implements BaseAction{
    
	@Autowired
	private JubService JubService;
	private Jub jub;
	private List<Jub> jubs;
    public int id;
	
	public JubService getJubService() {
		return JubService;
	}

	public void setJubService(JubService jubService) {
		JubService = jubService;
	}

	public Jub getJub() {
		return jub;
	}

	public void setJub(Jub jub) {
		this.jub = jub;
	}

	public List<Jub> getJubs() {
		return jubs;
	}

	public void setJubs(List<Jub> jubs) {
		this.jubs = jubs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Action(value = "initCreate", results = {@Result(name = "input", location = "pages/add.jsp")})
	 public String initCreate() {
		 return INPUT;
    }

	 
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

    
    @Action(value = "addjub", results = {@Result(name = "susccess", location = "listalljub" ,type="redirect")})
    public String create() {
    	JubService.save(jub);
    	return "susccess";
    }

    @Action(value = "listalljub", results = {@Result(name = "success", location = "pages/listall.jsp")})
    public String list() {
    	jubs=JubService.listall();
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
