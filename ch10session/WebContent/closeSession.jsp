<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//logout 처리
// 1. 세션을 지운다.
// 2. 세션안에 로그인 정보를 지운다.
session.invalidate();
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션 종료</title>
</head>
<body>
세션을 종료했다. 세션을 가지고 처리하는 문을 작성하면 오류가 난다.
</body>
</html>