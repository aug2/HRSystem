<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sb:head />


		<script type="text/javascript">
				function validate(){
					var name = document.getElementById("name");
				
					if(name.value === ""){
						alert("Please input name ");
						username.focus(); //set cursor
						return false;
					}else{
						document.forms[0].submit();
					}
			
				}
		
		</script>
</head>
<body>



	   <s:actionerror theme="bootstrap"/>
	   <s:actionmessage theme="bootstrap"/>
	   <s:fielderror theme="bootstrap"/>

		 <s:form action="createdept" method="post" theme="bootstrap" cssClass="well form-vertical"
		 label="Create New Department">
		 
		  <s:textfield
	                        label="Name"
	                        name="department.name"
	                        id="name"
	                        tooltip="Enter your Name of department here"
	                        cssClass="form-control"/>
	                        
	      <div align="center" >              
	      <s:submit cssClass="btn" onclick="validate()" /> 
	      <s:reset cssClass="btn" />   
	      </div>              
		  </s:form>

</body>
</html>