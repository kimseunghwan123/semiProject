<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
   #login-form{
		background-color: cyan;
		 padding-top: 10px;
		 top: 40%;
		 width:80%;
		 margin:auto;
		 margin-top : 20%;
	}
</style>

</head>
<body>
	
	<jsp:include page="../common/header.jsp" />

	
	<!-- 
	<div id="login ">
		<p>로그인
		<p>
	</div>
 	-->
 	<script type="text/javascript">
 	
 	
 	
 	
 	
 	
 	
 	</script>
 	
 	
 	<form id="loginForm"  action="login.member" method="post">
	<table id="login-form">
		<table align="center">
			<tr>
				<th>아이디88u989s</th>
				<th><input type="text" name="memId" id="id" required /></th>
			</tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
				<th>비밀번호</th>
				<th><input type="password" name="memPwd" id="password" required /></th>
			</tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
			<tr>
				<td class="space" colspan="2">
				<td>
			<tr>
			<tr>
				
				<th colspan="2" style="margin: 0 auto;" style="text-align: center;">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="submit" class="btn btn-sm btn-primary" id="loginForm" name="login()">로그인</button>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button" class="btn btn-sm btn-secondary"
						onclick="enrollForm.member">회원가입</button>
					<!--  <button type="button" class="btn btn-danger" data-dismiss="modal">취소</button>-->
				</th>
			
			</tr>
		</table>


	</table>
</form>

</body>
</html>