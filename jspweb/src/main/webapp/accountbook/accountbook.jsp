<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- css import -->
	<link href="accountbook.css" rel="stylesheet" />
</head>
	<div class="visitwrap"><!-- 전체구역 시작 -->
		<div class="visit_Top"><!-- 쓰기구역 시작 -->
			<div class="visit_Inputs">
				<input class="vcontent" 	type="text" placeholder="항목내용"> 
				<input class="vamount" 	type="number" placeholder="금액"> 
				<input class="vdate" type="date" placeholder="날짜">
				<button onclick="vwrite()" type="button">등록</button>
			</div>
			
		</div><!-- 쓰기구역 끝 -->
		<div class="visit_Bottom"><!-- 출력구역 시작 -->
			
		</div><!-- 출력구역 끝 -->
	</div><!-- 전체구역 끝 -->
	
	<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="accountbook.js" type="text/javascript"></script>
</body>
</html>