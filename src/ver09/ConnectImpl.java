package ver09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class ConnectImpl implements Connect{
	
	public Statement stmt;
	public PreparedStatement psmt;
	public Connection con;
	public ResultSet rs;
	
	public ConnectImpl() {
	}
	
	public ConnectImpl(String id, String pass) {
		try {
			Class.forName(ORACLE_DRIVER);
			connect(id, pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	@Override
	public void connect(String id, String pass) {
		try {
			con = DriveManager.getConnection(ORACLE_URL, id, pass);
			System.out.println("DB연결 성공");
		}
		catch(SQLException e) {
			System.out.println("계정정보 올바르게 입력해주세요");
			System.exit(0);
		}
	}
	@Override
	public void dataInput() {}
	@Override
	public void dataSearch() {}
	@Override
	public void dataDelete() {}
	@Override
	public void dataAllShow() {}
	
	@Override
	public void close() {
		try {
			if(con != null) con.close();
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			System.out.println("자원반납 완료");
		}
		catch(Exception e) {
			System.out.println("자원반납시 오류발생");
		}
	}
	
}
