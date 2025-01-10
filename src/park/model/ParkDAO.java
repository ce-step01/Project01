package park.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import park.model.util.DBUtil;

public class ParkDAO {
	
	// 수정
	// location으로 주요식물 수정하기
	public static boolean updateParkinfo(String principalSpecies, String location) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update Seoul_Main_Park set principalSpecies=? where location=?");
			pstmt.setString(1, principalSpecies);
			pstmt.setString(2, location);

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
