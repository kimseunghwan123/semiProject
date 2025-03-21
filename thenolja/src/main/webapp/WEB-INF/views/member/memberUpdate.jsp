<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>



	<jsp:include page="../common/header.jsp"/>
	
	
	<div class="outer">
		<br>
		<div id="word">
			<span align ="center">정보수정</span>

		</div>
		
		<form id="mypage-form" method="post" action="update.member">
			<table align="center">

				<tr>
					<td>이름</td>
					<td><input type="text" maxlength="5" required name="memName" value="${ loginMember.memName }" autofocus></td>
					<td></td>
				</tr>
				<tr></tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" placeholder="-포함해서 입력해주세요." name="memPhone" value="${ loginMember.memPhone }" required></td>
					<td></td>
				</tr>
				<tr></tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" value="${ loginMember.email }" required></td>
					<td></td>
				</tr>
				<tr></tr>
				<tr>
					<td>새로운 비밀번호</td>
					<td><input type="password" name="memPwd" id="newPwd1" required></td>
				</tr>
				<tr>
					<td>새로운 비밀번호 확인</td>
					<td><input type="password" id="newPwd2" required></td>
					<td><button type="button" id="pwdCheck1" onclick="pwdCheck()">비밀번호 확인</button></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="pwdCheck2"></div></td>
				</tr>

			</table>

			<!-- 이름 정규표현식-->
			<script>
				$('input[name=memName]').blur(function(){
						const memNameReg = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|]{2,15}$/;
						const memNameVal = $('input[name=memName]').val();
	
						if(!memNameReg.test(memNameVal)){
							$('input[name=memName]').val('');
							$('input[name=memName]').css('border-color','orangered');
						}
						else{
							$('input[name=memName]').css('border-color','rgb(230, 230, 230)');
						}
					});
			</script>

			<!-- 전화번호 정규표현식-->
			<script>
				$('input[name=memPhone]').blur(function(){
					let phoneCheck = /^01([0|1|])-?([0-9]{4})-?([0-9]{4})$/;
					let phoneVal = $('input[name=memPhone]').val();

					if(!phoneCheck.test(phoneVal)){
						$('input[name=memPhone]').val('');
						$('input[name=memPhone]').css('border-color','orangered');
					}
					else{
						$('input[name=memPhone]').css('border-color',' rgb(230, 230, 230)');
					}
				});
			</script>

			<!-- 이메일 정규표현식 -->
			<script>
				$('input[name=email]').blur(function(){
					const emailReg = /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/
					const emailVal = $('input[name=email]').val();
	
					if(!emailReg.test(emailVal)){
						$('input[name=email]').val('');
						$('input[name=email]').css('border-color','orangered');
					}
					else{
						$('input[name=email]').css('border-color','rgb(230, 230, 230)');
					}
				});
			</script>

			<!-- 비밀번호1 정규표현식 -->
			<script>
				/* 비밀번호 */
				$('input[name=memPwd]').blur(function(){
					const pwdReg =  /^[A-Za-z0-9]{4,15}$/;
					const pwdVal = $('input[name=memPwd]').val();
	
					if(!pwdReg.test(pwdVal)){
						$('input[name=memPwd]').val('');
						$('input[name=memPwd]').css('border-color','orangered');
					}
					else{
						$('input[name=memPwd]').css('border-color','rgb(230, 230, 230)');
					}
				});
			</script>

			<!-- 비밀번호2 정규표현식 -->
			<script>
					$('#newPwd2').blur(function(){
						const pwdReg2 = /^[A-Za-z0-9]{4,15}$/;
						const pwdVal2 = $('#newPwd2').val();
	
						if(!pwdReg2.test(pwdVal2)){
							$('#newPwd2').val('');
							$('#newPwd2').css('border-color','orangered');
						}
						else{
							$('#newPwd2').css('border-color','rgb(230, 230, 230)');
						}
					});
			</script>
			
			<!-- 비밀번호 일치확인 -->
			<script>
				function pwdCheck(){
					const pwd1 = document.getElementById('newPwd1');
					const pwd2 = document.getElementById('newPwd2');
					const pwdCheck = document.getElementById('pwdCheck2');
					const next = document.getElementById('next');
					
					if(pwd1.value != pwd2.value){
						pwdCheck.innerHTML = "비밀번호가 일치하지 않습니다.";
						pwd1.value = '';
						pwd2.value = '';
						pwdCheck.style = "color:red;  display:block;"
						/*next.disabled = true;*/
						return false;
					}
					else{
						pwdCheck.innerHTML = "비밀번호가 일치합니다. ✓";
						pwdCheck.style = "color:green; display:block;";
						/*next.disabled = false;*/

						return true;
					}
				}        

			</script>

			<div align="center">
				<button type="reset" id="reset">초기화</button>
				<button type="submit" id="changeBtn" id="next">변경하기</button>
				<input type="hidden" value="${ loginMember.memNo }" name="memNo">
				<input type="hidden" value="${ loginMember.memId }" name="memId">
			</div>

			<br><br>
		
		</form>
	</div>





</body>
</html>