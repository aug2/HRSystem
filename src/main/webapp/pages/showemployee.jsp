<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Show Employee</title>
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/custom.css">
    <script type="text/javascript">
        function
        delete()
        {
            document.forms[0].action = "delete";
            document.forms[0].submit();
        }
    </script>
</head>
<body>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <form class="form-signin" action="showemployee" method="get">
                        <s:iterator value="employees">
                            <s:property value="id"/>
                            <s:property value="email"/>
                            <s:property value="password"/>
                            <br/>

                            <div class="col-xs-6">
                                <button class="btn btn-md btn-primary btn-block"
                                        onclick="return edit()">Edit
                                </button>
                            </div>
                            <div class="col-xs-6">
                                <button class="btn btn-md btn-primary btn-block"
                                        onclick="return delete()">Delete
                                </button>
                            </div>
                            <br/>
                        </s:iterator>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="css/js/bootstrap.min.js"></script>
</body>
</html>