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
		1. 모든 함수에 접근 가능한 배열을 총6개를 선언한다
		(작성자,비밀번호,제목,내용,작성일,조회수)
		2. 함수는 총2개를 선언한다.
		(등록,삭제)
		3. 글쓰기페이지에 내용을 추가하고 등록버튼을 누르면 
		글목록페이지에 '제목, 작성자, 작성일'이 추가된다.
			1. 번호는 순서대로 추가된다.(인덱스사용)
			2. 조회수는 클릭한 횟수만큼 표기된다.
		4. 글쓰기페이지 '삭제'버튼을 누르면
			1. 비밀번호 배열에 저장된 값과 입력된 값을 비교하여 맞다면 글삭제,
			틀리면 비밀번호 오류 문구 뜨게 만들기
			(if문 사용하기)
 */		
let 작성자 = [ ];
let 비밀번호 = [ ];
let 제목 = [ ];
let 내용 = [ ];
let 작성일 = [ ];
let 조회수 = [ ];

function 등록(){
	let 
	
}

function 삭제(){
	
}