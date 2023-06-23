/*
- 파일명 : 과제2.html / 과제2.js / 과제2.css
-------------------------------------------------------------------
요구사항1 : 아이디와 비밀번호를 입력받아 회원가입을 진행하고 싶어요.
   [조건1] 
      입력 <input> 사용 해서 아이디 입력받기 
      입력 <input> 사용 해서 비밀번호 입력받기 
   [조건2]
      * 1차원배열만 사용 [ 배열 변수 여러개 사용 가능 ]
   [조건3]
      <input type="button"> 사용해서 회원가입 이벤트 실행 [ 회원가입함수 구현하기 ]

-------------------------------------------------------------------
요구사항2 : 아이디와 비밀번호를 입력받아 로그인 을 진행하고 싶어요.
   [조건1]
      입력 <input> 사용 해서 아이디 입력받기 
      입력 <input> 사용 해서 비밀번호 입력받기 
   [조건2] 
      만약에 배열에 존재하는 아이디,비밀번호가 일치한 데이터가 있을경우
      [ 로그인 성공 ] 아니면  [ 로그인 실패 ] alert 로 출력해주세요.
   [조건3]
      <input type="button"> 사용해서 로그인 이벤트 실행    [ 로그인함수 구현하기 ]
------------------------------------------------------------------------
요구사항3 : 유효성검사 진행해주세요.  
   1. 만약에 입력상자[input] 에 공백 이면 학번을 입력해주세요~       [ if( sno2Value == '' ) ]
   2. 회원가입 이나 로그인시 성공시에 입력상자[input] 의 value 다시 공백으로 초기화 해주세요.   [ sno2.value = '' ]
   3. 입력상자[input]에 입력한 아이디 와 비밀번호 가 8자리가 이상일경우에만 회원가입하도록 해주세요.   [ sno2Value.length !=8  ]

요구사항4 : 기본적인 css 작업해주세요
   1. (필수) div 2개를 만들어서 [ 왼쪽은 회원가입 구역 ] [ 오른쪽은 로그인 구역 ]
   2. 그외 이쁘게 꾸며주세요.  
 */

/* 회원가입 조건 
	1.아이디 중복x
	2.비밀번호 중복x
	3.아이디 비밀번호가 같아야함	 */

		// 로그인성공 팝업떠야되고(로그인버튼쪽에)
		// 8자이상 넘어가면 팝업창떠야함
 let id = []			
 let password = []
 
 function 회원가입버튼(){//회원가입버튼 함수시작
	 //1. 아이디 객체 호출
	let idclassInput = document.querySelector(".idclass")	// idclass 라는 클래스명을 가진 input 객체 호출
	let Storage_id = idclassInput.value		// 입력받은 데이터 가져오기
	
	let passwordclassInput = document.querySelector(".passwordclass")	//password 라는 클래스명을 가진 input 객체 호출
	let Storage_password = passwordclassInput.value		// 입력받은 데이터 가져오기
	 
	 //아이디 유효성 검사
	id.indexOf(Storage_id) !=-1 ? alert('이미 존재하는 아이디입니다.[추가불가]') : id.push( Storage_id );password.push( Storage_password )
	
	 
	 
 }//회원가입버튼 함수 끝
 
 function 로그인버튼(){//로그인버튼 함수시작
	let idclassInput = document.querySelector(".idclass")	// idclass 라는 클래스명을 가진 input 객체 호출
	let Storage_id = idclassInput.value	// 입력받은 데이터 가져오기
	
	let passwordclassInput = document.querySelector(".passwordclass")//password 라는 클래스명을 가진 input 객체 호출
	let Storage_password = passwordclassInput.value// 입력받은 데이터 가져오기
	
	if(idclassInput !=-1 && passwordclassInput !=-1){	//아이디와 비밀번호가 들어가있을 때
		let index = id.indexOf(Storage_id)
		if( index != -1 ){	//입력된 아이디 가 배열에 존재하는지 
			if( password[index] == Storage_password ){ // 입력된 아이디의 인덱스의 위치가 곧 해당 아이디의 패스워드 인덱스 
				alert('로그인성공')// 로그인 성공 
			}
		
		}
	else alert('로그인실패')
	}
 }//로그인버튼 함수끝