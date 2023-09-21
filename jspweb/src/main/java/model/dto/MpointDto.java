package model.dto;

public class MpointDto {
	private String mwno;		// 포인트내역 식별번호
	private int mno;			// 지급대상
	private long  mpamount;
	private String mpcomment;	// 지급 내역
	private String mpdate;		// 지급 날짜
	
	public MpointDto() {}

	public MpointDto(String mwno, int mno, long mpamount, String mpcomment, String mpdate) {
		super();
		this.mwno = mwno;
		this.mno = mno;
		this.mpamount = mpamount;
		this.mpcomment = mpcomment;
		this.mpdate = mpdate;
	}

	public String getMwno() {
		return mwno;
	}

	public void setMwno(String mwno) {
		this.mwno = mwno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public long getMpamount() {
		return mpamount;
	}

	public void setMpamount(long mpamount) {
		this.mpamount = mpamount;
	}

	public String getMpcomment() {
		return mpcomment;
	}

	public void setMpcomment(String mpcomment) {
		this.mpcomment = mpcomment;
	}

	public String getMpdate() {
		return mpdate;
	}

	public void setMpdate(String mpdate) {
		this.mpdate = mpdate;
	}

	@Override
	public String toString() {
		return "MpointDto [mwno=" + mwno + ", mno=" + mno + ", mpamount=" + mpamount + ", mpcomment=" + mpcomment
				+ ", mpdate=" + mpdate + "]";
	}
	
	
	
}
