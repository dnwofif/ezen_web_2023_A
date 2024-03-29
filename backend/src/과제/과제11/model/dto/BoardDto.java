package 과제.과제11.model.dto;



public class BoardDto {

	//1. 필드 : DB TABLE 필드명과 순서 일치화 + 추가 
	private int bno	;		
	private String btitle;		
	private String bcontent	;
	private String bdate;		
	private int bview;	
	private int mno ;	// 작성자가 회원번호 식별자
	//화면에는 작성자는 회원번호가 아닌 회원 다른 정보 출력
	private String mid;	//회원번호를 이용한 회원테이블에서 조회 가능 [ 테이블 합치기 JOIN ]
	
	//2. 생성자 [ 1.빈생성자 2.풀생성자 ]
	public BoardDto() {}
	// 글 등록시 사용되는 생성자
	public BoardDto(int bno, String btitle, String bcontent, String bdate, int bview, int mno, String mid) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bview = bview;
		this.mno = mno;
		this.mid = mid;
	}
	
	


	public BoardDto(String btitle, String bcontent, int mno) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.mno = mno;
	}
	//글수정시 사용되는 생성자
	public BoardDto(int bno, String btitle, String bcontent) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
	}
	
	
	
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBview() {
		return bview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bdate=" + bdate
				+ ", bview=" + bview + ", mno=" + mno + ", mid=" + mid + "]";
	}
	
	
}
