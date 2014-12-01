package com.aug.services;

import com.aug.daos.EmployeeDao;
import com.aug.entities.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class EmployeeServiceTest {
	Employee employee;
	EmployeeService employeeService;
	EmployeeDao mockEmployeeDao;

	List<Employee> employees;

	@Before
	public void setUp() {
		mockEmployeeDao = mock(EmployeeDao.class);

        employeeService = new EmployeeService();
        employeeService.setEmployeeDao(mockEmployeeDao);

		employee = new Employee();
		employees = new ArrayList<>();
	}

	@Test
	public void shouldSuccessWhenUserLoginCorrectFormat() {
		employees.add(employee);
		doReturn(employees).when(mockEmployeeDao).findUserByEmailPassword(any(Employee.class));
		assertThat(employeeService.isLogin(employee), is(true));
	}

	@Test
	public void shouldFailureWhenUserLoginIncorrectFormat() {
		doReturn(employees).when(mockEmployeeDao).findUserByEmailPassword(any(Employee.class));
		assertThat(employeeService.isLogin(employee), is(false));
	}
}
