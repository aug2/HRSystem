<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<s:form >
	    <s:textfield name="id" label="Id" id="id" />
	    <s:textfield name="email" label="Email" id="email" />
		<s:password name="password" label="Password" id="password" />
		<td>
		<select name="geder" label ="Gender">
		<option value="Male">Male</option>
		<option value="Female">Female</option>
		</select>
		</td>
		<s:textfield name="name" label="Name" id="name" />
		<s:textfield name="lastname" label="Lastname" id="lastname" />
		<s:textarea name="address" label="Address" id="address" />
		<s:textarea name="tel" label="Tel" id="tel" />
		<s:submit />
	</s:form>
</body>
</html>