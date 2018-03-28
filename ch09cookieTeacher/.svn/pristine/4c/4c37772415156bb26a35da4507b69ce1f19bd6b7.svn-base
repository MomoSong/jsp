<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// 서버의 한글 encode가 utf-8이 아니므로 utf-8로 변환해서 저장한다.
Cookie cookie 
= new Cookie("name",URLEncoder.encode("이영환","utf-8"));
cookie.setDomain("webjjang.com");
cookie.setPath("/chap09/namepath");
// 쿠키를 굽는다. (서버->클라이언로 보낸다.)
response.addCookie(cookie);
String cart = "{{goodname:컴퓨터,count:1}}";
response.addCookie(new Cookie("cart",
		URLEncoder.encode(cart,"utf-8")));
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 생성</title>
</head>
<body>
서버의 쿠키 정보<br/>
쿠키이름 : <%= cookie.getName() %><br/>
쿠키값 : <%= cookie.getValue() %><br/>
쿠키값 : <%= cookie.getDomain() %><br/>
쿠키값 : <%= cookie.getPath() %><br/>
<a href="viewCookies.jsp">쿠키를 보여 주는 페이지</a>
</body>
</html>