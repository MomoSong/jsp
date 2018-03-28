<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/board.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판:글쓰기</title>
</head>
<body>
<h1>게시판 글쓰기</h1>
<form action="writeProcess.jsp" method="post">
<table>
<tr>
	<th><label for="title">제목</label></th>
	<td>
		<input id="title" size="60" maxlength="100"
		required="required" pattern="^.{3,100}$"
		placeholder="제목입력" name="title" />
	</td>
</tr>
<tr>
	<th><label for="content">내용</label></th>
	<td>
		<textarea rows="5" cols="60" id="content"
		name="content" required="required"
		placeholder="내용입력 - 4자이상"
		></textarea>
	</td>
</tr>
<tr>
	<th><label for="writer">작성자</label></th>
	<td>
		<input name="writer" id="writer"
		required="required" pattern="^[A-Za-z가-힣]{2,10}$"
		size="6" maxlength="10"/>
	</td>
</tr>
<tr>
	<td colspan="2" class="justRight">
		<button>등록</button>
		<button type="reset">새로입력</button>
		<button onclick
		="history.back()">취소</button>
	</td>
</tr>
</table>
</form>
</body>
</html>