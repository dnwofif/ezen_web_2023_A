/*
// 문제1) 입력받은 수 만큼 * 출력
output = ``		value1 = 5
	i = 1

	for start 

	i			조건				실행문			누계		증감식 
	i=1			1<=5 T			`` += `*`		*		i++
	i=2			2<=5 T			* += *			**		i++
	i=3			3<=5 T			** += *			***		i++
	i=4			4<=5 T			*** += *		****	i++
	i=5			5<=5 t			**** += *		*****	i++
	i=6			6<=5 f			반복문 종료 
	 
// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]

// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
		줄수 = i		별 = s			줄마다 s 출력(별 조건식)
*		i=1			1				i가 1일때 s는 1부터 1까지
**		i=2			1 2				i가 1일때 s는 1부터 2까지	
***		i=3			1 2 3			i가 1일때 s는 1부터 3까지
****	i=4			1 2 3 4 		i가 1일때 s는 1부터 4까지
*****	i=5			1 2 3 4 5		i가 1일때 s는 1부터 5까지
		i는 1부터 입력받은 줄수까지 1씩증가		for(let i = 1 ; i<=line1; i++) {}
		s는 1부터 현재줄수(i)까지				for(let s = 1; s<=i; s++){}
		
// 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
		i = 현재줄수		s = 별			별 조건식 찾기
*****	i = 1			1 2 3 4 5		i가 1일때 별은 1부터 5까지
****	i = 2			1 2 3 4			i가 1일때 별은 1부터 4까지
***		i = 3			1 2 3			i가 1일때 별은 1부터 3까지
**		i = 4			1 2				i가 1일때 별은 1부터 2까지
*		i = 5			1				i가 1일때 별은 1부터 1까지
		i는 1부터 입력받은수까지 1씩증가 			for( let i = 1 ; i<=입력값[line2] ; i++ ){}
		s는 1부터 (입력값-현재줄수)+1 까지 1씩증가 	for( let s = 1 ; s<=입력받은수-현재줄수+1 ; i++ ) {}
		
// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
 		i= 현재줄수	공백=b[문제4]	별 = s[문제3]
    *	i = 1		1 2 3 4		1
   **	i = 2		1 2 3		1 2
  ***	i = 3		1 2 		1 2 3
 ****	i = 4		1			1 2 3 4
*****	i = 5					1 2 3 4 5
		i는 1부터 입력값까지 1씩 증가반복				for (let i = 1; i<=line3; i++){}
		b는 1부터(입력값-현재줄수)까지 1씩증가반복		for (let b = 1; b<=line3-i; b++){}
		s는 1부터 현재줄수 까지 1씩 증가반복			for (let s= 1; s<=i; s++){}
		
// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
		i= 현재줄수 	공백=b[문제3]		별 = s[문제4]
*****	i=1							1 2 3 4 5
 ****	i=2			1				1 2 3 4
  ***	i=3			1 2				1 2 3
   **	i=4			1 2 3			1 2
    *	i=5			1 2 3 4			1 
    	i는 1부터 입력값까지 1씩증가 반복 			for(let i 1; i<=line4; i++){}
    	b는 1부터 (현재줄수-1)까지 1씩증가 반복		for( let b = 1 ; b<=i-1 ; b++ ){}
    	s는 1부터 (입력값-현재줄수)+1까지 1씩증가	for( let s = 1 ; s<=line4-i+1 ; s++ ){}
    	
// 문제7) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
    *
   ***
  *****
 *******
*********
// 문제8) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
*********
 *******
  *****
   ***
    *
// 문제9) 입력받은 줄 수 만큼 * 출력  [ ex) 10 ]
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
// 문제10) 입력받은 줄 수 만큼 * 출력  [ ex) 7 ]
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
*/

let output = ``;	//  출력용 변수 [ 모든 문제 에서 사용 ]

// 문제1) 입력받은 수 만큼 * 출력 
let value1 = prompt( '문제1:')
for( let i = 1 ; i<=value1 ; i++  ){ // i는 1부터 입력받은 수까지 1씩증가반복 
	output += `*`
} // for end 
console.log( output )


// 문제2) 입력받은 수 만큼 * 출력 [  - 3줄(3배수)마다 줄바꿈 ]
output = ``; // 공백으로 초기화
let value2 = prompt( '문제2:')
for( let i = 1 ; i<=value2 ; i++ ){
	output += `*`
	// 만약에 i의 값이 3배수( 값%3==0 ) 이면 
	if( i % 3 == 0 ){ output += `\n` }	
	// \ : 제어문자(이스케이프문자)	\t : 들여쓰기 \n : 줄바꿈
} // for end 
console.log( output )


// 문제3) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``; // 공백으로 초기화
let line1 = prompt( '문제3:')
for(let i = 1 ; i<=line1; i++){
	//[별찍기]
	for(let s = 1; s<=i; s++){output += `*`}
	//[줄바꿈]i는 1부터 입력받은 줄수까지 1씩증가
	output +=`${i}번째 줄\n`;
}
console.log(output)


// 문제4) 입력받은 줄 수 만큼 * 출력 [ ex) 5 ]
output = ``; // 공백으로 초기화
let line2 = prompt( '문제4:')
for(let i = 1 ; i<=line2; i++){
	//[별찍기]
	for(let s = 1; s<=line2-i+1; s++){output +=`*`}
	//[줄바꿈]
	output +=`\n`;
}
console.log(output)


// 문제5) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``; // 공백으로 초기화
let line3 = prompt( '문제5:')
for(let i = 1; i<=line3; i++){
	//2. [공백 출력]
	for (let b = 1; b<=line3-i; b++){output +=``}	//스페이스바 한번 = 공백1개
	//3. [별 출력]
	for (let s= 1; s<=i; s++){output +=`*`}
	//1. [줄바꿈]
	output += `\n`;		// i마다 줄바꿈 -> 줄마다 줄바꿈
}


// 문제6) 입력받은 줄 수 만큼 * 출력  [ ex) 5 ]
output = ``; // 공백으로 초기화
let line4 = prompt( '문제6:')
for(let i=1; i<=line4; i++){
	//[공백출력]
	for( let b = 1 ; b<= i-1 ; b++ ){ output += ` `}
	// [별 출력 ]
	for( let s = 1 ; s<= line4-i+1 ; s++ ){ output += `*` }
	// [줄바꿈 출력]
	output += `\n`
}
console.log( output )
