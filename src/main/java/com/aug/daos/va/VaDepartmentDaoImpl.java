package com.aug.daos.va;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.va.Department;
import com.aug.entities.va.Va;


@Repository
@Transactional
public class VaDepartmentDaoImpl extends BaseHibernateDaoImpl<Department> implements VaDepartmentDao{

	protected VaDepartmentDaoImpl() {
		super(Department.class);
	}

	
	@SuppressWarnings("unchecked")
	@Override
    public List<Department> findAll() {
    	 return getCurrentSession().createCriteria(Department.class).list();
	}
	
	@Override
	public List<Department> findDept(String deptname){
		Criteria criteria = getCurrentSession().createCriteria(Department.class);
		criteria.add(Restrictions.eq("name", deptname));
		List<Department> dept = criteria.list();
		return dept;
	}

	
	@Override
	public void save(final Department department) {
        getCurrentSession().persist(department);
    }
	

	@Override
	public boolean deleteDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return false;
	}
    
	
	@Override
	public Department getById(final Integer id) {
        if(id != null)
            return (Department) getCurrentSession().get(Department.class, id);
        else
            return null;
    }
	
	
	@Override
	 public void update(final Department department) {
	        getCurrentSession().merge(department);
	    }
	 
	 
	@Override
	 public void delete(final Department department) {
	        getCurrentSession().delete(department);
	    }
}
