package 과제.과제9;

//목적 : 설계도,객체의모델링 표본
public class Member {
	//1.필드 : 객체의 데이터를 저장하는 곳
	String id;	//초기값/처음에 대입이 없을때 기본값[정수0실수0.0불 false 참조 null]
	String password;
	String name;
	String phone;
	int age;
	//2.생성자
		public Member( String id, String password , String name, String phone, int age) {
			this.id=id;
			this.password=password;
			this.name=name;
			this.phone=phone;
			this.age=age;
		};	//1. 매개변수 5개 정의한 생성자
			
		/*
		public Member( String id, String password , String name, String phone) {}			//1. 매개변수 4개 정의한 생성자
		public Member( String id, String password , String name) {}							//1. 매개변수 3개 정의한 생성자
		public Member( String id, String password ) {}										//1. 매개변수 2개 정의한 생성자
		public Member( String id) {}														//1. 매개변수 1개 정의한 생성자
		*/
	//3.메소드

}
