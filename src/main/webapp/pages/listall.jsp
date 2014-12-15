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


<link rel="stylesheet"
	href="<s:url value='/css/bootstrap/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<s:url value='/css/custom.css'/>">



<title>ListAll</title>
<link rel="stylesheet" href="../css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/custom.css">
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<s:if test="hasActionErrors()">
					<div class="alert alert-danger">
						<s:actionerror />
					</div>
				</s:if>

				<br>
				<form class="form-signin" action="search" method="get">
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Search" name="search" id="search" />
					</br>

					<div class="row">
						<div class="col-xs-12">
							<button class="btn btn-md btn-primary btn-block"
								onclick="excute(document.getElementById('search').value)">Search</button>
						</div>
				</form>
				<form class="form-signin" action="ListAll" method="get">
					<s:iterator value="bills">
						<s:property value="name" />
						<s:property value="email" />
						<a href="initUpdateBill?id=<s:property value="id" />">Edit</a>
						<a href="deleteBill?id=<s:property value="id" />">Delete</a>
						<br>
					</s:iterator>
				</form>
			</div>
		</div>
	</div>
	<script src="../css/js/bootstrap.min.js"></script>
</body>
</html>