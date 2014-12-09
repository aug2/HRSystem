package com.aug.services.parn;

import java.util.List;

import com.aug.daos.parn.ParnDao;
import com.aug.entities.parn.Parn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParnService {

    @Autowired
    private ParnDao parnDao;

	public List<Parn> findAll() {
		List<Parn> parns = parnDao.findAll();
		return parns;
	}

	public void save(Parn parn) {
		parnDao.save(parn);
		
	}
    
}
