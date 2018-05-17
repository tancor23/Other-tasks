<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function doAjax() {
		$.ajax({
			url : 'do',
			dataType : 'json',
			data : ({login : $('#login').val()}),
			success : function(data) {
				$('#resultValue').html(data.name);
				}
		});
	}

	function doAjax2() {
		var jsonObj = {pass : $('#pass').val()}
		var jsonString = JSON.stringify(jsonObj)
		$.ajax({
			url : 'do2',
			data : ({pass : jsonString	}),
			success : function(data) {
				$('#resultLogin').html(data.key);
			}
		});
	}
</script>
</head>
<body>
	<div id="resultValue"></div>
	<div id="resultLogin"></div>
	<form>
		<input type="text" onkeyup="doAjax()" id="login"> <input
			type="password" onkeyup="doAjax2()" id="pass">
	</form>
</body>
</html>