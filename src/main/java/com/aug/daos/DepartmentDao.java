package com.aug.daos;

import com.aug.entities.Department;

import java.util.List;

public interface DepartmentDao {

    public List<Department> findNameDepartment(Department department);

    public void save(Department department);

    public void update(Department department);

    public List<Department> findAllDepartmentAll();

}
