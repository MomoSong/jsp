<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "테스트" %><br/>
<%
//java 입니다.
	out.print("test<br/>"); 
	out.print(out.getBufferSize() + "<br/>");
	//버퍼의 모든 데이터를 보내자.
	out.flush();
	out.print("여기는 보내지지 않습니다. 아래서 버퍼의 내용을 비운다.");
	out.clearBuffer();
%>
</body>
</html>