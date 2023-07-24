package java1.day08.Ex5;

import java.util.Scanner;

public class Ex5_객체배열 {//class e
	public static void main(String[] args) {//main s
		
		String[] memberList = new String[100];
		
		while(true) {
			System.out.println("1.회원가입 : ");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("아이디 : ");		String id = sc.next();
				System.out.println("비밀번호 : "); 	String pw = sc.next();
				System.out.println("이름 : "); 		String name = sc.next();
			
				//1. 객체선언 : 클래스명 객체변수명 = new 생성자명();
				Member m = new Member();	//1.객체생성
			m.id = id; m.pw=pw;	 m.name=name;			//2. 생성된 객체로부터 .접근연산자를 이용한 필드
			//2. 배열에 저장
			for(int i=0; i<memberList.length; i++) {
				if( memberList[i] == null) {
					memberList[i] = m;
					break;
				}
			}
			
			}//if end
		}//while end
		
	}//main e
}//class e
