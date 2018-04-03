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
<c:if test="true">
무조건 실행 <br/>
</c:if>
<c:set var="age">16</c:set>
<c:if test="${age>= 18 }">
	성인입니다.<br/>
</c:if>
<c:if test="${age < 18 }">
	미성인입니다.<br/>
</c:if>

${(age>=18)?"성년입니다.":"미성년입니다." }
</body>
</html>