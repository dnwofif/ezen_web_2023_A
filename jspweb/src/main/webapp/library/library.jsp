<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관열람실</title>
	<link href="library.css" rel="stylesheet">
</head>
<body>
	
	<%@include file="../header.jsp" %>

   <h1 class="title">도서관</h1>
    <div class="librarywrap"> <!-- 전체구역 -->
        <div class="button_wrap"> <!-- 버튼 구역 -->
            <div class="buttonarea">
            	<!-- js 에서 출력됨 -->
            </div>
        </div>
        <div class="inputarea">
            <input class="name" type="text" placeholder="이름">
            <input class="phone" type="text" placeholder="전화번호">
        </div>
        <div class="bottom_button">
            <button onclick="admission()" type="button">[ 입실 ]</button>
            <button onclick="ldelete()" type="button">[ 퇴실 ]</button>
        </div>
    </div>

    <!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <!-- js import -->
    <script src="library.js" type="text/javascript"></script>
</body>
</html>