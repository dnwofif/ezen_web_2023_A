console.log('1_AJAX통신 호출 ')

//1. 예제1

function 예제1(){
	$.ajax({
		url : "http://localhost/jspweb/Test06",							
		data : {"value1":"안녕하세요"},							
		method : "get",						
		success : function 함수(result){},	
		error : function 함수(result){},		
	});
	
}// f end

function 예제2(){
	//1. 입력받은 데이터 가져오기
	let nameData = document.querySelector('.name').value;
	let ageData = document.querySelector('.age').value;
	//2. 객체화
	let info = {
		name : nameData,
		age : ageData
	}
	//3. [1달=> 배열에 객체 저장]
	//3. [3달=> 객체를 ]
	$.ajax({
		url : "http://localhost/jspweb/Test07",							
		data : info,							
		method : "get",						
		success : function 함수(result){},	
		error : function 함수(result){},		
	});
}

/*
	$.ajax();	매개변수에 객체{ } 타입의 속성 대입
	
	$.ajax({
		url : "",							-- 통신할 HTTP 주소
		data : {},							-- 보내는 데이터
		method : "",						-- POST , GET, PUT , DELETE
		success : function 함수(result){},	-- 통신 성공 했을때
		error : function 함수(result){},		-- 통신 실패 했을때
	});
*/