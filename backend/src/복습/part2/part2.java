package 복습.part2;

import java.util.Arrays;

public class part2 {
	public static void main(String[] args) {
		Scanner scnner= new Scanner(System.in);
		String 재고관리 = "";
		재고관리 = "10,0,300\n10,0,200\n10,0,100\n";
		System.out.println(재고관리);
		
		System.out.println(Arrays.toString(재고관리.split("\n")));
		System.out.println("1조각 : "+재고관리.split("\n")[0]);
		System.out.println("1조각 : "+재고관리.split("\n")[1]);
		System.out.println("1조각 : "+재고관리.split("\n")[2]);
		
		String 콜라정보 = 재고관리.split("\n")[0];
		String 환타정보 = 재고관리.split("\n")[1];
		String 사이다정보 = 재고관리.split("\n")[2];
		
		int 콜라재고 = lnteger.parselnt(콜라정보.split(",")[0]);
	
		
	}
}
