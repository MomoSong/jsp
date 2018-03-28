<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
String name = "name";
if(cookies != null && cookies.length > 0){
	for(int i =0; i < cookies.length; i++){
		if(cookies[i].getName().equals(name)){
			Cookie cookie = new Cookie(name, "");
			//유효 시간을 셋팅한다. 0을 쓰면 사용안함
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			break;
		}
	}
}
%>


<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=name %> 쿠키를 삭제했습니다.
</body>
</html>
