<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>클라이언트 및 서버 정보</title>
</head>
<body>
IP4 : 0.0.0.0 ~ 255.255.255.255<br/>
IP6 : 0:0:0:0:0:0:0:0 ~ 255:255:255:255:255:255:255:255<br/>
클라이언트 IP = <%= request.getRemoteAddr() %><br/>
인코딩 = <%= request.getCharacterEncoding() %><br/>
프로토콜 = <%= request.getProtocol() %><br/>
전송방식 = <%= request.getMethod() %><br/>
URI = <%= request.getRequestURI() %><br/>
URL = <%= request.getRequestURL() %><br/>
컨텍스트 경로 = <%= request.getContextPath() %><br/>
서버 이름 = <%= request.getServerName() %><br/>
서버 포트 = <%= request.getServerPort() %><br/>
실제경로 = <%= request.getRealPath(".") %><br/>
실제경로 = <%= request.getServletContext().getRealPath(".") %><br/>
</body>
</html>