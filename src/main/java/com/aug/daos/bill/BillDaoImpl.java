package com.aug.daos.bill;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.bill.Bill;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class BillDaoImpl extends BaseHibernateDaoImpl<Bill> implements BillDao {

	protected BillDaoImpl() {
		super(Bill.class);
	}

	@Override
	public boolean deleteById(int id) {
		Bill bill = getById(id);
		
		if(bill == null){
		return false;
		}
		getCurrentSession().delete(bill);
		
		return true;
	}
	

	@Override
	public List<Bill> search(String search) {
		List<Bill> bills = findBySearch(search);
		
		return bills;
	}
	

	public List<Bill> findBySearch(String search) {
	   	Criteria criteria = getCurrentSession().createCriteria(Bill.class);
    	criteria.add(Restrictions.like("name","%"+search+"%"));
    	List<Bill> billList = criteria.list();
    	return billList;

	}
	
}
