<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//서버의 한글 encode가 utf-8이 아니므로 utf-8로 변환해서 저장한다.
Cookie cookie = new Cookie("name",URLEncoder.encode("이영환","utf-8"));
//쿠키를 굽는다. (서버 -> 클라이언트로 보낸다.)
cookie.setDomain("webjjang.com");
cookie.setPath("/chap09/namepath");
response.addCookie(cookie);
String cart = "{{goddname:컴퓨터, count:1}}";
response.addCookie((new Cookie("cart", URLEncoder.encode(cart, "utf-8"))));
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메이크 쿠키</title>
</head>
<body>
서버의 쿠기 정보 <br/>
쿠키 이름 : <%=cookie.getName() %><br/>
쿠키 값 : <%= URLDecoder.decode(cookie.getValue(), "utf-8") %><br/>
<a href="viewCookies.jsp">쿠키를 보여주는 페이지</a>
</body>
</html>