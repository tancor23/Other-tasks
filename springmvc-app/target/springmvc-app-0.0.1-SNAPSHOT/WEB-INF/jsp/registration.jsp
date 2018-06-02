<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<script type="text/javascript">
		function doAjaxPassword() {
			$.ajax({
				url : 'registration/check-password',
				data : ({
					password : $('#password').val()
				}),
				success : function(data) {
					$('#resultValue').html(data);
				}
			});
		}

		function doAjaxCheckLogin() {
			$.ajax({
				url : 'registration/check-login',
				data : ({
					login : $('#login').val()
				}),
				success : function(data) {
					$('#resultLogin').html(data);
				}
			});
		}
	</script>

	<div id="resultValue"></div>
	<div id="resultLogin"></div>
	<form:form method="post" commandName="user" action="register">
		<fieldset>
			<form:label path="login">Login:</form:label>
			<form:input path="login" onblur="doAjaxCheckLogin()" />
			<form:errors path="login" cssClass="error" />

			<form:label path="password">Password:</form:label>
			<form:password path="password" onkeyup="doAjaxPassword()" />

			<form:errors path="password" cssClass="error" />

		</fieldset>
		<input type="submit" value="registration">
	</form:form>
</body>
</html>