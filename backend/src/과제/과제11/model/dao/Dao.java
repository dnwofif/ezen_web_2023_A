package 과제.과제11.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {//각종 Dao 클래스를 대표하는 부모클래스
	
	//1. 필드
	public Connection conn;			//DB연동 객체
	public PreparedStatement ps;	//연동된 DB SQL조작하는 객체
	public ResultSet rs;			// SQL 조작 결과를 가져오는 객체
	
	//2. 생성자 : 객체 생성시 초기화 담당
		// 기본생성자에 DB연동 코드 작성 *DAO객체생성시 바로 DB연동
	public Dao() {
		try { // * JDBC 드라이버 클래스들의 예외처리]
		
			Class.forName("com.mysql.cj.jdbc.Driver");			// mysql 기준 
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb4web","root","1234");
			System.out.println("안내) 연동성공 " + conn );
		}
		
		catch( Exception e ) {	// Exception클래스 : 모든 예외 정보를 담아주는 객체
			System.out.println("안내) 연동실패 사유: "+e); // 객체 출력하면 왜 예외가 발생했는지 사유 출력됨.
			}
		}	
	
}
