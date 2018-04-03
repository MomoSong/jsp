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
<c:set var="price">10000</c:set>
${price } 원<br/>
<fmt:formatNumber value="${price }" pattern="W##0,000.00원" /><br/>
<fmt:formatNumber value="${price }" type="number" /><br/>
<fmt:formatNumber value="${price }" type="currency"/><br/>
<fmt:formatNumber value="${price }" type="currency"
 currencySymbol="＄"/><br/>
<fmt:formatNumber value="0.5" type="percent"/><br/>
<!-- 포메션되어 있는 값을 숫자로 꺼낼 때 parseNumber num으로 저장한다. -->
<fmt:parseNumber value="1,100.12원" /><br/>
<fmt:parseNumber value="1,100.12원" var="num" /><br/>
${num * 2.0 }
</body>
</html>