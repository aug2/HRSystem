package com.aug.daos.jub;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.jub.Jub;
import org.springframework.stereotype.Repository;

@Repository
public class JubDao extends BaseHibernateDaoImpl<Jub>{

    protected JubDao() {
        super(Jub.class);
    }
}
