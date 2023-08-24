package model.dao;

import model.dto.MemberDto;

public class MemberDao extends Dao {
	
	//0.싱글톤
	private static MemberDao memberDao = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() {return memberDao;}
	
	//1. 회원가입
	public boolean signup(MemberDto dto) {
		try {
			String sql= "insert into member(mid, mpwd,memail,mimg) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getMid());
			ps.setString(2, dto.getMpwd());
			ps.setString(3, dto.getMemail());
			ps.setString(4, dto.getMimg());
			int row = ps.executeUpdate();
			if( row == 1) return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	//6. 아이디 중복검사
	public boolean findId(String mid) {
		try {
			String sql="select * from member where mid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,mid);
			rs=ps.executeQuery();
			if(rs.next())return true;
			
		}catch (Exception e) {System.out.println(e);}
		return false;
	}

}
