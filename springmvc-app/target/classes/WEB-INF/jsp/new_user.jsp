<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="a"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New User</title>
</head>
<body>
<p>Hello ${user.login}</p>
<p>Your password is ${user.password}</p>

	<a:form action="/springmvc-app/login/" method="GET">
		<p>
			<input type="submit" value="back to start page">
		</p>
	</a:form>
	
</body>
</html>