<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set value="<%= new Date() %>" var="now" />
${now }<br/>
<fmt:formatDate value="${now }"/><br/>
<fmt:formatDate value="${now }" type="date"/><br/>
<fmt:formatDate value="${now }" type="time"/><br/>
<fmt:formatDate value="${now }" type="both"/><br/>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd"/><br/>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm"/><br/>
String 2018-04-03 날짜형이 아니라 문자열 -> 날짜형으로 만들자.<br/>
<fmt:parseDate value="2018-04-03" var="date"
 pattern="yyyy-MM-dd"/>
${date }
</body>
</html>