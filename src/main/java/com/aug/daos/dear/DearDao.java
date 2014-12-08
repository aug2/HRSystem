package com.aug.daos.dear;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.dear.Dear;
import org.springframework.stereotype.Repository;

@Repository
public class DearDao extends BaseHibernateDaoImpl<Dear>{

    protected DearDao() {
        super(Dear.class);
    }
}
