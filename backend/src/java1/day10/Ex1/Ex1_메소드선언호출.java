package java1.day10.Ex1;

import java.util.Scanner;

//p.233~234
public class Ex1_메소드선언호출 {//class s
	//실행목적
	public static void main(String[] args) {//main s
		//powerOn();
		
		//1. 메소드 호출 하기 위한 객체 생성
		Calculator myCalc = new Calculator();
		
		//2. 객체 통한 메소드 호출 / 매개변수 전달 X
		myCalc.powerOff();
		
		//3. 객체 통한 메소드 호출 / 매개변수 전달 = 2개
		myCalc.plus( 5 , 6 );
		
		//4. 객체 통한 메소드 호출 / 매개변수 전달 = 2개'변수(값,주소)' / 리턴O
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		myCalc.powerOff();

		
	}//main e
}//class e
