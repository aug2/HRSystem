package com.aug.services;

import com.aug.daos.DepartmentDao;
import com.aug.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void save(Department department) {
        departmentDao.save(department);
    }

    public void update(Department department) {
        departmentDao.update(department);
    }

    public List<Department> findAllDepartment() {
        return departmentDao.findAllDepartmentAll();
    }

    public Department findDepartmentById(int departmentId) {
        return departmentDao.findDepartmentById(departmentId);
    }

    public boolean deleteDepartmentById(int departmentId) {
        return departmentDao.deleteDepartmentById(departmentId);
    }


}
