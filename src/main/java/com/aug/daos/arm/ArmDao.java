package com.aug.daos.arm;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.arm.Arm;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ArmDao extends BaseHibernateDaoImpl<Arm>{

    protected ArmDao() {
        super(Arm.class);
    }
}