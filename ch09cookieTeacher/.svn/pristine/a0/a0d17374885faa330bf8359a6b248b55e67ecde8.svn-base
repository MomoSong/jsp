<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// 삭제할 쿠키를 선언
String name = "name";
Cookie[] cookies = request.getCookies();
// 쿠키가 있는 경우만 처리
if(cookies != null && cookies.length >0){
	// 원하는 쿠키를 찾는 반복문
	for(int i =0; i< cookies.length ; i++){
		// 원하는 쿠키를 찾기 if
		if(cookies[i].getName().equals(name)){
			Cookie cookie = new Cookie(name,"");
			// 유효 시간을 셋팅한다. 0을 쓰면 사용안함.
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			break; // 찾아서 처리했으므로 반복문을 빠져 나간다.
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
<%= name %> 쿠키를 삭제 했습니다.
</body>
</html>