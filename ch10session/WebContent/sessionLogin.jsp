<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//넘어온 데이터를 받는다.
String id = request.getParameter("id");
String password = request.getParameter("password");
//회원의 DB를 검색해서 로그인에 필요한 데이터를 가져온다.
// select id, nickName, grade, point from member 
// where id = ? and pw = ?
//가져와지면 로그인 처리, 그렇지 않으면 아이디나 비밀번호를 확인하라고 보여주고 로그인 화면으로 간다.
// 정상적으로 가져왔다라고 가정하고 강제 로그인 시킨다.
if(id != null && id.length() > 0)
	session.setAttribute("id", id);
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<P>
sessionLoginForm.jsp에서 시작하세요.
</P>
<!-- 로그인 확인 -->
<%=(session.getAttribute("id") != null)? 
		session.getAttribute("id") : "로그인이 되어있지 않습니다." %>
</body>
</html>