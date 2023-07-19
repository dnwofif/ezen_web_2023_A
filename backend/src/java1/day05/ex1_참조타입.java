package java1.day05;

public class ex1_참조타입 {
	public static void main(String[] args) {
		
		//[p.148]
		int[] arr1;	// int형으로 타입으로 배열변수 선언 [스택영역에 메모리 할당]
		int[] arr2;	// int형으로 타입으로 배열변수 선언
		int[] arr3;	// int형으로 타입으로 배열변수 선언
		
		arr1 = new int[] {1,2,3}; 	
		// 배열 {1,2,3}을 생성[힙영역에 메모리할당]하고 [할당된주소를] 스택영역변수에 대입
		arr2 = new int[] {1,2,3};
		arr3 = arr2;	//arr2 스택변수가 가지고있던 arr3 스택변수에 대입
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		//[p.151] 객체주소를 참조하고 있지않는 상태 = null *객체(필드,메소드) 사용할수 없는 상태 
		int[] intArray = null;
		//int[] intArray 스택영역에 변수가 메모리 할당, 참조중인 객체번지X // 힙영역 X
		//intArray[0]=10;	//배열내 0번째 인덳에 10대입??? 오류 //배열은 힙영역해서 생성되는데 아직 배열이 생성X
		
		String str = null;
		System.out.println(str.length());
		
		//[p.153]
		String hobby = "여행";
			//1. 스택영역에 hobby 지역변수 선언
			//2. 힙영역에 "여행" 문자열객체 생성
			//3. 생성된 힙영역에 "여행"객체의 주소/번지를 스택영역에 hobby 지역변수에게 대입
		hobby = null;
			//4. 스택영역에 hobby 지역변수에 null 대입 [대입: 새로운 값으로 대체]
			//5. 아무도 힙영역에 있는 "여행"문자열 객체를 참조하지 않으면 GC쓰레기수집기 자동으로 객체 삭제
		
		String kind1 = "자동차";	// 스택영역 : kind1				힙영역 : "자동차"객체
		String kind2 = kind1;	// 스택영역 : kind2
		
		kind1 = null;			// 스택영역 : kind1[null]
								// 스택영역 : kind2[32번지] 		//하나라도 참조중이라면 객체는 삭제가 안된다.
	}
}

/*

	자바 데이터 타입 : 변수 선언할때 사용되는 타입
		- 기본타입 : boolean byte short char int long float double
			- 변수에 값 자체 저장
			- 8가지 존재 / 소문자 시작
			int age = 25;
		- 참조타입 : 배열, 열거, 클래스[String, Scanner, Random, System 등], 인터페이스
			- 변수에 힙메모리 생성된 메모리를 주소/번지 참조
			- 첫글자가 대문자로 시작
			String name = "신용권"
	
	JVM 메모리
	스택영역								힙영역
	- 스레드마다 별도구역						- 객체가 생성되는 영역
	- 함수(프레임)마다 별도구역						- 스택/메소드 영역에 참조 할 수 있다.
		- 지역변수								- 객체,배열,인터페이스 메모리 생성 
		- 함수 호출시 프레임 생성					- new 연산자 : 타입/클래스 기반으로 메모리생성후 주소/번지
		- 함수(프레임)종료되면 제거
	-----------------------------------------------------------------------
	
	int age = 25;
	String name = "신용권"				"신용권" : String 클래스 기반으로 만들어진 객체(속성/상태, 메소드/행동)
										100번지
	-----------------------------------------------------------------------
										힙영역
	유재석								103동 101호 [아파트 클래스로 객체/집 생성]
										안산시 상록구 65번지 OO아파트 103동 101호
										
	스택변수에 저장된 기본타입값 또는 (객체)참조 주소 비교
	==
	!=
*/
