package com.aug.services;

import com.aug.daos.EmployeeDao;
import com.aug.entities.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class EmployeeServiceTest {
	Employee employee;
    List<Employee> employees;
	EmployeeService employeeService;

    @Mock
	EmployeeDao mockEmployeeDao;

	@Before
	public void setUp() {
        MockitoAnnotations.initMocks(this);
        employeeService = new EmployeeService();
        employeeService.setEmployeeDao(mockEmployeeDao);

		employee = new Employee();
		employees = new ArrayList<>();
	}

	@Test
	public void shouldSuccessWhenUserLoginCorrectFormat() {
		employees.add(employee);
	    when(mockEmployeeDao.findUserByEmailPassword(any(Employee.class))).thenReturn(employees);
		assertThat(employeeService.isLogin(employee), is(true));

        verify(mockEmployeeDao, times(1)).findUserByEmailPassword(any(Employee.class));
	}

	@Test
	public void shouldFailureWhenUserLoginIncorrectFormat() {
        when(mockEmployeeDao.findUserByEmailPassword(any(Employee.class))).thenReturn(employees);
		assertThat(employeeService.isLogin(employee), is(false));

        verify(mockEmployeeDao, times(1)).findUserByEmailPassword(any(Employee.class));
	}
}