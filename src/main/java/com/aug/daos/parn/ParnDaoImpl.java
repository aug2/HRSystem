package com.aug.daos.parn;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.parn.Parn;

import org.springframework.stereotype.Repository;

@Repository
public class ParnDaoImpl extends BaseHibernateDaoImpl<Parn> implements ParnDao{

    protected ParnDaoImpl() {
        super(Parn.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
   
}
