<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.webjjang.board.service.BoardListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BoardListService boardListService = new BoardListService();
	List<BoardDTO> list = boardListService.process();
%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트</title>
</head>
<body>
	<h1>게시판 리스트</h1>
	<table>
		<!-- 제목 출력 -->
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<!-- 데이터 출력: 반복해서 -->
		<%
		if(list != null){
			for(BoardDTO boardDTO : list){
			%>
			<tr>
				<td><%=boardDTO.getNo() %></td>
				<td><%=boardDTO.getTitle() %></td>
				<td><%=boardDTO.getWriter() %></td>
				<td><%=boardDTO.getWriteDate() %></td>
				<td><%=boardDTO.getHit() %></td>
			</tr>
			<%
			}
		}else{ //데이터가 없으면 없다고 출력한다.
		%>
			<tr>
				<td colspan="5">데이터가 없습니다.</td>
			</tr>
		<%} %>
	</table>
</body>
</html>