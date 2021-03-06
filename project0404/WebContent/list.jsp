<%@page import="java.util.List"%>
<%@page import="com.iw.news.board.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.iw.news.board.service.BoardListService"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
BoardListService boardListService = new BoardListService();
List<BoardDTO> list = boardListService.process();
request.setAttribute("list", list);


%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$(".data").click(function(){
			var no = $(this).find("td:first").text();
			location = "view.jsp?no="+no;
		});
		$("#write").click(function(){
			location = "writeForm.jsp";
		});
	});
</script>
<link rel="stylesheet" href="./css/board.css"/>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${list }" var="boardDTO" >
		<tr class="data">
			<td>${boardDTO.no }</td>
			<td>${boardDTO.title }</td>
			<td>${boardDTO.writer }</td>
			<td>${boardDTO.writeDate }</td>
			<td>${boardDTO.hit }</td>
		</tr>
	</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="5">
				<button id="write">글쓰기</button>
			</td>
		</tr>
	</tfoot>
</table>
</body>
</html>