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
<link rel="stylesheet" href="../css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/custom.css">

</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<form class="form-signin" action="create" method="post">
							<s:textfield cssClass="form-control" autofocus="" require=""
								placeholder="Email" name="parn.email" />
							<s:textfield cssClass="form-control" placeholder="Name"
								name="parn.name" />
							<s:textfield cssClass="form-control" placeholder="Age"
								name="parn.age" />
							<s:textfield cssClass="form-control" placeholder="Yourname"
								name="parn.yourname" />
							<s:textfield cssClass="form-control" placeholder="Parn"
								name="parn.parn" />
							<div class="row">
								<div class="col-xs-6">
									<button class="btn btn-md btn-primary btn-block" type="submit">OK</button>
								</div>
								<div class="col-xs-6">
									<button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../css/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>