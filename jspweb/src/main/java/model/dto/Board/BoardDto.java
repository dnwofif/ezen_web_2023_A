package model.dto.Board;

public class BoardDto {
	
	//필드
	private int	bno;
    private String btitle;
    private String	bcontent;
    private String bfile;
    private String bdate;
    private int bview;
    private int mno;
    private int bcno;
    // - 게시물에 추가적으로 표시할 필드들
    private String mid;			//작성자 회원아이디
    private String bname;		//카테고리명
    private String mimg;		//작성자 프로필
    // - 조회대상자와 게시물 작성자대상자 일치여부 [ 본인글 체크여부 ]
    private boolean ishost;
    
	//생성자	[1. 빈생성자 2. 풀생성자 3.(추후에)작업하면서 필요한 생성자들]
    public BoardDto() {}
	public BoardDto(int bno, String btitle, String bcontent, String bfile, String bdate, int bview, int mno, int bcno,
			String mid, String bname) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.bdate = bdate;
		this.bview = bview;
		this.mno = mno;
		this.bcno = bcno;
		this.mid = mid;
		this.bname = bname;
	}
	// * 글 등록시 사용되는 생성자
	public BoardDto(String btitle, String bcontent, String bfile, int mno, int bcno) {
		super();
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.mno = mno;
		this.bcno = bcno;
	}
	// 전체 글 조회시 사용되는 생성자
	public BoardDto(int bno, String btitle, String bcontent, String bfile, String bdate, int bview, int mno, int bcno,
			String mid, String bname, String mimg) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.bdate = bdate;
		this.bview = bview;
		this.mno = mno;
		this.bcno = bcno;
		this.mid = mid;
		this.bname = bname;
		this.mimg = mimg;
	}
	// 글 수정시 사용되는 생성자
	public BoardDto(int bno, String btitle, String bcontent, String bfile, int bcno) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bfile = bfile;
		this.bcno = bcno;
	}
	
    //메소드
	
	public boolean isIshost() {
		return ishost;
	}
	
	public void setIshost(boolean ishost) {
		this.ishost = ishost;
	}
	
	public int getBno() {
		return bno;
	}
	
	public String getMimg() {
		return mimg;
	}
	public void setMimg(String mimg) {
		this.mimg = mimg;
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
	public String getBfile() {
		return bfile;
	}
	public void setBfile(String bfile) {
		this.bfile = bfile;
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
	public int getBcno() {
		return bcno;
	}
	public void setBcno(int bcno) {
		this.bcno = bcno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bfile=" + bfile
				+ ", bdate=" + bdate + ", bview=" + bview + ", mno=" + mno + ", bcno=" + bcno + ", mid=" + mid
				+ ", bname=" + bname + "]";
	}
    
	
    
}
