package com.aug.daos.jub;

import org.springframework.stereotype.Repository;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.jub.Jub;




@Repository
public class JubDaoImpl extends BaseHibernateDaoImpl<Jub> implements JubDao{

    protected JubDaoImpl() {
        super(Jub.class);
    }

    public boolean  deleteJubById(int jubId) {
        Jub jub = getById(jubId);
        if (jub == null) {
            return false;
        }
        getCurrentSession().delete(jub);

        return true;
    }

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
