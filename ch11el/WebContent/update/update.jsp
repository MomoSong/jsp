<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("name", "홍다운");
request.setAttribute("gender", "여성");
request.setAttribute("part", "공지");
// request.setAttribute("id","test");
request.removeAttribute("id");
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${(empty id)?"로그인하세요" : id+="님 환영합니다." }</h1>
<form action="" method ="post" >
이름 : <input name="name" value="${name }" /><br/>
성별 :<br/>
<input name="gender" type="radio" value="남성" ${(gender=="남성")?"checked='checked'":""} /> 남성 
<input name="gender" type="radio" value="여성" ${(gender=="여성")?"checked='checked'":""}/> 여성 <br/>
<select name="part">
	<option ${(part == "일반") ?"selected='selected'" : "" }>일반</option>
	<option ${(part == "공지") ?"selected='selected'" : "" }>공지</option>
	<option ${(part == "질문답변") ?"selected='selected'" : "" }>질문답변</option>
</select> 
</form>
</body>
</html>