<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

	<a:form method="POST" commandName="user" action="login/checkUser">
		<fieldset>
			<a:label path="login">Login:</a:label>
			<a:input path="login" />

			<a:label path="password">Password:</a:label>
			<a:password path="password" />

		</fieldset>
		<input type="submit" value="submit">
	</a:form>
</body>
</html>