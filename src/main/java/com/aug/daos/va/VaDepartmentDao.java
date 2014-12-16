package com.aug.daos.va;

import java.util.List;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.va.Department;


public interface VaDepartmentDao extends BaseHibernateDao<Department>{
	

		public boolean deleteDepartmentById(int departmentId);

		public List<Department> findDept(String deptname);

}
