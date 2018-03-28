<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// 모든 쿠키를 request에서 부터 꺼낸다.
Cookie[] cookies = request.getCookies();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 목록</title>
</head>
<body>
<%
// 쿠키가 존재하면 출력한다.
if(cookies != null && cookies.length > 0){
	for(int i =0; i < cookies.length ; i++){
		out.print(cookies[i].getName()+"=");
		out.print(URLDecoder.decode(cookies[i].getValue(),
				"utf-8")+"<br/>");
		out.print(cookies[i].getDomain() +"<br/>");
		out.print(cookies[i].getPath() +"<br/>");
	}
}
%>
</body>
</html>