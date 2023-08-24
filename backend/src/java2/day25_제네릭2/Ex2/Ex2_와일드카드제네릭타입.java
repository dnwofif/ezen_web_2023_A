package java2.day25_제네릭2.Ex2;

public class Ex2_와일드카드제네릭타입 {
	public static void main(String[] args) {
		
		//1. 모든 사람이 신청 가능
			//1. 사람 객체
		Person person = new Person();
			//2. 지원자 객체
		Applicant<Person> applicant = new Applicant<>(Person);
		Applicant<Worker> applicant = new Applicant<Worker>();
			//3. 모든 객체가 지원 가능한 코스 등록 함수
		Course.registerCourse1(applicant);
		
			// -------
		Course.registerCourse1( new Applicant<Person>(new Person()));
		
	}
}
