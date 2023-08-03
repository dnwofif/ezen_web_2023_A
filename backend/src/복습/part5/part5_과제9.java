package 복습.part5;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;

public class part5_과제9 {
	public static void main(String[] args) {
		Member[] memberList = new Member[100];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(Arrays.toString(memberList));
			
			System.out.println("\n\n----- 회원 시스템 --------");
			System.out.println("1.회원가입 2. 로그인   선택> ");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("--------- 회원가입--------- ");
				System.out.println("아이디 : ");			String inputId = sc.next();
				System.out.println("비밀번호 : ");		String inputPw = sc.next();
				System.out.println("이름 : ");			String inputName = sc.next();
				System.out.println("전화번호 : ");		String inputPhone = sc.next();
				System.out.println("나이 : ");			int inputAge = sc.nextInt();
				
				Member member = new Member(inputId,inputPw,inputName,inputPhone,inputAge);
				
				for(int i=0; i<memberList.length; i++) {
					if(memberList[i] == null ) { memberList[i] = member; break;}
				}
			}
			else if(ch==2) {
				System.out.println("--------- 로그인--------- ");
				System.out.println("아이디 : ");			String inputId = sc.next();
				System.out.println("비밀번호 : ");		String inputPw = sc.next();
				
				int login = -1;
				for(int i=0; i<memberList.length; i++) {
					if(memberList[i] != null &&
							memberList[i].id.equals(inputId)&&
							memberList[i].pasword.equals(inputPw)) {
						login = i;
						break;
					}
				}
				if(login >= 0) {System.out.println("안내) 로그인성공");}
				else {System.out.println("안내)로그인 실패");}
					
				}
			}
			
		}// while e	
	}//main e
}//class e



