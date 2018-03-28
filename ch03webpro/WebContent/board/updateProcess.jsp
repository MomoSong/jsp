<%@page import="com.webjjang.board.dto.BoardDTO"%>
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
//수정에 대한 생성자가 없기 때문에 글쓰기 생성자로 데이터를 받고 글번호를 따로 넣어준다
boardDTO.setNo(Integer.parseInt(request.getParameter("no")));

System.out.println("수정한 데이터: "+ boardDTO);
//자동으로 리스트로 이동시킨다
response.sendRedirect("view.jsp?no=" + boardDTO.getNo());

%>
