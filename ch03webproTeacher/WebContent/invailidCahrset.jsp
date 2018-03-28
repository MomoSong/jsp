<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
   %>
<%
	Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>현재 시간</title>
</head>
<body>
현재 시간: <%= now %>
</body>
</html>