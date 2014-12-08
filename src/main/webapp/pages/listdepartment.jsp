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
    <title>ListAllDepartment</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">
    <script type="text/javascript">
        function ok() {
            document.forms[0].action = "initListDepartment";
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
            <form class="form-signin" action="listalldepartment" method="post">
                <s:iterator value="departments">
                    <s:property value="name"/>
                    <a href="initUpdateDepartment?id=<s:property value="id" />">Edit</a> |
                    <a href="deleteDepartment?id=<s:property value="id" />">Delete</a>
                    <br>
                </s:iterator>
                <div class="row">
                    <div class="col-xs-6">
                        <button class="btn btn-md btn-primary btn-block" onclick="ok()">OK</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="css/js/bootstrap.min.js"></script>
</body>
</html>