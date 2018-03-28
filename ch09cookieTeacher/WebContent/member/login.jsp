<%@page import="com.webjjang.util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
String password = request.getParameter("password");
// 확인
System.out.println(id+"/"+password);

// DB에서 아디와 비밀번호가 같은 데이터를 가져와서 가져와지면 로그인 처리를 한다.[생략]
// 로그인 처리 - 쿠키를 굽는다.
response.addCookie
(Cookies.createCookie("AUTH", id, "/", -1));
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 성공<br/>
<a href="<%= request.getContextPath() %>/index.jsp">메인으로 이동</a>
</body>
</html>