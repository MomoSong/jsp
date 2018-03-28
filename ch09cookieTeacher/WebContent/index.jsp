<%@page import="com.webjjang.util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 로그인 쿠키를 가져와서 화면에 출력
String id = Cookies.getValue(request.getCookies(), "AUTH");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>메인</h1>
<p><%= (id!=null)?id+"님 방갑습니다.":"로그인 하세요" %></p>
<a href="<%= request.getContextPath()%>/member/loginForm.jsp">로그인</a>
<a href="<%= request.getContextPath()%>/member/logout.jsp">로그아웃</a>
</body>
</html>