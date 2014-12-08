package com.aug.daos.may;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.may.May;
import org.springframework.stereotype.Repository;

@Repository
public class MayDao extends BaseHibernateDaoImpl<May>{

    protected MayDao() {
        super(May.class);
    }
}
