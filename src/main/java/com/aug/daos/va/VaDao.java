package com.aug.daos.va;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.va.Va;
import org.springframework.stereotype.Repository;

@Repository
public class VaDao extends BaseHibernateDaoImpl<Va>{

    protected VaDao() {
        super(Va.class);
    }
}
