package com.aug.daos;

import java.util.List;

import com.aug.entities.Department;

public interface DepartmentDao {

	public List<Department> findNameDepartment(Department department);
	
	public void save(Department department);

	public void update(Department department);

	public List<Department> findAllDepartmentAll();

}
