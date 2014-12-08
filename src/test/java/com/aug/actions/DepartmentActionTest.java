package com.aug.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.aug.entities.Department;
import com.aug.entities.Employee;
import com.aug.services.DepartmentService;
import com.aug.services.EmployeeService;

@RunWith(MockitoJUnitRunner.class)

public class DepartmentActionTest {

	@Mock
    private DepartmentService mockDepartmentService;

    private DepartmentAction departmentAction;

    @Before
	public void setUp() {
    	departmentAction = new DepartmentAction();
    	departmentAction.setDepartmentService(mockDepartmentService);
	}

	@Test
	public void ShouldListShowName() throws Exception {
		Department department = new Department();
		department.setName("HR");
		departmentAction.setDepartment(department);

		when(mockDepartmentService.hasAuthentication(any(Department.class))).thenReturn(true);
        assertThat(departmentAction.execute(), is(equalTo("welcome")));

        verify(mockDepartmentService, times(1)).hasAuthentication(any(Department.class));
	}

	
}
