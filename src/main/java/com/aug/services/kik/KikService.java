package com.aug.services.kik;



import java.util.List;

import com.aug.daos.kik.KikDao;
import com.aug.entities.kik.Kik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KikService {

    @Autowired
    private KikDao kikDao;
    
    public KikDao geKikDao() {
		return kikDao;
	}
    
    public void setKikDao(KikDao kikDao) {
		this.kikDao = kikDao;
	}
    
    public void save(Kik kik) {
        kikDao.save(kik);
    }

    public void update(Kik kik) {
        kikDao.update(kik);
    }
	
	public void delete(Kik kik) {
        kikDao.delete(kik);
    }
	
	public List<Kik>findAllKik(){
		return kikDao.findAll();
	}
	
	public boolean deleteKikById(int kikId) {
        return kikDao.deleteById(kikId);
    }
    
    

    
    
}
