<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	ul{ list-style-type: none; }
	ul label{ float: left; width: 150px;
		 color: white; background: black;}
	#inputData { /*border: 1px solid #ccc;*/ }
</style>
<title>로그인 폼</title>
</head>
<body>
<h1>로그인 폼</h1>
<form action="login.jsp" method="post">
	<ul id="inputData">
		<li>
			<label for="id">ID </label>
			<input name="id" id="id" required="required"
				pattern="^[A-Za-z0-9]{4,20}$"
				placeholder="영숫자4자 이상" maxlength="20"
			>
		</li>
		<li>
			<label for="pw">password </label>
			<input name="pw" id="pw"
				required="required" type="password"
				pattern="^.{4,20}$"
				placeholder="4자 이상" maxlength="20"
			>
		</li>
		<li>
			<button>Login</button>
		</li>
	</ul>
</form>
</body>
</html>