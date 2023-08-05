package 복습.part6;

import java.util.Arrays;
import java.util.Scanner;

public class part6_4 {

	static Scanner sc = new Scanner(System.in);
	static Member[] memberList = new Member[100];
	static int LoginIndex = -1;
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("회원배열(리스트)상태 : "+Arrays.toString(memberList));
			
			System.out.println("\n\n----------- 회원 시스템 -----------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택>");
			int ch = sc.nextInt();
			
			if( ch == 1 ) { part6_4.회원가입();}
			if( ch == 2 ) { part6_4.로그인();}
			if( ch == 3 ) { part6_4.아이디찾기();}
			if( ch == 4 ) { part6_4.비밀번호찾기();  회원가입();}

		}
	}
	static void 회원가입() {
		System.out.println("-------------- 회원가입 --------------");
		System.out.println(" 아이디 : ");			String id = sc.next();
		System.out.println(" 비밀번호 : ");		String pw = sc.next();
		System.out.println(" 이름 : ");			String name = sc.next();
		System.out.println(" 전화번호 : ");		String phone = sc.next();
		System.out.println(" 나이 : ");			int age = sc.nextInt();
		
		Member m = new Member(id, pw, name, phone, age);
		
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i] == null ) {memberList[i] = m; System.out.println("안내) 회원가입 성공");break;}
			
		}
	}
	static void 로그인() {
		System.out.println(" --------------- 로그인 ---------------");
		System.out.println(" 아이디 : ");			String id = sc.next();
		System.out.println(" 비밀번호 : ");		String pw = sc.next();
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i] != null &&
					memberList[i].id.equals(id) &&
						memberList[i].pw.equals(pw)) {
				LoginIndex = i;
				break;
			}
		}
		if(LoginIndex >= 0) {System.out.println("안내) 로그인 성공");}
		else {System.out.println("안내) 로그인 실패 : 아이디 혹은 비밀번호가 일치하지 않습니다. ");}
		
	}
	static void 아이디찾기() {
		System.out.println("----------------- 아이디 찾기 ----------------- ");
		System.out.println(" 이름 : ");			String name = sc.next();
		System.out.println(" 전화번호 : ");		String phone = sc.next();
		
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i] != null && memberList[i].name.equals(name)&& memberList[i].phone.equals(phone));{
				System.out.println("안내) 회원님의 아이디 : "+memberList[i].id);
				return;
			}
		}
		System.out.println("안내) 이름 혹은 전화번호가 일치하는 아이디가 없습니다. ");
		
	}
	static void 비밀번호찾기() {
		System.out.println("----------------- 비밀번호 찾기 ----------------- ");
		System.out.println(" 아이디 : ");			String id = sc.next();
		System.out.println(" 전화번호 : ");		String phone = sc.next();
		
		for(int i=0; i<memberList.length; i++) {
			if(memberList[i] != null && memberList[i].id.equals(id)&& memberList[i].phone.equals(phone));{
				System.out.println("안내) 회원님의 아이디 : "+memberList[i].id);
				return;
			}
		}
		System.out.println("안내) 아이디 혹은 전화번호가 일치하는 아이디가 없습니다. ");
		
	}
}
