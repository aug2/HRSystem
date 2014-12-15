<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
        function ok() {
            var jubname = document.getElementById("jubname");
            var jubage = document.getElementById("jubage");

            if (jubname.value === "") {
                alert("Plese fill-in jubname");
                jubname.focus();
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
            
            <form class="form-signin" action="addjub" method="post">
            <s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Name" name="jub.Name" id="Name" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Email" name="jub.EMAIL" id="email" />
					<s:textfield cssClass="form-control" autofocus="" require=""
						placeholder="Age" name="jub.AGE" id="age" />
					<div class="row">
						<div class="col-xs-6">
							<button class="btn btn-md btn-primary btn-block" onclick="ok()">OK</button>
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