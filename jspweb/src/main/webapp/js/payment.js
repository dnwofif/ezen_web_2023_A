//1. 테스트
setPoint(1000, "회원가입축하");

//1. 포인트 사용 함수
function setPoint( mpamount, mpcomment ){
	if( localStorage == false ){ return; }
	$.ajax({
		url : "/jspweb/PointController",
		method : "post",
		data : { mpamount: mpamount , mpcomment : mpcomment},
		success : e => {console.log(e);}
	})
}

//2. 내 포인트 확인 함수 
function getPoint(){
	if( loginState == false ){ return; }
	$.ajax({
		url : "/jspweb/PointController",
		method : "get",
		data : { type : 1 },
		success : e => {console.log(e);}
	})
}

//3. 내 포인트 내역 전체 출력 함수
function getPointList(){
	if( loginState == false ){ return; }
	$.ajax({
		url : "/jspweb/PointController",
		method : "get",
		data : { type : 2 },
		success : e => {console.log(e);}
	})
}