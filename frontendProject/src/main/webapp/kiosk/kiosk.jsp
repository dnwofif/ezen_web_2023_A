<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/frontendProject/css/kiosk.css" rel="stylesheet">
</head>
<body>
	<%@include file="../header.jsp" %>
	
	<div class="kioskwrap"><!-- 키오스크 시작 -->
		<div> <!-- 헤더 : 광고이미지/카테고리출력 표시되는 구역 -->
			<!-- 광고 이미지 -->
			<img class="himg" src="../img/himg1.png">
			<!-- 카테고리 -->
			<ul class="categorymenu">
				<li class="categoryselect">신제품(NEW)</li>
				<li>프리미엄</li>
				<li>와퍼&주니어	</li>
				<li>치킨&슈림프버거</li>
				<li>올데이킹&킹모닝</li>
			</ul>
		</div><!-- 헤더 end -->
		
		<div class="kioskcontent"> <!-- 본문 : 제품출력/카트 출력되는 구역 -->
			<div class="productbox"> <!-- 제품구역 시작 -->
					<!-- 4. productPrint 함수가 html 넣어주는 위치 -->
				
			</div> <!-- 제품구역 end -->
			
			<div class="carbox"> <!-- 카트구역 시작-->
				<div class="cartcontent"> <!-- 제품개수/가격, 제품정보 출력 시작-->
					<div class="carttop">
						<div> 카트 <span class="ccount"> 0 </span></div>
						<div> 총 주문금액 <span class="ctotal"> 0 </span> </div>
					</div> 
					<div class="cartbottom">
						<!-- 6.cartPrint 함수가 html 넣어주는 위치 -->
					</div> 
				 
				
				</div>	<!-- 제품개수/가격, 제품정보 출력 end -->
				<div class="cartbtn"> <!-- 버튼 구역 -->
					<button onclick="cartCancel()" class="cancelbtn">취소하기</button>
					<button onclick="productOrder()" class="orderbtn">주문하기</button>
				</div>	<!-- 버튼 구역 end -->
			</div> <!-- 카트구역 end-->
		</div><!-- 본문 end -->
	</div><!-- 키오스크 end -->

	<%@include file="../footer.jsp" %>
	
	
	<script src="/frontendProject/js/kiosk.js" type="text/javascript"></script>
	
</body>
</html>