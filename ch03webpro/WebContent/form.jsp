<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>폼생성</title>
</head>
<body>
<form action="viewParameter.jsp" method="post">
	<label for="name">이름</label>
	<input name="name" size="10" maxlength="10" id="name"
	required="required" placeholder="2자 이상 10자까지만 입력"
	pattern="^.{2,10}$" /> <br/>
	<label for="address">주소</label>
	<input name="address" size="20" maxlength="50" id="address"
	required="required" placeholder="5자 이상 50자까지만 입력"
	pattern="^.{5,50}$" /> <br/>
	<label>좋아하는 동물</label>
	<input name="pet" value="cat" type="checkbox"> 고양이 
	<input name="pet" value="dog" type="checkbox"> 강아지 
	<input name="pet" value="fig" type="checkbox"> 돼지 <br/>
	<button>전송</button>
</form>
</body>
</html>