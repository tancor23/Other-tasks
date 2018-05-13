<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
</head>
<body>

	<form:form method="POST" action="checkUser">
		<fieldset>
			<form:label path="login">Login:</form:label>
			<form:input path="login" />

			<form:label path="password">Password:</form:label>
			<form:password path="password" />

		</fieldset>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>