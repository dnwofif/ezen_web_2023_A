/*
	요구사항
	1. HTML 작성하기
		1. div로 '글쓰기페이지, 글목록페이지, 글보기페이지' 나누기
		2. <input>을 이용하여 글쓰기페이지에 '작성자,비밀번호,제목,내용' 만들기
		3. <buttom>을 이용하여 글쓰기페이지에 '글등록 버튼'을 만들기
		4. <table>을 이용하여 글목록페이지에 '번호,제목,작성자,작성일,조회수' 만들기
		(단, border는 주지 않는다(테두리가 없어야한다.))
		5. 글쓰기 페이지에 글등록 버튼을 누르면, 글보기 페이지에 내용물이 나오게 되고
		<buttom>을 이용하여 '삭제 버튼' 만들기
	
	2. JS 작성하기
		1. 모든 함수에 접근 가능한 배열을 총4개를 선언한다
		(작성자,비밀번호,제목,내용)
		2. 함수는 총4개를 선언한다.
		(등록,삭제,전체출력,개별출력)
		3. 글쓰기페이지에 내용을 추가하고 등록버튼을 누르면 
		글목록페이지에 '제목, 작성자, 작성일'이 추가된다.
			1. 번호는 순서대로 추가된다.(인덱스사용)
			2. 조회수는 클릭한 횟수만큼 표기된다.
		4. 글쓰기페이지 '삭제'버튼을 누르면
			1. 비밀번호 배열에 저장된 값과 입력된 값을 비교하여 맞다면 글삭제,
			틀리면 비밀번호 오류 문구 뜨게 만들기
			(if문 사용하기)
			
	
	과제 4 -------------------------------------------------------
		메모리 설계
			1. 저장
				누가 작성했는지 = 작성자	let writer
				무엇을 작성했는지 = 제목, 내용	let title, let content
				게시판 식별방법 = 비밀번호 [ 작성자 동명이인 있을수 있기 때문에 ]		let password
				* 언제 작성되고 몇명이 조회 했는지? = 조회수 / 작성일 = 부가기능	let date, let viewcount

			2. 무엇을 입력 요구 할건지
				작성자 , 제목 , 내용 , 비밀번호
			
			3. 기능 상태 데이터 저장
				1. 작성일 = 등록기능이 실행된 시간상태 저장
				2. 조회수 = 해당 게시물 조회 기능 실행된 상태 저장
			
			4. 데이터 구조 구성	= JS
				변수 , 배열 , 객체
				1. 여러개 데이터 저장하기 위해 ( 배열 vs 객체 )
				
				['유재석','제목1','내용','1234','2023-06-29',0]
				{ 작성자 : '유재석',제목 : '제목1',내용 : '내용',비밀번호 : '1234',작성일 : '2023-06-29',조회수 : 0 }
				
				2. 게시물 1개 = 객체 => 게시물(객체) 여러개 저장 공간 => 배열 저장
				let boardlist = [ ]
				let board = { }
				
		기능 설계
			1. 글등록 기능			=	함수/행동	= onWrite()
			2. 글 전체 출력 기능 	=	함수/행동	= onPrint()	
			3. 글 개별 출력 기능		=	함수/행동	= onView()
			4. 글 삭제 기능			=	함수/행동	= onDelete()
		
		---------------------------작업 순서-----------------------
			1.onWrite()
				1. 등록에 필요한 데이터 입력받은 html 구성 [작성자, 비밀번호, 제목, 내용]
				2. 입력받은 데이터를 등록했을때 이벤트 구성
					1. 언제 이벤트 실행? -> 버튼 클릭했을때 -> 버튼 필요 -> 버튼 만들기
					2. 이벤트 상세 정보 -> 함수 정의 ->
					function onDelete(){}
				3. 함수 정의
					1. 사용자에게 입력받은 데이터 ( input value ) 호출
						1.document.querySelector('식별자').value
						2. 게시물1개당 = 객체1개 선언/만들기  = 각 input로 입력받은 값들을 각 속성명별로 대입해서 객체 생성 
						{ }
						* 조회수 / 작성일 = 입력받은 값이 아닌 기능상태 저장
						- 등록할때 조회수는 0으로 시작
						-  js 등록할때 현재시스템 날짜가 자동으로 등록 = new Date()
						3. // 3. 현재 { } 안에서 선언된 board 는 } 끝나면 사라짐[지역변수] --> 전역변수/배열에 저장하자.
						push
			2.onPrint()
				1. 출력 필요한 HTML 구성 [ 테이블 ]
				2. 출력 이벤트 구성
					1. 언제 이벤트 실행 ??? 1. 입장했을때(JS열렸을때) 2. 등록할때 3. 수정될때 5. 조회수증가할때
 						- 다시 출력해주는 이유 -> 변화가 있으니까 화면 업데이트 => 렌더링
 					2. 함수 상세 정의
 					function onPrint(){}
 				3.출력
 					저장 : 객체 생성 [ ]-> 배열저장
 					출력 : 배열 호출 { }-> 객체호출
 					
 					1. 반복문을 이용한 배열내 하나씩 객체 호출
 					for(let i=0; i<boardlist.lenght; i++){
						let board = boardlist[i]; }
					2. 2. 객체내 정보를 HTML형식으로 구성 
			3. onView()
				1. 개별출력 필요한 HTML구성 [div]
				2. 개별출력 이벤트 구성
					1. 언제 이벤트 실행 ??? 사용자가 보고 싶은 게시물의 제목을 클릭했을때
						<td onclick=""> $ { board.title }</td>
					2. 함수 상세 정의
						function onView() {}
				3. 함수정의
					내용 , 작성자 , 제목 = 1개 출력하고 싶은데 => 객체1개 => 배열내 몇번째 인덱스??????
					1. 클릭한 제목의 해당하는 객체의 인덱스(식별가능=중복없음)를 인수로 전달
		 			onclick="onView( ${ i } )" : i번째 인덱스의 객체를 클릭했다는 증거 
	 				2. function onView( index ){}
	
					3. 배열내 출력하고자하는 객체의 위치[인덱스]의 정보 출력 
						1. 어디에 출력할껀지 ???? div
						2. div 무엇을 대입/출력 할껀지 ??? 인수로 전달받은 인덱스에 해당하는 객체정보
						3. 대입
					4. 조회수 
						1. 인수로 전달받은 인덱스 객체의 view 속성의 값을 1증가
							board.view++   /  
							board.view += 1  / 
							board.view = board.view+1
						2. 메모리(JS)의 변화( 객체/배열 ) 있으면 HTML 반영 
			4. onDelete()
				1. 개별출력 필요한 HTML rntjd [button]
 				2. 삭제 이벤트 구성
 					1. 언제 이벤트 실행??? 삭제버튼을 클릭했을때
 					<button onclick="">삭제</button>	
 				3. 함수 정의
 					누구를 개별적으로 삭제할건지?? 현재 개별출력으로 보고 있는 객체를 배열에 삭제
 					1.삭제할 객체의 인덱스 번호 = 현재 개별출력 보고 있는객체 = 내가 제목을 클릭한 객체
 							index		= 			index		= 	i
 					2. 인덱스를 인수로 받자
 					3. 삭제할 객체의 비밀번호와 입력받은 비밀번호가 일치하면 [로그인 비슷]
 					만약에 일치하면 삭제 아니면 삭제불가
 					4. 배열내 해당 객체 삭제
 					5. 새로고침					
 */		

