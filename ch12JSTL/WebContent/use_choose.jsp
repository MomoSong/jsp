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
<!-- choose는 java의 switch문이다. -->
<c:set var="name">lee</c:set>
<c:set var="grade">9</c:set>

<c:choose>
	<c:when test="${name == 'lee' }">
<!-- 	조건에 맞는 경우 처리 -->
		${name }님 방갑습니다.
	</c:when>
	<c:otherwise>
<!-- 	그외 모든 조건에 맞지 않으면 처리 -->
		신원을 확인해 주세요.
	</c:otherwise>
</c:choose>
</body>
</html>