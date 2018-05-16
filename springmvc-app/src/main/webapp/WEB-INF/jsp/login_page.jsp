<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>
<head>
<link href="<c:url value="/resources/start.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

	<form:form method="POST" commandName="user" action="login/checkUser" class="box login">
		<fieldset class="boxBody">
			<form:label path="login">Login:</form:label>
			<form:input path="login" />
			<form:errors path="login" cssClass="error" />

			<form:label path="password">Password:</form:label>
			<form:password path="password" />
			<form:errors path="password" cssClass="error" />

		</fieldset>
		<input type="submit" class="btnLogin" value="submit">
	</form:form>
</body>
</html>