<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<div class="webcontainer"> <!-- 회원가입 전체 구역  -->
		<form class="signupForm"> <!-- 폼 전송시 각 input에 name속성 -->
			
			<h2>인사관리 등록 시스템</h2>
			
			증명사진 : 	<input onchange="preimg( this )" name="mimg" class="mimg" type="file" accept="image/*"/> <br/>
				<!-- <태그명 이벤트명="함수명( this )" /> : 함수에 이벤트실행한 태그객체 매개변수로 전달  -->
			<img class="preimg" alt="" src="img/default.webp" > <!-- 등록 사진을 미리보기 할 사진 태그  -->
			
			직원명 : <input maxlength="30" onkeyup="idcheck() " name="mid" class="mid"  type="text" /> 
			<span class="idcheckbox"></span>
			<br/>
			
			전화번호 : <input maxlength="20" onkeyup="pwcheck()" name="mpwd" class="mpwd" type="password" /> <br/>
			
			
			<span class="pwcheckbox"></span>
			<br/>
			
			
			
			<br/>
			<button class="signupbtn" onclick="signup()" type="button">인사등록</button>
		</form>
	</div>
	
</body>
</html>