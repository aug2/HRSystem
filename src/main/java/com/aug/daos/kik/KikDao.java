package com.aug.daos.kik;

import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.kik.Kik;



public interface KikDao extends BaseHibernateDao<Kik> {



    public boolean deleteById(int id);

	public List<Kik> search(String search);


}
