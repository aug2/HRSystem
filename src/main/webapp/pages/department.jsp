<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Department</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">
    <script type="text/javascript">
        function ok() {
            var departmentname = document.getElementById("departmentname");

            if (departmentname.value === "") {
                alert("Plese fill-in departmentname");
                departmentname.focus();
                return false;
            } else {
                document.forms[0].submit();
            }
        }

        function list() {
            document.forms[0].action = "listalldepartment";
            document.forms[0].submit();
        }

        function add() {
            document.forms[0].action = "initAddDepartment";
            document.forms[0].submit();
        }

        function update() {
            document.forms[0].action = "initUpdateDepartment";
            document.forms[0].submit();
        }
    </script>
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <s:if test="hasActionErrors()">
                <div class="alert alert-danger">
                    <s:actionerror/>
                </div>
            </s:if>
            <form class="form-signin" action="department" method="post">
                <s:textfield cssClass="form-control" autofocus="" require=""
                             placeholder="Departmentname" name="department.name" id="departmentname"/>
                <div class="row">
                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" onclick="ok()">OK</button>
                    </div>
                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" type="reset">Cancel</button>
                    </div>
                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" onclick="list()">ListAll</button>
                    </div>

                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" onclick="add()">Add</button>
                    </div>

                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" onclick="update()">Edit</button>
                    </div>


                </div>
            </form>
        </div>
    </div>
</div>
<script src="css/js/bootstrap.min.js"></script>
</body>
</html>