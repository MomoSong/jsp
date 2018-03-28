<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글 처리 - 나중에는 한꺼번에 하도록 처리한다.
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>요청 파라미터 출력</title>
</head>
<body>
<b>request.getParameter() 메서드를 사용</b><br/>
name = <%= request.getParameter("name") %> ,<br/>
name = <%= request.getParameter("address") %> ,<br/>
name = <%= request.getParameter("pet") %> ,<br/>
<b>request.getParameterValues() 메서드를 사용</b><br/>
<% 
String[] pets = request.getParameterValues("pet");
for(String p : pets){
%>
<%= p %>,
<%
}
%>
<br/>
<b>out 객체를 이용한 데이터 출력</b><br/>
<%
	for(int i = 0; i< pets.length ; i++)
		out.println(pets[i]+",");
%>
<b>EL 객체를 이용한 데이터 출력</b><br/>
name=${param.name }<br/>
pet=${paramValues.pet }<br/>

<b>request.getParameterNames()를 이용한 모든 데이터 출력</b><br/>
<%
Enumeration<String> paramEnum =  request.getParameterNames();
Map<String, String[]> map = request.getParameterMap();
while(paramEnum.hasMoreElements()){
	String name = paramEnum.nextElement();
	String[] values = map.get(name);
	out.println("["+name+"]<br/>");
	for(String v : values) out.print(v+",");
	out.println("<br/>");
} //end of whiele(paramEnum.hasMoreElements())
%>
</body>
</html>