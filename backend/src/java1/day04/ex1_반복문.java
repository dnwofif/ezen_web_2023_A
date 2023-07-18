package java1.day04;

import java.util.Scanner;

public class ex1_반복문 { // class s
	
	public static void main(String[] args) {//main s
	//[p.124] 1부터 5까지 누적합계 (for 없이)
	int sum = 0;
	sum = sum+1;sum = sum+2;sum = sum+3;sum = sum+4;sum = sum+5;
	
	//1부터 10까지 누적합계 (for 이용)
	int sum2 = 0;
	for(int i=1; i<=5; i++) {sum2 += i;}
		//i는 1부터 5까지 1씩 증가 반복
	
	//[p.125] 1부터 5까지 출력
	//1. for 없이
	System.out.print(1);System.out.print(2);System.out.print(3);System.out.print(4);System.out.print(5);
	//2. for 이용
	for(int i=1; i<=5; i++) {System.out.print(i+" ");}
	
	//[p.126] 초기값 변수는 for에서 선언시 지역변수이다.
	int sum3 = 0;
	for(int 반복변수 = 1; 반복변수<=10; 반복변수++) {sum3 += 반복변수;}
	//System.out.println(반복변수); // x = for ()에서 선언된 변수는 for{} 밖에서 사용불가
	
	int sum4 = 0; int i;
	for(i=1; i<=100; i++) {sum4 += i;}
	System.out.println("1~"+(i-1)+"합 : "+sum4);
	
	//[p.127] 실수		// 소수점뒤에 f 사용이유 : (직접 작성한) 리터럴 소수점 = double 이기때문에
	for( float x = 0.1f; x<=1.0f; x+=0.1f) { System.out.print(x+" ");}
	System.out.println("\n--------------------");
	for( double x = 0.1; x<=1.0; x+=0.1) { System.out.print(x+" ");}
	
	//[p.128] 구구단
		// 1. 2단 구구단 for 없이
	System.out.print( 2*1 );System.out.print( 2*2 );System.out.print( 2*3 );
	System.out.print( 2*4 );System.out.print( 2*5 );System.out.print( 2*6 );
	System.out.print( 2*7 );System.out.print( 2*8 );System.out.print( 2*9 );
		// 2. 2단 구구단 for 이용
	for ( int 곱 = 1; 곱<=9; 곱++ ) { System.out.println(2*곱+"  "); }
		// 3. 2~9단 구구단 for 이용
			//1. 2단 ~ 9단 for
				for (int 단 = 2; 단<=9; 단++) { System.out.println(단); }
			//2. 1곱 ~ 9곱 for
				for (int 곱 = 1; 곱<=9; 곱++) { System.out.println(곱); }
			//3. 1,2 합치기 [단 마다 곱 실행 vs 곱 마다 단 실행]
				for (int 단=2; 단<=9; 단++) {//행 //단
					for (int 곱=1; 곱<=9; 곱++) {//열 //곱
						System.out.printf("%2d X %2d = %2d \n", 단, 곱, 단*곱);// 72회 출력
					}
				}
	
	//[p.129 vs 124 ] 1~10 출력
	
	//[124]
	// for(int i = 1; i<=10; i+=1){System.out.print(i+" ");}
				
	int a = 1;
	while(a<=10) {System.out.print(a+" "); a++;}
	
	//[p.130 vs 126] 1~100 누적합계
	
	//[126]
	//int sum3 = 0;
	//for(int 반복변수 = 1; 반복변수<=100; 반복변수++) {sum+=반복변수;}
	
	int sum5 = 0;
	int b = 1;
	while(b<=100) { sum5 += b; b++;}
	
	Scanner scanner = new Scanner(System.in);
	boolean run = true;// while 문 true/false 저장하는 변수, on/off 역할
	int speed = 0;//현재 속도 저장하는 변수
	
	//while(run) { System.out.println("무한루프");}
	while( run ) {//while s
		
		//-----------무한 출력
		System.out.println("-----------------------");
		System.out.println(" 1.증속 | 2. 감속 | 3. 중지 ");
		System.out.println("-----------------------");
		System.out.println("선택 : ");
		//-----------무한 입력
		String strNum = scanner.nextLine();
		///-----------입력에 따른 조건/제어
		if( strNum.equals("1")) {//만약에 입력이 1이면
			speed++;	//스피드 증가
		}else if(strNum.equals("2")) {//만약에 입력이 2이면
			speed--;	//스피드 감소
		}else if(strNum.equals("3")) {//만약에 입력이 3이면
			run = false;
		}
	}
	}//main e
}// class e
/*
	for문
		for(1.초기값; 2.조건식; 4.증감식;){
				3. 실행문;
		}
		
		1. 초기값이 실행된다.
		2. 조건식 판단해서 true 이면 { } 들어감, false { } 건너뜀/종료
		3. true 이면 실행문 실행
		4. 쵝값이 들어있는 변수에 증감식
		5. 조건식 판단해서 ~~~ 2,3,4,2,3,4 반복

	while 문
		1. 초기값
		while(2. 조건식) { 3. 실행문 4. *증감식 }
		
		- 초기값과 증감식은 필수 X
		1. 조건식 판단해서 true 이면 { } 들어감, false { } 건너뜀/종료
		2. true 이면 실행문 실행

	-- 일반적으로 패턴이 있는경우 for문 사용
	
*/