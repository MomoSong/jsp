<%@page import="com.webjjang.util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//로그 아웃은 AUTH쿠키를 지운다.
Cookie cookie = Cookies.deleteCookie(request.getCookies(), "AUTH");
if(cookie != null) response.addCookie(cookie);
else {
	out.print("<script>");
	out.print("alert(\"로그인이 필요한 페이지 입니다.\");");
	out.print("location=\""+request.getContextPath()+"/index.jsp\";");
	out.print("</script>");
}
%>
    
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
로그아웃 성공 <br/>
<a href="<%= request.getContextPath() %>/index.jsp">메인으로 이동</a>


</body>
</html>