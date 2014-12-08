package com.aug.daos.bill;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.bill.Bill;
import org.springframework.stereotype.Repository;

@Repository
public class BillDao extends BaseHibernateDaoImpl<Bill>{

    protected BillDao() {
        super(Bill.class);
    }
}
