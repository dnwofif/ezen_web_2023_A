package 복습.part1;

import java.util.Scanner;

public class part1 {//class s
	public static void main(String[] args) {//main s
		
		Scanner scanner = new Scanner(System.in);
		
		int 콜라재고=10;		int 환타재고=3;		int 사이다재고=2;
		int 콜라바구니=0;		int 환타바구니=0;		int 사이다바구니=0;
		int 콜라가격=300;		int 환타가격=200;		int 사이다가격=100;
		
		while(true) {//while s
			System.out.println("------------------메뉴------------------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.println(">>>>>> 선택 : ");		int ch=scanner.nextInt();
			
			if(ch==1) {
				if(콜라재고>0) {	콜라바구니++;	콜라재고--;	System.out.println("안내)콜라 담았습니다.");}
				else {	System.out.println("안내)콜라 재고가 없습니다. [관리자문의]");}
			}
			else if(ch==2) {
				if(환타재고>0) {	환타바구니++;	환타재고--;	System.out.println("안내)환타 담았습니다.");}
				else {	System.out.println("안내)환타 재고가 없습니다. [관리자문의]");}
			}
			else if(ch==3) {
				if(사이다재고>0) {	사이다바구니++;	사이다재고--;	System.out.println("안내)사이다 담았습니다.");}
				else {	System.out.println("안내)사이다 재고가 없습니다. [관리자문의]");}
			}
			else if(ch==4) {
				
			}
			
		
		}//while e
	}//main e
}//class e
 