package com.aug.services.jub;

import java.util.List;



import com.aug.daos.jub.JubDao;
import com.aug.entities.jub.Jub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JubService {

    @Autowired
    private JubDao jubDao;
    
    
	public JubDao getJubDao() {
		return jubDao;
	}

	public void setJubDao(JubDao jubDao) {
		this.jubDao = jubDao;
	}
	
	
	public void save(Jub jub) {
        jubDao.save(jub);
    }

	public void update(Jub jub) {
        jubDao.update(jub);
    }
	
	public void delete(Jub jub) {
        jubDao.delete(jub);
    }
	
	public List<Jub>listall(){
		return jubDao.findAll();
	}

	
	public Jub findById(int id) {
		return jubDao.getById(id);
		
	}

	public Boolean deleteById(int id) {
		return jubDao.deleteById(id);
		
	}

	public List<Jub> search(String search) {
		
		return jubDao.search(search);
	}

	
	
	/*public List<Jub> search(Jub jub) {
		
		return jubDao.searchname(jub);
	}
*/
	

	

	
	
//	public boolean deleteJubById(int jubId) {
//        return jubDao.deleteJubById(jubId);
//    }
	
}
