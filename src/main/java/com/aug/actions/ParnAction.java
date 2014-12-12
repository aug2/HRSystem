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
    private Parn temp;
    private List<Parn> parns; 
    private Integer id;
    private String search;
    
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

	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Parn getTemp() {
		return temp;
	}

	public void setTemp(Parn temp) {
		this.temp = temp;
	}

	public List<Parn> getParns() {
		return parns;
	}

	public void setParns(List<Parn> parns) {
		this.parns = parns;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Action(value ="initParnCreate", results={
			@Result(name = "input", location = "pages/parn/register.jsp")
	} )
	@Override
    public String initCreate() {
        return "input";
    }
	
	@Action(value ="initParnList", results={
			@Result(name = "input", location = "pages/parn/list.jsp")
	} )
    @Override
    public String initList() {
		parns = parnService.findAll();
		return "input";
    }

	@Action(value ="initParnUpdate", results={
				@Result(name = "success", location = "pages/parn/update.jsp")
		} )
    @Override
    public String initUpdate() {
		temp = parnService.findById(id);
        return "success";
    }
	@Action(value ="initParnDelete", results={
			@Result(name = "success", location = "pages/parn/list.jsp")
	} )
    @Override
    public String initDelete() {
		return "sucess";
    }
    @Action(value ="ParnCreate", results={
			@Result(name = "success", location = "ParnList", type="redirect")
	} )
    @Override
    public String create() {
    	parnService.save(parn);
        return "success";
    }
    
    @Action(value ="ParnList", results={
			@Result(name = "success", location = "pages/parn/list.jsp")
	} )
    @Override
    public String list() {
    	parns = parnService.findAll();
		return "success";
    }

    @Action(value ="ParnUpdate", results={
			@Result(name = "success", location = "ParnList.action" , type="redirect")
	} )
    @Override
    public String update() {
		parnService.update(temp);
        return "success";
    }
    @Action(value ="ParnDelete", results={
			@Result(name = "success", location = "ParnList.action" , type="redirect")
	} )
    @Override
    public String delete() {
    	if(parnService.delete(id))
    		return "success";
    	return null;
    }

    @Action(value ="initMain", results={
			@Result(name = "success", location = "pages/main.jsp")
	} )
    public String initMain() {
    	return "success";
    }
    
    @Action(value ="ParnSearch", results={
			@Result(name = "success", location = "pages/parn/search.jsp")
	} )
    public String search() {
		if(parnService.search(search) != null) {
			parns = parnService.search(search);
			return "success";
		}
    	return null;
    }
    
}
