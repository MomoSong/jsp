<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.webjjang.board.service.BoardListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"% trimDirectiveWhitespaces="true" %>
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
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="boardDTO">
			<tr>
				<td>${boardDTO.no}</td>
				<td>${boardDTO.title}</td>
				<td>${boardDTO.writer}</td>
				<td>${boardDTO.writeDate}</td>
				<td>${boardDTO.hit}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>

</body>
</html>