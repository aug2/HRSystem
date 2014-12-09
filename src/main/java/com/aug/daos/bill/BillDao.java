package com.aug.daos.bill;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.bill.Bill;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BillDao extends BaseHibernateDaoImpl<Bill>{

    protected BillDao() {
        super(Bill.class);
    }
    
    
    @Autowired
    SessionFactory sessionFactory;
 


public boolean deleteBillById(int billId) {
	
	return false;
}
}
