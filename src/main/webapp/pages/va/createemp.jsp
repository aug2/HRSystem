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
	
	  <br>
	  <br>
		  <s:form action="createva" method="post" theme="bootstrap" cssClass="well form-vertical"
		  label="Create Data">
			   
			 
			   <s:textfield
	                        label="Name"
	                        name="vaobj.name"
	                        id="name"
	                        tooltip="Enter your Name and Surname here"
	                        cssClass="form-control"/>
   
		  	 <s:textfield
	                        label="Age"
	                        name="vaobj.age"
	                        id="age"
	                        tooltip="Enter your Age here"
	                         cssClass="form-control"/>
	                        
	          <s:textfield
	                        label="E-mail"
	                        name="vaobj.email"
	                        id="email"
	                        tooltip="Enter your Email here"
	                         cssClass="form-control"/>
	                        
	        
	           <s:textfield
	                        label="Owner"
	                        name="vaobj.va"
	                        id="va"
	                        tooltip="Enter your Owner here"
	                        cssClass="form-control"/>
	                        
	           
	           <s:select label="What's your department" 
				headerKey="-1" headerValue="Select Department"
				list="departmentlist" 
				name="iddept" />
				
				
	                        
	       
		        <div align="center"> 
			        <s:submit cssClass="btn" onclick="validate()"/> 
			        <s:reset cssClass="btn"/>
		        </div>
		  </s:form>
		 
		 

</body>
</html>