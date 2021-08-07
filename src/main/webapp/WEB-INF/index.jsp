<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sala</title>
</head>
<body>
    <h1>Escola Bepupa</h1>
    <ul>
        <c:forEach items="${salas}" var="sala">
        <li><a href="sala/${sala}"> Sala - ${sala} </a></li>
        </c:forEach>
    </ul>
</body>
</html>