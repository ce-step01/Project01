package park.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import park.model.util.DBUtil;

public class ParkDAO {
	
	// 공원 정보 삭제
	public static boolean deleteParkInfo(int num) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from seoul_main_park where num=?");
			pstmt.setInt(1, num);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
}
	
}