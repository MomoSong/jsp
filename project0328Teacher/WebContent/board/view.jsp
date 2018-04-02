<%@page import="com.webjjang.board.service.BoardViewService"%>
<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
// 데이터를 받는다.
int no = Integer.parseInt(request.getParameter("no"));
// 서비스를 생성하고 호출한다.
BoardViewService boardViewService = new BoardViewService();
BoardDTO boardDTO = boardViewService.process(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글보기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
// 	alert("OK");
	// 버튼 이벤트 처리
	$("#update").click(function(){
		location="update.jsp?no="+$("#td_no").text();
	});
	$("#delete").click(function(){
		if(confirm("정말 삭제하시겠습니까?"))
			location="delete.jsp?no="+$("#td_no").text();
	});
	$("#list").click(function(){
		location="list.jsp";
	});
});
</script>
<link rel="stylesheet" href="../css/board.css" />
</head>
<body>
<h1>게시판 글보기</h1>
<table>
<tbody>
<!-- 데이터를 출력한다. -->
	<tr>
		<th>번호</th>
		<td id="td_no"><%= boardDTO.getNo() %></td>
	</tr>
	<tr>
		<th>제목</th>
		<td><%= boardDTO.getTitle()%></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><pre><%= boardDTO.getContent()%></pre></td>
	<tr/>
	<tr>
		<th>작성자</th>
		<td><%= boardDTO.getWriter()%></td>
	</tr>
	<tr>
		<th>작성일</th>
		<td><%= boardDTO.getWriteDate()%></td>
	</tr>
	<tr>
		<th>조회수</th>
		<td><%= boardDTO.getHit()%></td>
	</tr>
</tbody>
<tfoot>
	<tr>
		<td colspan="2">
			<button id="update">수정</button>
			<button id="delete">삭제</button>
			<button id="list">리스트</button>
		</td>
	</tr>
</tfoot>
</table>
</body>
</html>