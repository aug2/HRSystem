package com.aug.daos.jub;


import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.jub.Jub;


public interface JubDao extends BaseHibernateDao<Jub> {


    public boolean deleteById(int id);

	

	



	public List<Jub> search(String search);
    

	

	

	



	

	

}

	
		



	
