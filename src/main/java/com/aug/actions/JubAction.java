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
    private  Jub temp;
    private String search;
	

	

	

	public Jub getTemp() {
		return temp;
	}

	public void setTemp(Jub temp) {
		this.temp = temp;
	}

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
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Action(value = "initCreate", results = {@Result(name = "input", location = "pages/jub/add.jsp")})
	 public String initCreate() {
		 return INPUT;
    }

	 @Override
    public String initList() {
		 return null;
    }
    
	// @Action(value = "initSearch", results = {@Result(name = "success", location = "pages/find.jsp")})
    public String initSearch() {
    	return null;
		   //return "success";
	    }
    @Action(value = "initUpdateJub", results = {@Result(name = "input", location = "pages/jub/update.jsp")})
    public String initUpdate() {
    	temp=JubService.findById(id);
    	
    	return INPUT;
    }

   // @Action(value = "deleteJub", results = {@Result(name = "input", location = "pages/delete.jsp")})
    public String initDelete() {
    	return null;
       // return INPUT;
    }

    
    @Action(value = "addjub", results = {@Result(name = "success", location = "listalljub" ,type="redirect")})
    public String create() {
    	JubService.save(jub);
    	return "success";
    }

    @Action(value = "listalljub", results = {@Result(name = "success", location = "pages/jub/listall.jsp")})
    public String list() {
    	jubs=JubService.listall();
        return "success";
    }

   @Action(value = "updatejub", results = {@Result(name = "success",location = "listalljub" ,type="redirect")})
        public String update() {
    	JubService.update(temp);
    	return "success";
    }

   @Action(value = "deleteJub", results = {@Result(name = "success",location = "listalljub" ,type="redirect"),
		   @Result(name = "input",location = "listalljub" ,type="redirect")})
    public String delete() {
	   if(JubService.deleteById(id))
	   {
    	
        return "success";
        }
	   return INPUT;
    }
   
   
   
   @Action(value = "Searchjub", results = { @Result(name = "success", location = "pages/jub/find.jsp") })	
	public String search() {	
		if (JubService.search(search) != null){
			jubs = JubService.search(search);
			return "success";
		}

		return null;
	}
   
   
    
}
