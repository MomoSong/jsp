<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//한글처리
int no = Integer.parseInt(request.getParameter("no"));
System.out.println("삭제할 글번호 : " + no);
//자동으로 리스트로 이동시킨다
response.sendRedirect("list.jsp");

%>
