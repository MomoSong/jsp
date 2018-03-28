<%@page import="java.util.ArrayList"%>
<%@page import="jusik.Jusik"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
Jusik jusik = new Jusik();
ArrayList<String> ar = new ArrayList<>();
ar = jusik.getJusik();
for(int i =0; i <ar.size(); i++){
	String s = ar.get(i);
	
%>
<%=s%><br/>

<%
}
%>

</body>
</html>