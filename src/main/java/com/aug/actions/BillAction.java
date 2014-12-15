package com.aug.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.bill.Bill;
import com.aug.services.bill.BillService;
import com.opensymphony.xwork2.ActionSupport;


@ResultPath(value = "/")
public class BillAction extends ActionSupport implements BaseAction {
	// public class BillAction implements BaseAction extends ActionSupport{

	@Autowired
	private BillService billService;
	private Bill bill;
	private List<Bill> bills;
	private Integer id;
	private Bill billK;
	private String search;
	

	public BillService getBillService() {
		return billService;
	}



	public void setBillService(BillService billService) {
		this.billService = billService;
	}



	public Bill getBill() {
		return bill;
	}



	public void setBill(Bill bill) {
		this.bill = bill;
	}



	public List<Bill> getBills() {
		return bills;
	}



	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Bill getBillK() {
		return billK;
	}



	public void setBillK(Bill billK) {
		this.billK = billK;
	}


	public String getSearch() {
		return search;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	@Override
	public String initList() {
		return "success";
	}
	
	@Action(value = "initUpdateBill", results = { @Result(name = "input", location = "pages/update.jsp" )})
	public String initUpdate() {
		
		billK = billService.findByID(id);
		return INPUT;
	}

	
	@Action(value = "initCreate", results = { @Result(name = "input", location = "pages/add.jsp" )})
	public String initCreate() {
		//id=11;
		return INPUT;
	}
	
	
	@Action(value = "addbill", results = { @Result(name = "success", location = "ListAll", type = "redirect") })
	public String create() {
		billService.save(bill);
		return SUCCESS;
	}

	
	@Action(value = "ListAll", results = { @Result(name = "success", location = "pages/listall.jsp") })
	public String list() {

		bills = billService.findAllBill();

		return SUCCESS;
	}

	@Action(value = "updatebill", results = { @Result(name = "success", location = "ListAll", type = "redirect") })
	public String update() {
		
		billService.update(billK);
		return SUCCESS;
	}

	@Action(value = "deleteBill", results = { @Result(name = "success", location = "ListAll", type = "redirect"),
			@Result(name = "input", location = "ListAll", type = "redirect")})
	
	public String delete() {
		if(billService.deleteBillById(id)){
			return SUCCESS;
		}
		
		
		return INPUT;
	}


	public String initDelete() {
		
		
		return null;
	}
	
	
	@Action(value = "search", results = { @Result(name = "success", location = "pages/search.jsp")})
	
	public String search() {
		//System.out.println("*** search : " + search);
		
		if(billService.search(search) != null){
			bills = billService.search(search);
			
			//System.out.println("bills: " + bills);
			
			return SUCCESS;
		}
		return null;
	}
}
