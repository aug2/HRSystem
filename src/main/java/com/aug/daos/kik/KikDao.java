package com.aug.daos.kik;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.kik.Kik;
import org.springframework.stereotype.Repository;

@Repository
public class KikDao extends BaseHibernateDaoImpl<Kik>{

    protected KikDao() {
        super(Kik.class);
    }
}
