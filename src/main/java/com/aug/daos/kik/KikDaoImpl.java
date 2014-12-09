package com.aug.daos.kik;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.kik.Kik;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class KikDaoImpl extends BaseHibernateDaoImpl<Kik> implements KikDao{

    protected KikDaoImpl() {
        super(Kik.class);
    }
    
  
    @Override
    public boolean deleteById(int id) {
        return false;
    }




	
}
