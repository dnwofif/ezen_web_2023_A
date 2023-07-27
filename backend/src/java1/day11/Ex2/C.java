package java1.day11.Ex2;

public class C {

	//1. 오류 A와 C클래스는 다른패키지이니까
	//A a = new A();
	
	//2. B와 C클래스는 다른 패키지 이지만 B클래스가 pubilc 이므로 가능
	B b = new B();

	public C() {} //c클래스 생성자
}
