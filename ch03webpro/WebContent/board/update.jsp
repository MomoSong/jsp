<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// BoardDTO에 데이터를 채워서 -> 강제로 데이터 담기
BoardDTO boardDTO 
= new BoardDTO(10,"자바란?","컴퓨터 프로그래밍 언어.\n 데이터의 저장과 처리를 한다.",
		"이영환","2018-03-21", 10);
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판:글수정</title>
</head>
<body>
	<h1>게시판 글쓰기</h1>
	<form action="writeProcess.jsp" method="post">
		<table>
			<tr>
				<th><label for="no">번호</label></th>
				<td>
				<input id="no" readonly="readonly"name="no" value="<%=boardDTO.getNo() %>" /></td>
			</tr>
			<tr>
				<th><label for="title">제목</label></th>
				<td>
				<input id="title" size="60" maxlength="100"
					required="required" pattern="^.{3, 100}$" placeholder="제목입력"
					name="title" value="<%=boardDTO.getTitle() %>" /></td>
			</tr>
			<tr>
				<th><label for="content">내용</label></th>
				<td>
				<textarea rows="5" cols="60" id="content" name="content"
						required="required" placeholder="내용 입력-4자이상" ><%=boardDTO.getContent() %>"</textarea>
				</td>
			</tr>
			<tr>
				<th><label for="writer">작성자</label></th>
				<td><input name="writer" id="writer" required="required" pattern="^[A-Za-z가-힣]{2,10}$"
				 size="6" maxlength="10" value="<%=boardDTO.getWriter() %>"/></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<button>수정</button>
					<button type="reset">새로입력</button>
					<button onclick="history.back()">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>