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

<title>ListAllKik</title>

<script type="text/javascript">
	function Search() {
		var kikname = document.getElementById("kikname");
		var kikage = document.getElementById("kikage");

		if (kikname.age <= 18) {
			alert("Plese fill-in ");
			kikname.focus();
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
				<s:if test="hasActionErrors()">
					<div class="alert alert-danger">
						<s:actionerror />
					</div>
				</s:if>
				<form class="form-signin" action="SearchKik" method="get">
					<s:iterator value="kiks">
						<s:property value="name" />
						<s:property value="email" />
						<a href="InitUpdateKik?id=<s:property value="id" />">Edit</a>
						<a href="DeleteKik?id=<s:property value="id" />">Delete</a>

					</s:iterator>
				</form>
			</div>
		</div>
	</div>

	<script src="<s:url value='/css/js/bootstrap.min.js'/>"></script>
</body>
</html>