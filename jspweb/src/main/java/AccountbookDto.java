import java.util.Objects;

public class AccountbookDto {
	//1. 필드
	private int vno;
	private String vcontent;
	private String vamount;
	private String vdate;
	
	//2. 생성자
	public AccountbookDto() {}//빈생성자
	//풀생성자
	public AccountbookDto(int vno, String vcontent, String vamount, String vdate) {
		super();
		this.vno = vno;
		this.vcontent = vcontent;
		this.vamount = vamount;
		this.vdate = vdate;
	}
	
	public AccountbookDto(String vcontent, String vamount) {
		super();
		this.vcontent = vcontent;
		this.vamount = vamount;
	}
	// *저장*할때 사용되는 생성자 [매개변수3개]
	public AccountbookDto(String vcontent, String vamount, String vdate) {
		super();
		this.vcontent = vcontent;
		this.vamount = vamount;
		this.vdate = vdate;
	}
	
	
	//3. 메소드
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVcontent() {
		return vcontent;
	}
	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}
	public String getVamount() {
		return vamount;
	}
	public void setVamount(String vamount) {
		this.vamount = vamount;
	}
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "AccountbookDto [vno=" + vno + ", vcontent=" + vcontent + ", vamount=" + vamount + ", vdate=" + vdate
				+ "]";
	}
	
	
	
}
