package com.aug.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;

@RunWith(MockitoJUnitRunner.class)

public class EmployeeActionTest {
	


	@Mock
    private EmployeeService mockEmployeeService;
	
	@Autowired
	private EmployeeService employeeDao;
	
	private Employee employee;
	
    private EmployeeAction employeeAction;
    private List <Employee> employees = new ArrayList <Employee> ();
    @Before
	public void setUp() {
        employeeAction = new EmployeeAction();
		employeeAction.setEmployeeService(mockEmployeeService);
	}

	@Test
	public void list() throws Exception {
		when(mockEmployeeService.findAll()).thenReturn(employees);
        assertThat(employeeAction.lists(), is(equalTo("welcome")));

        verify(mockEmployeeService, times(1)).findAll();
	}
	
	@Test
	public boolean save() throws Exception {
		
		employeeDao.save(employee);
		return true;
		
	}
	
	@Test
	public void delete() throws Exception {
		when(mockEmployeeService.delete(employee.getId())).thenReturn(true);
        assertThat(employeeAction.delete(), is(equalTo("success")));

        verify(mockEmployeeService, times(1)).delete(employee.getId());
	}

}