package model.dao;

import java.util.ArrayList;

import model.dao.Dao;
import model.dto.HrmDto;

public class HrmDao extends Dao {
	private static HrmDao hrmDao = new HrmDao();
	private HrmDao() {}
	public static HrmDao getInstance() { return hrmDao; }
	
	//직원 등록
	public boolean signup(HrmDto dto) {
		try {
			String sql="insert into hrm( himg , hname , hphone , hrank , hdate ) values( ? , ? , ? , ? ,?)";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , dto.getHimg() );		 System.out.println(dto.getHimg());
			ps.setString( 2 , dto.getHname() );		 System.out.println(dto.getHname());
			ps.setString( 3 , dto.getHphone() );	 System.out.println(dto.getHphone());
			ps.setString( 4 , dto.getHrank() );		 System.out.println(dto.getHrank());
			ps.setString( 5 , dto.getHdate() ); 	 System.out.println(dto.getHdate());
			int row = ps.executeUpdate();
			if( row == 1 )return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	// 전화번호 중복검사
	public boolean findPhone(String hphone) {
		try {
			String sql = "select * from member where "+hphone+" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , hphone );
			rs = ps.executeQuery();
			// [ while : 결과 레코드 여러개 검사 vs if : 결과 레코드 한개 검사 ]
			if( rs.next() ) return true;
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	//출력함수
	public ArrayList<HrmDto> hread(){
		ArrayList<HrmDto> list = new ArrayList<>();
		try {
			String sql="select * from hrm";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
			
				HrmDto hrmDto = new HrmDto(rs.getInt( 1 ), rs.getString( 2 ), rs.getString( 3 ), rs.getString( 4 ), rs.getString( 5 ) , rs.getString( 6 ) );
				list.add(hrmDto);
				//rs.getInt( 1 ), rs.getString( 2 ), rs.getString( 3 ), rs.getString( 4 ), rs.getString( 5 ) , rs.getString( 6 ) 
			}
		}catch (Exception e) {System.out.println(e);}
		return list;
	}
}
