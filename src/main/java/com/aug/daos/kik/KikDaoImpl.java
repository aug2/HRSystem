package com.aug.daos.kik;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.kik.Kik;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class KikDaoImpl extends BaseHibernateDaoImpl<Kik> implements KikDao {

	protected KikDaoImpl() {
		super(Kik.class);
	}

	@Override
	public boolean deleteById(int id) {
		Kik kik = getById(id);
		if (kik == null) {
			return false;

		}

		delete(kik);
		return true;

	}

	@Override
	public List<Kik> search(String search) {
		List<Kik> kiks = findBySearch(search);
		return kiks;
	}

	
	
	public List<Kik> findBySearch(String search) {

		Criteria criterial = getCurrentSession().createCriteria(Kik.class);
		Criteria criterial2 = getCurrentSession().createCriteria(Kik.class);
		criterial.add(Restrictions.like("name", "%" + search + "%"));
		List<Kik> KikList = criterial.list();
		return KikList;
	}

}
