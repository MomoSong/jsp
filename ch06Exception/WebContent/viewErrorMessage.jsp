<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!-- page 디텍티브 태그에 isErrorPage="true"라고 정의하면 Exception을 넘겨준다. -->
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>에러 페이지</title>
</head>
<body>
타입 : <%= exception.getClass().getName() %><br/>
메세지 : <%= exception.getMessage() %><br/>

</body>
</html>