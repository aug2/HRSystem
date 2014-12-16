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
				    function actionupdate(){
						document.forms[0].action = "updatedept";
			            document.forms[0].submit();
						}
					 
					function list(){
						document.forms[0].action = "listdept";
						alter(document.forms[0].action)
			            document.forms[0].submit();
						}
			</script>






</head>
<body>

	  <s:actionerror theme="bootstrap"/>
	  <s:actionmessage theme="bootstrap"/>
	  <s:fielderror theme="bootstrap"/>
	  <br>
	  <br>
	  <s:form action="updatedept" method="post" theme="bootstrap" cssClass="well form-vertical"
		  label="Update">
       <s:hidden name="department.id" id="id"></s:hidden>
  	   <s:textfield
	                        label="Name"
	                        name="department.name"
	                        id="name"
	                        tooltip="Enter your Name of department here"
	                        cssClass="form-control"/>
	                        
	      <div align="center" >  
	      <button cssClass="btn" type="submit" onclick="actionupdate()">Update</button> 
		  <button cssClass="btn" onclick="list()">Cancle</button>  
	      </div>            
      </s:form>
</body>
</html>