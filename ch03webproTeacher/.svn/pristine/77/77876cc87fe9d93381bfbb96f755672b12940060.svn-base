<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 한글 처리
request.setCharacterEncoding("utf-8");
// 데이터를 받자.
String id = request.getParameter("id");
String pw = request.getParameter("pw");
if(id!=null && id.equals("test")
  && pw!=null && pw.equals("1234"))
	response.sendRedirect("index.jsp");
else 
	response.sendRedirect("loginError.jsp");
%>

