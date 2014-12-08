package com.aug.daos.impl;

import com.aug.daos.DepartmentDao;
import com.aug.entities.Department;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DepartmentDaolmpl implements DepartmentDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Department> findNameDepartment(Department department) {
        String hql = "FROM Department de WHERE de.name = :name";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("name", department.getName());
        return query.list();
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
    public List<Department> findAllDepartmentAll() {
        String hql = "FROM Department";
        Query query = getCurrentSession().createQuery(hql);
        return query.list();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
