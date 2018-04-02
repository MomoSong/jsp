<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Date time = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//세션 유효시간 셋팅
session.setMaxInactiveInterval(30*60);
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션정보</title>
</head>
<body>
session ID : <%=session.getId() %> <br/>
생성시간 : <%=session.getCreationTime()%> <br/>
<%
time.setTime(session.getCreationTime());
%>
생성날짜객체 : <%= time %> <br/>
폼에 맞춘 생성날짜객체 : <%= formatter.format(time) %> <br/>
세션 유효 시간 : <%= session.getMaxInactiveInterval() %> <br/>


</body>
</html>