<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 부분적을 예외처리 -->
<c:catch var="e">
<%= request.getParameter("name") %>
<%= (request.getParameter("name").equals("test"))?"":"" %>
</c:catch>
예외처리 밖 : ${e }

</body>
</html>