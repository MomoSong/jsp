<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//여기서 데이터를 처리한다. -단순히 처리만 한다.
	request.setAttribute("name", "이영환");
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="/to/to.jsp" />
여기가 from.jsp
	

</body>
</html>