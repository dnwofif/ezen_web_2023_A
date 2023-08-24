import java.util.ArrayList;

import model.dao.Dao;
import model.dto.VisitDto;

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
		ArrayList<AccountbookDto> list = new ArrayList<>();
		try {
			String sql="select * from accountbook order by vdate desc";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				AccountbookDto accountbookDto = new AccountbookDto(
						rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				list.add(accountbookDto);
			}
			
		}catch (Exception e) {System.out.println(e);}
		
		return list;
	}
	//3. 수정
	public boolean vupdate(int vno, String vcontent) {
		try {
			String sql = "update accountbook set vcontent = ? where vno = ? ";
			ps = conn.prepareStatement(sql);
			ps.setInt( 2 , vno); ps.setString( 1 , vcontent ); 
			int row = ps.executeUpdate();
			if( row == 1 ) return true ;
			return false; 
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	//4. 삭제
	public boolean vdelete(int vno) {
		try {
			String sql = "delete from accountbook where vno = ? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vno);
			int row = ps.executeUpdate();
			if(row == 1) return true;
			return false;
		}catch (Exception e) {System.out.println(e);}
	
	return false;}
}
