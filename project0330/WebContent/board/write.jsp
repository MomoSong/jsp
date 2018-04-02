<%@page import="com.webjjang.board.service.BoardWriteService"%>
<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//한글처리
request.setCharacterEncoding("utf-8");
BoardDTO boardDTO = new BoardDTO(request.getParameter("title"),
								request.getParameter("content"),
								request.getParameter("writer"));
BoardWriteService boardWriteService = new BoardWriteService();
boardWriteService.process(boardDTO);
response.sendRedirect("list.jsp");
%>