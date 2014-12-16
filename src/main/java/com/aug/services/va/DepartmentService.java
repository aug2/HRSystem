package com.aug.services.va;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.aug.daos.va.VaDepartmentDao;
import com.aug.entities.va.Department;

@Service
public class DepartmentService {
	
		@Autowired
	    VaDepartmentDao departmentDao;
	
	
		public void setDepartmentDao(VaDepartmentDao departmentDao) {
			this.departmentDao = departmentDao;
		}
	
		 
		public List<Department> findAllDe(){
			  		
			  	return departmentDao.findAll();
			  
		  }
	
			
		public List<Department> findIdDept(String iddept){
				
			  return departmentDao.findDept(iddept);
			}
	
			
		public boolean save(Department dept){
			    try{
					departmentDao.save(dept);
					return true;
			    }catch(Exception e){
			    	return false;
			    }
			}
			
		
		public Department getId(int id){
			return departmentDao.getById(id);
		}
		
		
		public boolean update(Department dept){
			 try{
				departmentDao.update(dept);	
				return true;
			  }catch(Exception e){
				return false;
			  }
		}
		

		public boolean delete(Department dept){
			try{
			departmentDao.delete(dept);		
			return true;
			}catch(Exception e){
				return false;
			}
		}
		
	 
}
