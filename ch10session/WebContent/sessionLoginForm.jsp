<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<%-- <form action="<%=request.getContextPath() %>/sessionLogin.jsp"> --%>
<form action="sessionLogin.jsp">

	아이디 <input name="id" type="text" size="10" required="required" />
	비밀번호 <input name="password" type="password" required="required" />
	<button>로그인</button>

</form>
</body>
</html>