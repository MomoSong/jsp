<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="util.FormatUtil" %>
<%@taglib uri="/WEB-INF/tlds/el-functions.tld" prefix="pre"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("price", 12345);
	%>
	가격 : ${pre:formatNumber(price, "#,##0") } 원<br/>
	${FormatUtil.number(price, "#,##0") }
</body>
</html>