package com.aug.daos.parn;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.parn.Parn;
import org.springframework.stereotype.Repository;

@Repository
public class ParnDao extends BaseHibernateDaoImpl<Parn>{

    protected ParnDao() {
        super(Parn.class);
    }
}
