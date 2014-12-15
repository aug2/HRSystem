package com.aug.daos.bill;

import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.bill.Bill;

public interface BillDao extends BaseHibernateDao<Bill> {

    public boolean deleteById(int id);

	public List<Bill> search(String search);
    
    

	
}

