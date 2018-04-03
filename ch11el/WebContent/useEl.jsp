<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 URI : ${pageContext.request.requestURI }
	<br /> ${pageContext.session.id}
	<br />

	<%
		pageContext.setAttribute("request", "test");
	%>
	${request }
	<br /> ${"10" +1 }
	<br /> ${null +1 }
	<br />
	<%-- ${"일" +1 }<br/>  에러500--%>
	${"일"}${1 }
	<br /> ${"문자" += "열" += "연결" }
	<br /> ${1+1; 10+10}
	<br /> ${var=10 }
	<br /> ${var }
	<br /> ${pageScope.var }
	<br /> \${var }


</body>
</html>