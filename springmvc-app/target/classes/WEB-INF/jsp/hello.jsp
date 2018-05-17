<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
	<h2>${message}</h2>

	<form id="data" action="/springmvc-app/check">
		<p>
			<input placeholder="Name" name="login" form="data">
		</p>
		<p>
			<input placeholder="Password" type="password" name="password"
				form="data">
		</p>
		<p>
			<input type="submit" value="submit" form="data">
		</p>
	</form>
</body>
</html>

