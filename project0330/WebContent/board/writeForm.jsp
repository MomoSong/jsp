<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
// 		alert("ok!");
		//버튼 이벤트 처리
		$("#update").click(function(){
			location="update.jsp?no="+$("#td_no").text();
		});
		$("#delete").click(function(){
			if(confirm("정말 삭제하시겠습니까?"))
				location="delete.jsp?no="+$("#td_no").text();
		});
		$("#list").click(function(){
			location="list.jsp";
		});
	});
</script>
<link rel="stylesheet" href="../css/board.css"/>
</head>
<body>
	<h1>게시판 글 쓰기</h1>
	<form action = "write.jsp" method="post">
	<table>
		
		<tbody>
<!-- 데이터를 입력하는  -->
	<tr>
		<th>제목</th>
		<td><input name="title" size="60" maxlength="100"/></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea rows="5" cols="60" name="content"></textarea></td>
	<tr/>
	<tr>
		<th>작성자</th>
		<td><input name="writer" size="10" maxlength="10"/></td>
	</tr>
</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<button >등록</button>
					<button type="reset">새로고침</button>
					<button type="button" id="cancel">취소</button>
				</td>
			</tr>
		</tfoot>
	</table>
	</form>
</body>
</html>