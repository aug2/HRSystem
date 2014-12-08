package com.aug.daos.impl;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.daos.DepartmentDao;
import com.aug.entities.Department;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DepartmentDaolmpl extends BaseHibernateDaoImpl<Department> implements DepartmentDao {

    protected DepartmentDaolmpl() {
        super(Department.class);
    }

    @Override
    public boolean deleteDepartmentById(int departmentId) {
        Department department = getById(departmentId);
        if (department == null) {
            return false;
        }

        getCurrentSession().delete(department);

        return true;
    }
}