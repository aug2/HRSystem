package com.aug.services.va;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aug.daos.va.VaDao;
import com.aug.daos.va.VaDaoImpl;
import com.aug.entities.va.Va;

@Service
public class VaService  {

	   @Autowired
       VaDao vaDao;
	   public List<Va> valist;
	
	   
	   
	   public void setVaDao(VaDao vaDao) {
		
		   this.vaDao = vaDao;
	}



	public List<Va> findAll(){
		valist = vaDao.findAll();
		return valist;
    	
    }
	
	
	public boolean save(Va v){
		
		try{
				vaDao.save(v);
				return true;
		}catch(Exception except){
				return false;
		}				
    }
	
	
	public Va getId(int id){
		return vaDao.getById(id);
	}
	
	
	public boolean update(Va va){
			try{
			vaDao.update(va);
				return true;
			}catch(Exception exception){
				return false;
			}
		}
	
	
	public void delete(Va vaa){
		  vaDao.delete(vaa);
	}
	
	public List<Va> search(Va vaobjsearch){
		return vaDao.search(vaobjsearch);
	}
	
	
}
