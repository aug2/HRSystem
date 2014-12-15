<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Register</title>
<link rel="stylesheet" href="<s:url value='/css/bootstrap/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<s:url value='/css/custom.css'/>">

<script type="text/javascript">
	function validate() {
		var name = document.getElementById("name");
		var email = document.getElementById("email");
		var age = document.getElementById("age");

		if (name.value === "" || email.value === "") {
			alert("Please fill-in sername or password");
			return false;
		}
		if (age <= 18) {
			alert("Your age must over than 18");
			return false;
		} else {
			document.forms[0].submit();
		}
	}	
</script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<form class="form-signin" action="ParnCreate" method="post">
							<s:textfield cssClass="form-control" placeholder="Name"
								name="parn.name" id="name" />
							<s:textfield cssClass="form-control" autofocus="" require=""
								placeholder="Email" name="parn.email" id="email"/>
							<s:textfield cssClass="form-control" placeholder="Age"
								name="parn.age" />
							<div class="row">
								<div class="col-xs-6">
									<button class="btn btn-md btn-primary btn-block" onclick="return validate()">OK</button>
								</div>
								<div class="col-xs-6">
									<button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
								</div>
							</div>
							<a href="initMain">Main Menu</a>
							<a href="initParnCreate">Add new</a>
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