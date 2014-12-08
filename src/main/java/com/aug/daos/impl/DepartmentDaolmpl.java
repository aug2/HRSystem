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
    public Department getById(Integer id) {
        return (Department)getCurrentSession().get(Department.class, id);
    }

    @Override
    public void save(Department department) {
        getCurrentSession().persist(department);
    }

    @Override
    public void update(Department department) {
        getCurrentSession().update(department);
    }

    @Override
    public void delete(Department entity) {
        getCurrentSession().delete(entity);
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