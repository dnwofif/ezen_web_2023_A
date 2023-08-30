<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="../css/member.css" rel="stylesheet">

</head> 
<body>

	<%@include file = "../header.jsp" %>
	
	<!-- 1.헤더에서 로그인메뉴를 클릭했을때 2.회원가입 성공하면 -->
	
	<div class="webcontainer"> <!-- 회원가입 전체 구역  -->
		<form class="signupForm"> <!-- 폼 전송시 각 input에 name속성 -->
			아이디 : <input maxlength="30"  name="mid" class="mid"  type="text" /> 
			<br/>
			
			비밀번호 : <input maxlength="20"  name="mpwd" class="mpwd" type="password" /> <br/>
			<br/>
			
			<!-- 로그인 유효성검사 구역 -->
			<div class="logincheckbox"></div>
			<!-- 아이디/비밀번호찾기 구역 -->
			<div class="findbtnbox">
				<a href="#">아이디찾기</a>
				<a href="#">비밀번호찾기</a>
			</div>
			<br/>
			<button class="signupbtn" onclick="login()" type="button">로그인</button>
		</form>
	</div>
	
	<script src="../js/login.js" type="text/javascript"> </script>
	

</body>
</html>