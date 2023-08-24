package java2.day25_제네릭2.Ex2;

public class Course {

	//1. 모든 사람이면 등록 가능 [ 매개변수에 모든 타입 가능 ]
	public static registerCourse1( Applicant<?> applicant ) {
		System.out.println(applict.kind.getClass().getSimpleName());
	}
	
	//2. 학생만 등록 가능 [매개변수에 student 클래스와 자손 클래스의 객체 가능]
	public static void registerCourse2(Applicant < ? extends Student > applicant) {
		System.out.println(applict.kind.getClass().getSimpleName());
	}
	
}
