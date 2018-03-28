<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 저장할 객체를 생성해서 pageContext객체에 담아둔다.  -->
<jsp:useBean id="memberInfo" class="ch08bean.member.MemberInfo" />
<!-- 넘어온 데이터를 자동으로 담는다. 넘어온 name과 property이름이 같아야 한다 -->
<jsp:setProperty property="*" name="memberInfo" />
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>가입 확인</title>
</head>
<body>
<p>반드시 memberForm.jsp 부터 실행하셔야 합니다.</p>
아이디 : <jsp:getProperty property="id" name="memberInfo"/><br/>
비밀번호 : <jsp:getProperty property="password" name="memberInfo"/><br/>
이름 : <jsp:getProperty property="name" name="memberInfo"/><br/>
<%-- 이메일 : <jsp:getProperty property="email" name="memberInfo"/><br/> --%>
이메일: ${memberInfo.email } <br/>
닉네임 : ${memberInfo.nickName }
</body>
</html>