<%@page import="java.util.ArrayList"%>
<%@page import="com.iw.news.board.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
List<BoardDTO> list = new ArrayList<>();
list.add(new BoardDTO(10, "자바", null, "이영환", "2018-03-30", 10));
list.add(new BoardDTO(10, "JSP", null, "홍다운", "2018-03-30", 8));
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
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
</thead>
<tbody>
<!-- 반복처리해서 데이터를 출력한다. -->
<c:forEach items="${list }" var="boardDTO">
	<tr class="data">
		<td>${boardDTO.no }</td>
		<td>${boardDTO.title }</td>
		<td>${boardDTO.writer }</td>
		<td>${boardDTO.writeDate }</td>
		<td>${boardDTO.hit }</td>
	</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>