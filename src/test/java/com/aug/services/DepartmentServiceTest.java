package com.aug.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aug.daos.DepartmentDao;
import com.aug.entities.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class DepartmentServiceTest {

	@Autowired
    private DepartmentService departmentService;

    @Mock
    private DepartmentDao mockDepartmentDao;

	private Department department;
    private List<Department> departments;

	@Before
	public void setUp() {
        MockitoAnnotations.initMocks(this);
        departmentService.setDepartmentDao(mockDepartmentDao);

        department = new Department();
        departments = new ArrayList<>();
	}

	@Test
	public void shouldBeTrueWhenUserLoginExistInDB() {
		departments.add(department);
	    when(mockDepartmentDao.findNameDepartment(any(Department.class))).thenReturn(departments);
		assertThat(departmentService.hasAuthentication(department), is(true));

        verify(mockDepartmentDao, times(1)).findNameDepartment(any(Department.class));
	}
	
	
	
	
	
	
	
	
}
