import java.util.ArrayList;

import model.dao.Dao;

public class AccountbookDao extends Dao {
	
	private static AccountbookDao accountbookDao = new AccountbookDao();
	private AccountbookDao() {};
	public static AccountbookDao getInstance() {return accountbookDao;}
	
	//1. 저장
	public boolean vwrite(AccountbookDto accountbookDto) {
		try {
			String sql="insert into accountbook( vcontent, vamount, vdate ) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, accountbookDto.getVcontent());
			ps.setString(2, accountbookDto.getVamount());
			ps.setString(3, accountbookDto.getVdate());
			ps.executeUpdate();
			
			return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	//2. 호출
	public ArrayList<AccountbookDto> vread(){
		return null;
	}
	//3. 수정
	//4. 삭제
}
