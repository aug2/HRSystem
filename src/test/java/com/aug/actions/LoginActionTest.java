package com.aug.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.aug.model.Employee;
import com.aug.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class LoginActionTest {
	LoginAction loginAction = new LoginAction();

	@Mock
	EmployeeService mockEmployeeService;

	@Mock
	EmployeeService mockEmployee;

	@Before
	public void setUp() {
		loginAction.setEmployeeBo(mockEmployeeService);
		loginAction.setSession(new HashMap<String, Object>());
	}

	@Test
	public void loginSuccessShouldRedirectToWelcomePage() throws Exception {
		Employee employee = new Employee();
		employee.setEmail("aaa");
		loginAction.setEmployee(employee);
		when(mockEmployeeService.isLogin(any(Employee.class))).thenReturn(true);
		assertThat(loginAction.execute(), is(equalTo("welcome")));
	}

	@Test
	public void loginFailureShouldNotRedirectPage() throws Exception {
		when(mockEmployeeService.isLogin(any(Employee.class)))
				.thenReturn(false);
		assertThat(loginAction.execute(), is(equalTo("input")));
	}
}