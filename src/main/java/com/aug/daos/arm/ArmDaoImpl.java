package com.aug.daos.arm;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.arm.Arm;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ArmDaoImpl extends BaseHibernateDaoImpl<Arm> implements ArmDao{

    protected ArmDaoImpl() {
        super(Arm.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}