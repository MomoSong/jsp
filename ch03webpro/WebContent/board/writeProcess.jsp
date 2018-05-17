<%@page import="com.iw.news.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//한글처리
request.setCharacterEncoding("utf-8");
BoardDTO boardDTO = new BoardDTO(
		request.getParameter("title"),
		request.getParameter("content"),
		request.getParameter("writer")
		);

System.out.println(boardDTO);
//자동으로 리스트로 이동시킨다
response.sendRedirect("list.jsp");

%>
