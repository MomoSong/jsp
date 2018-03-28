<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Context</title>
</head>
<body>
<%
HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();

%>

<%= httpRequest.getRemoteAddr() %><br/>
<%= request.getRemoteAddr() %><br/>
<%= httpRequest.getServletPath() %><br/>
<%= request.getServletPath() %><br/>

<%
//pageContext 객체에 데이터를 넣어보자.
pageContext.setAttribute("name", "이영환");
%>
<%
//session 객체에 데이터를 넣어보자.
session.setAttribute("id", "admin");
%>
<%
//application 객체에 데이터를 넣어보자.
application.setAttribute("count", "100");

%>

<%= pageContext.getAttribute("name") %><br/>
session : <%= session.getAttribute("id") %><br/>
application : <%= application.getAttribute("count") %><br/>
${name }<br/>
${pageScope.name }<br/>
<!-- EL 객체의  name -> 키로 데이터를 get하게 된다. scope를 지정하지 않으면 4군데서 찾는다. -->
<!-- 첫번 째는 pageContext, 그다음 request, 다음 session, 마지막으로 application에서 찾는다. -->
request 영역 : ${requestScope.name }<br/>
<a href="usePageContext2.jsp">다른 페이지</a>


</body>
</html>