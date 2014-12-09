<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 	<s:form action="listemp" method="get" >
 	<div align="center">
        <s:iterator value="employees">
				<s:property value="name"/><br>
				<s:property value="age"/><br>
				<s:property value="email"/><br>
				<s:property value="va"/><br>
		</s:iterator>
	</div>
    </s:form>

</body>
</html>