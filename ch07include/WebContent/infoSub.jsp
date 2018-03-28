<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String type = request.getParameter("type");
	Object test = request.getAttribute("test");
%>

<%= type %><br/>
<%= test %>
