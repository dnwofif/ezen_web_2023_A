<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<!-- css import -->
	<link href="visitlog.css" rel="stylesheet">
	
</head>
<body>
	
	<div><!-- 전체구역 시작 -->
		<div><!-- 쓰기 구역 시작 -->
			<input class="vwriter" type="text" placeholder="작성자">
			<input class="vpwd" type="text" placeholder="비밀번호">
			<textarea class="vcontent" rows="" cols=""></textarea>
			<button onclick="vwrite()" type="button">등록</button>
		</div><!-- 쓰기 구역 끝 -->
		
		<div><!-- 출력 구역 시작 -->
		
		</div><!-- 출력 구역 끝 -->
	</div><!-- 전체구역 끝 -->
	
	<!-- 최신 JQUERY imput (ajax() 사용할 js 파일부터 위에서 호출) -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="visitlog.js" type="text/javascript"></script>
</body>
</html>