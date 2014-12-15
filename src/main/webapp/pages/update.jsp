<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="<s:url value='/css/bootstrap/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<s:url value='/css/custom.css'/>">


<title>Insert title here</title>
<script type="text/javascript">
	function validateupdate() {
		var name = document.getElementById("name");
		var email = document.getElementById("email");
		var age = document.getElementById("age");
		
		if (name.value === "" || email.value === "") {
			alert("Please fill-in sername or password");
			return false;
		}
		if (age.value < 18) {
			alert("Your age must over than 18");
			return false;
		}
		if (age.value >= 18 && name.value === "" && email.value === "") {
			document.forms[0].submit();
		}
	}
</script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
	
		<div class="navbar-inner">
			<div class="container">
		
				<form class="form-signin" action="updatebill" method="post">
					<s:hidden name="billK.id" id="id"/>
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Name" name="billK.name" id="name" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Email" name="billK.email" id="email" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Age" name="billK.age" id="age" />

				
				<div class="row">
					<div class="col-xs-6">
						<button class="btn btn-md btn-primary btn-block" onclick="return validateupdate()">Update</button>
					</div>
					<div class="col-xs-6">
						<button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>
	<script src="../css/js/bootstrap.min.js"></script>
</body>
</html>