// * 배열  = 여러개 객체(게시물)을 저장하는 배열  
let boardlist = [ ]

// * JS 열렸을때 최초 1번 함수 실행 
onPrint()

// 1. 등록 이벤트 함수 [ 실행조건 : 등록 버튼을 클릭했을때 ]
function onWrite(){ console.log('onWrite()함수')

	// 1. 입력받은 데이터 호출 
		// 1. document.querySelector(식별자).value
	let writerValue = document.querySelector('#writer').value;
	let passwordValue = document.querySelector('#password').value;
	let titleValue = document.querySelector('#title').value;
	let contentValue = document.querySelector('#content').value;
	
		// 날짜 모양으로 출력 
		let now = new Date(); // 1. 현재 시스템(pc)의 날짜/시간 호출 
		let year = now.getFullYear(); 	console.log('year : ' + year )		// 현재 연도 
		let month = now.getMonth()+1;	console.log('month : ' + month )	// 현재 월 0~11 [ 0:1월 / 1:2월 / 5:6월 / 11:12월 ]
		let week = now.getDay();		console.log('week : ' + week )		// 현재 요일 [ 0:일 1:월 ~~ 4:목요일 6:토요일 ]
		let day = now.getDate();		console.log('day : ' + day)			// 현재 일 
		let hour = now.getHours();	 	console.log('hour : ' + hour )		// 현재 시 
		let minute = now.getMinutes(); 	console.log('minute : ' + minute )	// 현재 분 
		let second = now.getSeconds(); 	console.log('second : ' + second )	// 현재 초
	
	// 2. 게시물1개당 = 객체1개 선언/만들기  = 각 input로 입력받은 값들을 각 속성명별로 대입해서 객체 생성 
	let board = { 
					writer : writerValue ,
				 	password : passwordValue ,
				  	title : titleValue ,
				   	content : contentValue  ,
				   	date :`${ now.getFullYear() }년 ${ now.getMonth()+1 }월 ${ now.getDate() }일 
				   			${ now.getHours() }:${ now.getMinutes() }:${ now.getSeconds()}
				   			` ,
				   	view : 0 
   				}
	console.log( board ) ;	// board 생성 확인 
	// --------- 등록전에 유효성검사 --------------------//
		//생략
	// ---------------------------------------------//
	
	// 3. 현재 { } 안에서 선언된 board 는 } 끝나면 사라짐[지역변수] --> 전역변수/배열에 저장하자.
	boardlist.push( board );	console.log( boardlist ) ;	// 배열  확인 
	
	// * 새로운 게시물이 등록 되었으니까 게시물 출력 화면 업데이트
	onPrint()

} // F END 

