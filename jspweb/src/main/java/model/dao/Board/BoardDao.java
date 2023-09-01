package model.dao.Board;

import model.dao.Dao;
import model.dao.MemberDao;

public class BoardDao extends Dao {
	
	//0. 싱글톤
	private static BoardDao boardDao = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() { return boardDao; }
	
	//1. 글쓰기
	
	//2. 모든 글 출력
	
	//3. 개별 글 출력
	
	//4. 게시물 수정
	
	//5. 게시물 삭제
	
	//6. 게시물
	
	
}
