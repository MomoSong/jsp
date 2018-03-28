<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 입력 폼</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form action="join.jsp" method="post">
		<table>
			<tr>
				<th><label for="id">아이디</label></th>
				<td><input id="id" type="text" name="id" size="10" maxlength="10" placeholder="아이디" required="required" pattern="^[A-Za-z0-9]{2, 10}$"/></td>
			</tr>
			<tr>
				<th><label for="password">비밀번호</label></th>
				<td><input id="password" name="password" type="password" size="20" maxlength="10" placeholder="비밀번호" required="required" pattern="^.{2, 20}$"/></td>
			</tr>
			<tr>
				<th><label for="name">이름</label></th>
				<td><input id="name" name="name" size="10" maxlength="10" placeholder="이름" required="required" pattern="^[A-Za-z가-힣]{2, 10}$"/></td>
			</tr>
			<tr>
				<th><label for="email">이메일</label></th>
				<td ><input id="email" name="email" size="20" maxlength="50" placeholder="이메일" /></td>
			</tr>
			<tr>
				<td colspan="2"><button>가입</button></td>
			</tr>
		</table>
	</form>
</body>
</html>