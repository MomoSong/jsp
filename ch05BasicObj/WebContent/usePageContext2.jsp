<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Context</title>
</head>
<body>

pageContext : <%= pageContext.getAttribute("name") %><br/>
session : <%= session.getAttribute("id") %><br/>
application : <%= application.getAttribute("count") %><br/>

<a href="usePageContext.jsp">이전 페이지</a>


</body>
</html>