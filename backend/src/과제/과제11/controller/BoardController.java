package 과제.과제11.controller;

import 과제.과제11.model.dao.BoardDao;
import 과제.과제11.view.LoginPage;

public class BoardController {
	// 0.싱글톤 
	private static BoardController boardController = new BoardController();
	public static BoardController getInstance() { return boardController; }
	private BoardController() {}
	
	// 9. boardWrite : 게시물쓰기 페이지 
	public void boardWrite() {
		
	}
	// 10. boardPrint : 모든 게시물 출력 
	public void boardPrint() {
		
	}
	// 11. boardView : 개별 게시물 출력 
	public void boardView(int bno) {
		return BoardDao.getInstance().boardView(bno);
	}
	// 12. boardUpdate : 게시물 수정 
	public void boardUpdate() {}
	// 13. boardDelete : 게시물 삭제
	public void boardDelete() {}

}
/*
  	테이블
  		레코드/행/가로 -> DTO 1개
  		레코드/행/가로 -> DTO 1개	여러개 DTO 하나의 객체로 담기 => 리스트 혹은 배열
  		레코드/행/가로 -> DTO 1개
  		
 */
