<%@page import="java.util.ArrayList"%>
<%@page import="com.iw.StockCrawler.Crawler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Crawler myCrawl = new Crawler();
ArrayList<String> ar = myCrawl.crawler();
%>    
    
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
for(String str : ar){
%>	
	<%= str %><br/>
<%	
}
%>

</body>
</html>