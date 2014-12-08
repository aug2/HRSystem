package com.aug.daos;

import com.aug.entities.Department;

public interface DepartmentDao extends BaseHibernateDao<Department>{

    public boolean deleteDepartmentById(int departmentId);

}
