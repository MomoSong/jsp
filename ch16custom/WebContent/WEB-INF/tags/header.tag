<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag trimDirectiveWhitespaces="true" body-content="empty" %>
<!-- 전달받아서 사용하는 속성을 선언 -->
<!-- 입력하는 데이터의 타입을 지정(type) 기본값은 String(생략가능)-->
<%@ attribute name="title" required="true" %>
<%@ attribute name="level" type="java.lang.Integer" %>
<%
	String headStartTag = "";
	String headEndTag = "";
	if(level == null){
		headStartTag = "<h1>";
		headEndTag = "</h1>";
	}else if (level >= 1 && level <= 6){
		headStartTag = "<h"+level+">";
		headEndTag = "</h"+level+">";
	}
%>

<%= headStartTag %>
${title}
<%= headEndTag %>