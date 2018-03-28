<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인사말-출력</title>
</head>
<body>
<p>시작은 반드시 makeObject.jsp에서 하세요.</p>
<p>${member.name}</p>
<jsp:useBean id="member" scope="request" class="ch08bean.member.MemberInfo"></jsp:useBean>

<p><%=member.getId() %></p>
<p><jsp:getProperty property="email" name="member" /></p>
</body>
</html>