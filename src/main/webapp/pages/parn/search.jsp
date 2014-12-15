<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Search Parn List</title>
<link rel="stylesheet"
	href="<s:url value='/css/bootstrap/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<s:url value='/css/custom.css'/>">

</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<form class="form-signin" action="ParnSearch" method="get">
							<s:iterator value="parns">
								<s:property value="id" />
								<s:property value="email" />
								<s:property value="age" />
								<a href="initParnUpdate?id=<s:property value="id" />">Edit</a> | 
								<a href="ParnDelete?id=<s:property value="id" />">Delete</a>
								<br />
							</s:iterator>
							<a href="initMain">Main Menu</a> <a href="initParnCreate">Add
								new</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="css/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>