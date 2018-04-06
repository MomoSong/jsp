<%@tag import="java.util.Calendar"%>
<%@ tag language="java" pageEncoding="UTF-8" body-content="empty"%>
<%
//오늘 날짜에 해당되는 객체를 받아 온다.
Calendar cal = Calendar.getInstance();
%>
<%= cal.get(Calendar.YEAR) %>년
<%= cal.get(Calendar.MONTH)+1 %>월
<%= cal.get(Calendar.DATE) %>일