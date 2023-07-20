package java1.day06;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_확인문제9_p199 {//class s

	public static void main(String[] args) {//main s
		
		int count = 0; //모든 경우의수 if{ }에서 공유하기위해 if { }밖에서 선언
		int [] scores = new int[count];	//모든 경우의수 if { } 에서 공유하기 위해 if { } 밖에서 선언
		//[p.199] 확인문제 9
		
		//step2 : 반복[되풀이]할 출력문으로 하나로 만들기
		while(true) {//while s // 무한루프
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");	
		
			//step3 : 경우의수가 있을때 경우의수에 따른 시로 다른 실행/코드 *경우의수 5가지 중에 선택(입력)
			//입력
			//1. Scanner 객체 생성 [import]
			Scanner scanner = new Scanner(System.in);
			//2. 객체.nextLine(); : 입력받은 데이터를 문자열로 반환 함수 // //3. 변수 저장
			String ch = scanner.nextLine();
			
			//경우의수 판단 step5 : 기능구현
			if( ch.equals("1")) {//1. 입력한 값(ch)가 1일때
				System.out.println("학생수> ");
				
				//1.입력받은 데이터를 문자열로 가져와서 정수형으로 변환후 정수 변수에 저장/대입
				count = Integer.parseInt(scanner.nextLine());
					System.out.println("입력한 학생수 : "+ count);
				//2. 입력받은 수 만큼 배열 선언
					//1. = { } 저장할 값을 아는 경우
					//2. new 타입[길이] 저장할 값을 몰라서 길이만큼 기본값으로 생성
				scores = new int[count];
					System.out.println(Arrays.toString(scores));
			}
			if( ch.equals("2")) {//2. 입력한 값(ch)가 2일때
				System.out.println(count);		System.out.println(scores);	
				
				//1. 0부터 입력받은 수만큼 점수(정수) 입력받기
				//Integer.parseInt(scanner.nextLine());//문자열을 입력받아 점수로 변환 vs scanner.nextInt();
				for(int i=0; i<count; i++) {
					System.out.println(i+"인덱스의 저장할 학생점수 입력 : ");
					scores[i] = Integer.parseInt(scanner.nextLine());	//2. 입력받은 정수를 배열내 각 인덱스에 저장/변경
				}//for end
					System.out.println(Arrays.toString(scores));
			}
			if( ch.equals("3") ) {
				// 1. 2번기능에서 학생수만큼 점수를 입력받은 배열 출력  [ 배열내 모든 인덱스 출력 ] 0부터 마지막까지
				for( int i = 0 ; i<scores.length ; i++ ) {
					System.out.println( i + " 인덱스 의 저장된 학생점수 : " + scores[i] );
				} // for end
			}
			if( ch.equals("4")) {//4. 입력한 값(ch)가 4일때
				int sum = 0;	// 배열내 데이터를 모두 더한(누계) 값을 저장하는 변수
				int max = 0; 	// 배열내 데이터중에 가장 큰 값을 저장하는 변수
				
				//배열내 모든 데이터 호출 [0인덱스 마지막인덱스까지 호출]
				for(int i = 0; i<scores.length; i++) {
					//1. sum
					sum += scores[i];	//i번째 데이터를 sum 변수에 추가/누계;
					//2. max
					if(max < scores[i]) max= scores[i];	//만약에 i번째 데이터가 max보다 크면 max에 i번째 데이터 ㅓ저장
				}//for end
				System.out.println("최고점수 : "+max);
				System.out.println("평균 : "+((double)sum/count));
			}
			if( ch.equals("5")) {//5. 입력한 값(ch)가 5일때
				System.out.println("프로그램 종료");
			}
		
		}//while end
	}//main e
}//class e

/*
 설계조건 
 	- 학생수를 입력받아 입력받은 학생수 만큼 점수를 입력받아 저장
 	- 현재 점수 출력/ 통계
 	1. 학생수
 		1. 학생수를 입력받아 '학생수'' 변수에 저장한다.
 		2. 그 학생수만큼 배열 선언한다. [메모리 할당] : 타입[] 변수명 = new 타입[길이]
 	2. 점수입력
 		1. 몇개 점수 입력??? 정해져 있지 않는 상태 > 변수로만 처리 비효율적으로 > 배열 효율적
 		2. 1번 기능에서 할당된 배열만큼 점수를 입력받아 각 인덱스에 저장한다.
 			[만일 학생수를 입력받지 않고 점수입력을 하면 오류 발생!!]
 	3. 점수리스트
 		1. 2번 기능에서 저장된 배열내 모든 인덱스 데이터 호출 한다.
 	4. 분석
 		1. 2번기능에서 저장된 배열내 모든 인덱스 데이터를 모두 더한다 = sum/학생수(1번기능)
 		2. 2번기능에서 저장된 배열내 모든 인덱스 데이터를 호출해서 최고점수를 찾는다 = max
 	5. 종료
 		무한루프 종료해서 출력그만 !! break;
 
 //.nextLine() 사용시 주의할점
  * nextLine 사용시 다른 next~~() 앞뒤로 존재 했을때 하나로 인식 [오류처럼 보일수 있다.]
  	1. 해결방안
  		Integer.parseInt(scanner.nextLine());
  	2. 해결방안
  		String 문자 = scanner.nextLine();
  		int 정수 = scanner.nextInt()
  		
  		scanner.nextLine();
 
 //step1
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택> 1");
		System.out.println("학생수> 3");
		
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택> 2");
		System.out.println("scores[0]>85");
		System.out.println("scores[1]>95");
		System.out.println("scores[2]>93");

		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택> 3");
		System.out.println("scores[0]>85");
		System.out.println("scores[1]>95");
		System.out.println("scores[2]>93");
		
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택> 4");
		System.out.println("최고점수 : 95");
		System.out.println("평균점수 : 91.0");
		
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.println("선택> 5");
		System.out.println("프로그램 종료");
 
 
 */  
 
 
