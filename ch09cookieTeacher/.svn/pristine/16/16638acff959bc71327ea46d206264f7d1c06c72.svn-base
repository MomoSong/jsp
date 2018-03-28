<%@page import="com.webjjang.util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// AUTH 쿠키가 존재하지 않으면 로그인 폼으로 존재하면 경고창 띄우고 index.html로 이동
String auth = Cookies.getValue(request.getCookies(), "AUTH");
if(auth!=null){ // 로그인 상태
	%>
	<html>
	<script>
		alert("로그인 상태 입니다.");
		location = "<%= request.getContextPath() %>/index.jsp";
	</script>
	</html>
	<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 폼</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/member/login.jsp"
method="post">
아이디<input name="id" size="10" />
 암호<input type="password" name="password" size="10" />
 <button>로그인</button>
</form>
</body>
</html>