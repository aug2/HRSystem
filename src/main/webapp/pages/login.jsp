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
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<form class="form-signin" action="login" method="post">
					<div class="container">
						<a class="brand" href="index.html"> <img src="img/aug_intranet_header1.png"></a>
					</div>
					<h2 class="form-signin-heading">Augmentis Human Resource
						System</h2>
					<s:if test="hasActionErrors()">
						<div class="alert alert-danger">
							<s:actionerror />
						</div>
					</s:if>
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Username" name="employee.email" />
					<s:password cssClass="form-control" placeholder="Password"
						name="employee.password" />
					<div class="row">
						<div class="col-xs-6">
							<button class="btn btn-md btn-primary btn-block" type="submit">Login</button>
						</div>
						<div class="col-xs-6">
							<button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="css/js/bootstrap.min.js"></script>
</body>
</html>