// 2. 출력 함수 [ 실행조건 : 1.JS열렸을때 2.등록했을때 3.삭제했을때 4.수정했을때 5.조회수증가했을때]
function onPrint(){ console.log('onPrint()함수');
	// 1. 어디에 출력할껀지 ????  테이블 
	let boardTable = document.querySelector('#boardTable')
	// 2. 테이블 무엇을 대입/출력 할껀지 ??? 객체에 정보들을 객체 1개당 한줄씩<tr> 출력
	let html = `<tr> <th> 번호 </th> <th>제목</th> <th>작성일 </th> <th>조회수</th> </tr>`
		// 배열내 순차적으로 하나씩 열어보자 
		for( let i = 0 ; i<boardlist.length ; i++ ){
			
			let board = boardlist[i];	// i번째 배열 인덱스의 객체 호출 
			// 로그인=비교=if		// HTML출력 => HTML 구성 
			html += `<tr>
						<td> ${ i+1 } </td> 
						<td onclick="onView( ${ i } )"> ${ board.title } </td> 
						<td> ${ board.date } </td> 
						<td> ${ board.view } </td>
					</tr>`
		} // for end 
	// 3. 대입 
	boardTable.innerHTML = html 
} // f end 

// 3. 
function onView( index ){ console.log('onView() 함수' + index); 
	// 1. 어디에 ~~~
	let viewbox = document.querySelector('#viewbox')
	// 2. 무엇을 ~~~ 
	let board = boardlist[index] // 인수로 전달받은 인덱스의 객체를 1개 꺼내기 
	
	let html = `<div> 제목 : ${ board.title } </div>
				<div> 내용 : ${ board.content } </div>
				<div> 작성자 : ${ board.writer } </div>
				<button onclick="onDelete( ${ index } )">삭제</button>
				<button>수정</button>`
	// 3. 대입
	viewbox.innerHTML = html 
	// 조회수 증가(JS변경) 하고 화면 새로고침(HTML변경)  
	board.view++; onPrint();
	
} // f end 

// 4. 삭제함수 
function onDelete( index ){ console.log('onDelete()함수' + index )
	
	// 1. 배열내 삭제할 인덱스의 해당하는 객체 호출 
	let board = boardlist[index];
	
	// 2. prompt() 함수로 입력받은 값을 password 변수 에 저장 
	let passowrd = prompt('비밀번호 : ')
	
	// 3. 비교 [ 삭제할 객체내 비밀번호와 입력받은 비밀번호와 일치하면 삭제 성공 ] 
	if( board.password == passowrd ){
		// 4. 배열내 해당 객체 삭제 
		boardlist.splice( index , 1 ); // 삭제할 인덱스번호부터 1개 삭제 
		// 5. 화면 새로고침 
		onPrint(); // 전체 게시물 출력 화면 새로고침 
		document.querySelector('#viewbox').innerHTML = `` // 현재 삭제된 개별 게시물 출력 화면 없애기 
		alert('[삭제성공] 게시물이 삭제 되었습니다.')
	}else{ // 일치하지 않으면 
		alert('[삭제실패] 비밀번호가 틀렸습니다. ')
	}
}

