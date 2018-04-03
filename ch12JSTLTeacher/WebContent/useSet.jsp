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
<h1>데이터 셋팅</h1>
<c:set var="name" value="이영환" />
<c:set var="age">52</c:set>
<c:out value="${name }" /><br/>
${pageScope.age }
</body>
</html>