package com.aug.daos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aug.entities.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class DepartmentDaoTest {

	@Autowired
    private DepartmentDao departmentDao;

	private Department department;

	@Before
	public void setUp() {
		department = new Department();
		department.setName("name");
	}

	@Test
	public void shouldReturnListWhenNameExistInDB() {
		departmentDao.save(department);
		assertThat(departmentDao.findNameDepartment(department).size(), is(equalTo(1)));
	}
	
	public void shouldReturnListWhenNameExistInDB1() {
		departmentDao.update(department);
		assertThat(departmentDao.findNameDepartment(department).size(), is(equalTo(1)));
	}
	
	
}
