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
	
				 <s:form action="updateva" method="post" >
				  <s:textfield
		                        label="Name"
		                        name="va.name"
		                        id="name"
		                        tooltip="Enter your old Name and Surname here"/>
	
		                        
		         <s:textfield
		                        label="E-mail"
		                        name="va.email"
		                        id="email"
		                        tooltip="Enter your old Email here"/>
		                        
		        
		          <s:textfield
		                        label="Age"
		                        name="va.age"
		                        id="name"
		                        tooltip="Enter your new Age here"/>
	
		                         
		        
		        
		      
			        <div align="center"> 
				        <s:submit cssClass="btn" /> 
				        <s:reset cssClass="btn"/>
			        </div>
			  </s:form>

</body>
</html>