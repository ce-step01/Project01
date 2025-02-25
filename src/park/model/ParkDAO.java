package park.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import park.model.dto.ParkDTO;
import park.model.util.DBUtil;

public class ParkDAO {

	// location으로 주요식물 수정하기
	public static boolean updateParkinfo(String principalSpecies, String location) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update seoul_main_park set principal_species=? where location=?");
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

	// 공원 정보 추가(insert)
	public static boolean addParkInfo(int num, String parkName, String openingDate, String principalSpecies,
			String directions, String location, String officeNumber, String keyFacilities) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into seoul_main_park values(?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, num);
			pstmt.setString(2, parkName);
			pstmt.setString(3, openingDate);
			pstmt.setString(4, principalSpecies);
			pstmt.setString(5, directions);
			pstmt.setString(6, location);
			pstmt.setString(7, officeNumber);
			pstmt.setString(8, keyFacilities);

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 검색어로 공원 정보 검색
	public static ArrayList<ParkDTO> getparkInfo(String keyword) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ParkDTO park = null;
		ArrayList<ParkDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from seoul_main_park where park_name like ?");// PreparedStatement 객체를 생성하여 SQL 쿼리를 준비하는 역할
			pstmt.setString(1, "%" + keyword + "%");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ParkDTO>();
			
			while (rset.next()) {
				park = ParkDTO.builder().num(rset.getInt(1)).parkName(rset.getString(2)).openingDate(rset.getString(3))
						.principalSpecies(rset.getString(4)).directions(rset.getString(5)).location(rset.getString(6))
						.officeNumber(rset.getString(7)).keyFacilities(rset.getString(8)).build();
				list.add(park);
			}

		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	// 모든 공원 정보 검색
	public static ArrayList<ParkDTO> getAllparkInfo() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ParkDTO park = null;
		ArrayList<ParkDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from seoul_main_park");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ParkDTO>();
			
			while (rset.next()) {
				park = ParkDTO.builder().num(rset.getInt(1)).parkName(rset.getString(2)).openingDate(rset.getString(3))
						.principalSpecies(rset.getString(4)).directions(rset.getString(5)).location(rset.getString(6))
						.officeNumber(rset.getString(7)).keyFacilities(rset.getString(8)).build();
				list.add(park);
				System.out.println(park);
			}
			
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	// 공원 정보 삭제
	public static boolean deleteParkInfo(String parkName) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from seoul_main_park where park_name=?");
			pstmt.setString(1, parkName);
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
