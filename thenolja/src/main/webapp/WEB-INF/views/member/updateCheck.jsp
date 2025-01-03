<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정 {중복}체크</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

	<style>
		/*div{border: 1px solid red;}*/
		#wrap{
			width: 1200px;
			height: 600px;
			margin: auto;
		}

		#content{
			width: 50%;
			margin: auto;
			border: 1px solid lightgray;
			margin-top: 50px;
		}

		.content{
			width: 100%;
			margin: auto;
		}

		#loginword{margin-top: 10px; color: rgb(70, 149, 151);}

		#loginword > span{
			text-align: center; 
			height: 100px;
			font-size: 40px;
			font-weight: bold;
		}
		
		
		#login-area{width: 100%; height: 100%;}
		
		#pwdCheck2, #password{
			margin-top: 20px;
		}

        #pwdCheck2{
            margin: auto;
            margin-top: 10px;
            height: 25px;
			display: none;
        }

		#password{
			background-image: url('resources/login/password.png');
		}

		.input:focus{
			border-color: rgb(70, 149, 151);
		}

		.input{
			width: 400px;
			height: 50px;
			border-color: rgb(230, 230, 230);
			border-radius: 10px;
			background-repeat: no-repeat;
			background-size: 30px;
			background-position: right;
		}
		#content{text-align: center;}

		#content3{
			margin-top: 50px;
		}

		div > .btn{
			width: 400px;
			height: 50px;
			background-color: rgb(70, 149, 151);
			color: white;
			font-size: 20px;
			font-weight: bold;
			margin-bottom: 30px;
		}

	
	
	</style>


</head>
<body>

	<jsp:include page="../common/header.jsp"/>


		<div id="wrap">
			<div id="content">
				<div id="loginword">
					<span>비밀번호 확인</span>
				</div>
				<div id="login-area" class="content">
				
						<div id="content1">
							<input type="password" name="memPwd" id="password" class="input" placeholder="본인 확인을 위해 비밀번호를 입력해주세요." autofocus maxlength="15" required>
							<div id="pwdCheck" class="input"></div>
						</div>

						<div id="content3">
                            <button class="btn" onclick="pwdCheck()">비밀번호 확인</button>
							<button type="submit" class="btn" id="next" disabled onclick="location.href='update.member'">다음</button>
						</div>
                        
                        <script>
                            function pwdCheck(){
                                const pwd = document.getElementById('password');
                                const pwdCheck = document.getElementById('pwdCheck2');
                                const next = document.getElementById('next');
                                
                                if('${ loginMember.memPwd }' != pwd.value){
                                	
                                	pwdCheck.innerHTML = "비밀번호가 일치하지 않습니다.";
                                    pwd.value = '';
									pwdCheck.style = "color:red; background-color:rgb(255, 218, 224); display:block;"
                                    return false;
                                }
                                else{
                                    pwdCheck.innerHTML = "비밀번호가 일치합니다. ✓";
                                    next.disabled = false;
									pwdCheck.style = "color:green; background-color:lightgreen; display:block;";
									pwd.readOnly = true;
                                    return true;
                                }
                            }

                        </script>

				</div>
			</div>
		
		</div>




</body>
</html>