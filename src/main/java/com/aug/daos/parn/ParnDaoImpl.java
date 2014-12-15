package com.aug.daos.parn;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.parn.Parn;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class ParnDaoImpl extends BaseHibernateDaoImpl<Parn> implements ParnDao{

    protected ParnDaoImpl() {
        super(Parn.class);
    }

    @Override
    public boolean deleteById(int id) {
    	Parn parn = getById(id);
    	if (parn == null) {
            return false;
        }

        delete(parn);
        	return true;
    }

	@Override
	public boolean updateById(int id) {
		return false;
	}

	@Override
	public List<Parn> search(String search) {
		List<Parn> parns = findBySearch(search);
		return parns;
	}
	
    public List<Parn> findBySearch(String search) {
		Criteria criterial = getCurrentSession().createCriteria(Parn.class);
		criterial.add(Restrictions.like("name","%"+search+"%"));
		criterial.add(Restrictions.like("email","%"+search+"%"));
		List<Parn> parnList = criterial.list();
		return parnList;
    }
   
}
