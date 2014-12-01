<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="employee.email" label="Username" id="email" />
		<s:password name="employee.password" label="Password" id="password" />
		<s:submit />

	</s:form>
</body>
</html>