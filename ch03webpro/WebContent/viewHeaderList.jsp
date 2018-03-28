<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>헤더 목록 출력</title>
</head>
<body>
<%
	Enumeration<String> headerEnum
	= request.getHeaderNames();
	while(headerEnum.hasMoreElements()){
		String headerName = headerEnum.nextElement();
		String headerValue = request.getHeader(headerName);
		out.println(headerName + "=" + headerValue+"<br/>");
	}
%>
</body>
</html>