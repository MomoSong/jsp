<%@page import="com.webjjang.board.service.BoardViewService"%>
<%@page import="com.webjjang.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글보기</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
// 	alert("OK");
	// 버튼 이벤트 처리
	$("#update").click(function(){
// 		location="update.do?no="+$("#td_no").text();
		$("#dataForm").attr("action","update.do");
		$("#dataForm").submit();
	});
	$("#delete").click(function(){
		if(confirm("정말 삭제하시겠습니까?"))
			location="delete.do?no="+$("#td_no").text();
	});
	$("#list").click(function(){
// 		location="list.do";
		$("#dataForm input[name='no']").attr("disabled","disabled")
		$("#dataForm").attr("action","list.do");
		$("#dataForm").submit();
	});
});
</script>
</head>
<body>
<!-- 넘어온 데이터를 저장해 놓는 form tag 작성. 모든 input tag는 type 속성을 hidden -->
<form id="dataForm">
	<input type="hidden" name="no" value="${boardDTO.no }" />
	<input type="hidden" name="page" value="${param.page }" />
	<input type="hidden" name="rowPerPage" value="${param.rowPerPage }" />
</form>
<div class="container">
<h1>게시판 글보기</h1>
<table class="table">
<tbody>
<!-- 데이터를 출력한다. -->
	<tr>
		<th>번호</th>
		<td id="td_no">${boardDTO.no}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${boardDTO.title}</td>
	</tr>
	<tr>
		<th>내용</th>
		<td><pre>${boardDTO.content}</pre></td>
	<tr/>
	<tr>
		<th>작성자</th>
		<td>${boardDTO.writer}</td>
	</tr>
	<tr>
		<th>작성일</th>
		<td>${boardDTO.writeDate}</td>
	</tr>
	<tr>
		<th>조회수</th>
		<td>${boardDTO.hit}</td>
	</tr>
</tbody>
<tfoot>
	<tr>
		<td colspan="2">
			<button id="update" class="btn btn-primary">수정</button>
			<button id="delete" class="btn btn-danger">삭제</button>
			<button id="list" class="btn btn-success">리스트</button>
		</td>
	</tr>
</tfoot>
</table>
</div>
</body>
</html>