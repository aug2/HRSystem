package com.aug.daos.jub;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.jub.Jub;




@Repository
public  class JubDaoImpl extends BaseHibernateDaoImpl<Jub> implements JubDao{

    protected JubDaoImpl() {
        super(Jub.class);
    }

   /* public boolean  deleteJubById(int jubId) {
       Jub jub = getById(jubId);
        if (jub == null) {
            return false;
        }
        getCurrentSession().delete(jub);

        return true;
   }*/

	@Override
	public boolean deleteById(int id) {
		Jub jub = getById(id);
        if (jub == null) {
            return false;
        }
        getCurrentSession().delete(jub);

        return true;

	}

	@Override
	public List<Jub> search(String search) {
		List<Jub> jubs = findBySearch(search);
		return jubs;
	}

public List<Jub> findBySearch(String search) {
    	
		Criteria criterial = getCurrentSession().createCriteria(Jub.class);
		criterial.add(Restrictions.like("name","%"+search+"%"));
//		criterial.add(Restrictions.like("email","%"+search+"%"));
		List<Jub> JubList = criterial.list();
		return JubList;
    }
	
}
