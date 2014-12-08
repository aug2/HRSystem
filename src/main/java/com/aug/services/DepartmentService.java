package com.aug.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aug.daos.DepartmentDao;
import com.aug.daos.EmployeeDao;
import com.aug.entities.Department;
import com.aug.entities.Employee;

@Service
public class DepartmentService {

	@Autowired
    private DepartmentDao departmentDao;

    public boolean hasAuthentication(Department department) {
        List<Department> departments = departmentDao.findNameDepartment(department);
        return (departments.size() > 0) ? true : false;
    }

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public  void save(Department department) {
		departmentDao.save(department);
		
	}

	public void update(Department department) {
		departmentDao.update(department);
		
	}

	public List<Department> findAllDepartment() {
		return departmentDao.findAllDepartmentAll();		
	}

    

}
