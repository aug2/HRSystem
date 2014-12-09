package com.aug.services.arm;

import com.aug.daos.arm.ArmDao;
import com.aug.entities.arm.Arm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmService {

    @Autowired
    private ArmDao armDao;

    public void setArmDao(ArmDao armDao) {
        this.armDao = armDao;
    }

    public List<Arm> findAll(){
        return armDao.findAll();
    }
}
