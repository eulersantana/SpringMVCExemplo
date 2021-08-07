<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.List"%>
<%@ page import="com.bepupa.springmvcexemplo.model.Estudante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sala</title>
</head>
<body>
    <a href="/"> << Inicio </a>

    <h1>Sala - ${sala}</h1>
    <ul>
        <c:forEach items="${estudantes}" var="estudante">
        <li>${estudante.nome} - ${estudante.nota} </li>
        </c:forEach>
    </ul>
    <form:form id="frmForm" action="add-estudante" method="post" modelAttribute="form">
        <form:input path="salaNome" hidden="true" value="${sala}"/>
        <div>
            <form:label path="nomeEstudante" >Nome:</form:label>
            <form:input type="text" path="nomeEstudante"/>
        </div>
        <div>
            <form:label path="notaEstudante" >Nota:</form:label>
            <form:input type="number" path="notaEstudante"/>
        </div>

        <form:button>Salvar</form:button>
    </form:form>

</body>
</html>