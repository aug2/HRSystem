<%@page import="com.aug.entities.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<h3>
    Welcome hi!!!
    <%
        Employee username = (Employee) session.getAttribute("user");
    %>
    <%=username.getEmail()%>
</h3>