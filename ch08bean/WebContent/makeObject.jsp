<%@page import="ch08bean.member.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// MemberInfo mi = new MemberInfo();
// mi.setId("test");
// mi.setName("이영환");
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="member" scope="request" class="ch08bean.member.MemberInfo"></jsp:useBean>
<jsp:setProperty property="email" name="member" value="lellj1@nate.com"/>
<%member.setId("test"); %>
<%member.setName("이영환"); %>
<jsp:forward page="/useObject.jsp" />

</body>
</html>