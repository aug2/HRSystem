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
</head>
<body>
			
	  <s:actionerror theme="bootstrap"/>
	  <s:actionmessage theme="bootstrap"/>
	  <s:fielderror theme="bootstrap"/>
	  
	  <s:if test="%{departments.size() <= 0}">
                <font color="red">Data Not Found</font>
      </s:if>
	  
	  <br>
	  <s:form action="searchdept" method="get" theme="bootstrap" cssClass="form-vertical">
		  		<s:textfield
				     label="Name"
				     name="deptsearch.name"
				     id="name" 
				     tooltip="Search by name of department"/>	
				     <div align="center">
					 <s:submit cssClass="btn" value="Search"/>
					 </div>
	  </s:form>
	  
	  <br>
	  <br>
	  <a href="initcreatedept">Add New Department</a> 
	  <s:form action="listdept" method="get" theme="bootstrap" cssClass="well form-vertical"
	  label="Department">
	  		
	  		<div class="row" align="center">  
	  		<div class="col-xs-1"><s:label>no</s:label></div>
	  		<div class="col-xs-1"><s:label>name</s:label></div>
	  		</div>
	  		
	  		  
	  		<s:iterator value="departments" status="departmentStatus">
	  		<div class="row" align="center">	
				<div class="col-xs-1"><s:property value="#departmentStatus.index+1"/></div>	   		
				<div class="col-xs-1"><s:property value="name"/></div>
				
				
				<div class="col-xs-1"><a href="initupdatedept?id=<s:property value="id"/>">edit</a></div>
				<div class="col-xs-1"><a href="deletedept?id=<s:property value="id"/>">delete</a></div>
			</div>
			</s:iterator>
		
			
		
	  </s:form>
	  
</body>
</html>