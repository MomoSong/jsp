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
<link rel="stylesheet" href="../css/board.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판:글보기</title>
</head>
<body>
<h1>게시판 글보기</h1>
<table>
<tr>
	<th>번호</th>
	<td><%= boardDTO.getNo() %></td>
</tr>
<tr>
	<th>제목</th>
	<td><%= boardDTO.getTitle() %></td>
</tr>
<tr>
	<th>내용</th>
	<td><pre><%= boardDTO.getContent() %></pre></td>
</tr>
<tr>
	<th>작성자</th>
	<td><%= boardDTO.getWriter() %></td>
</tr>
<tr>
	<th>작성일</th>
	<td><%= boardDTO.getWriteDate() %></td>
</tr>
<tr>
	<th>조회수</th>
	<td><%= boardDTO.getHit() %></td>
</tr>
<tr>
	<td colspan="2" class="justRight">
		<button onclick
		="location='update.jsp?no=<%= boardDTO.getNo() %>'">글수정</button>
		<button onclick
		="location='delete.jsp?no=<%= boardDTO.getNo() %>'">글삭제</button>
		<button onclick
		="location='list.jsp'">목록</button>
	</td>
</tr>
</table>
</body>
</html>