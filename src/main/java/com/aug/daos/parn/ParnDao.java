package com.aug.daos.parn;

import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.parn.Parn;

public interface ParnDao extends BaseHibernateDao<Parn> {

    public boolean deleteById(int id);
    
    public boolean updateById(int id);

	public List<Parn> search(String search);
}
