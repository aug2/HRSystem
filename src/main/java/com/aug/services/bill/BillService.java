package com.aug.services.bill;

import java.util.List;

import com.aug.daos.bill.BillDao;
import com.aug.entities.bill.Bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillDao billDao;
    
    public BillDao geBillDao() {
		return billDao;
	}
    
    public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}
    
    public void save(Bill bill) {
        billDao.save(bill);
    }
    
    public void update(Bill bill) {
    	billDao.update(bill);
    }
    
    public void delete(Bill bill) {
    	billDao.delete(bill);
    }
    
    public List<Bill> findAllBill(){
		return billDao.findAll();
	}
	
	public boolean deleteBillById(int id) {
        return billDao.deleteById(id);
    }


	public Bill findByID(Integer id) {
		
		return billDao.getById(id);
	}
    
	public List<Bill> search(String search) {
		
		return billDao.search(search);
	}
    
	
}


