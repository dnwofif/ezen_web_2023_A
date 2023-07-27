package java1.day11.Ex4디자인패턴1;

public class 고객 {

}

/*
	소프트웨어 디자인 패턴
	- 클래스 역할에 따른 분업 하기 위한 구분[협업]
	
	1.MVC
		M : model		[JAVA, DB등]
		C : controller	[JAVA]
		V : view		[HTML,JS,CSS]
	
	고객[VIEW]	------> 서빙/요리사[Controller] -------> 냉장고[Dao]
	-요구/응답 받는 입장		- 요구에따른 응답해주는 입장		- 원본의 데이터가 저장되는 곳 또는 접근하는 곳
	-입/출력 되는 구역		- 가공,유효성검사,전달,로직구역		- 실질적인 데이터 관리
	-HtML/JS			- JAVA						- JAVA, DB
	
	*DTO : Data Transfer Object : 데이터 이동 객체
	*DAO : Data Access Object : 데이터에 접근하는 객체




*/