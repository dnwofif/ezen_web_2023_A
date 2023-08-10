package 과제.과제11.model.dao;

import 과제.과제11.view.LoginPage;

public class BoardDao extends Dao {
	
	// 0.싱글톤 
	private static BoardDao boardDao = new BoardDao();
	public static BoardDao getInstance() { return boardDao; }
	private BoardDao() {}
	
	// 9. boardWrite : 게시물쓰기 페이지 
	public void boardWrite() {
		try {
			//1. SQL 작성한다.
			String sql = "insert into board(btitle,bcontent,mno) values(?,?,?)";
			//2. 작성한 SQL 조작할 인터페이스 PS 객체 반환한다,
			ps = conn.prepareStatement(sql);
			//3. SQL에 매개변수 대입(조작)
			ps.setString(1, boardDao.getBtitle());
			ps.setString(2, );
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	// 10. boardPrint : 모든 게시물 출력 
	public void boardPrint() {}
	// 11. boardView : 개별 게시물 출력 
	public void boardView() {}
	// 12. boardUpdate : 게시물 수정 
	public void boardUpdate() {}
	// 13. boardDelete : 게시물 삭제
	public void boardDelete() {}

	
}