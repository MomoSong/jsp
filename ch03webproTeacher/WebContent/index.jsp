<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HTML 문서의 제목</title>
</head>
<body>
<%
	// 여기는 자바 입니다.
	String bookTitle = "JSP 프로그램";
	String author = "최범균";
%>
<b><%= bookTitle %></b>(<%= author %>)입니다.
</body>
</html>