package controller;

import java.sql.SQLException;

import park.model.ParkDAO;
import park.view.EndView;

public class Controller {

	// 모든 공원 정보 검색
	public static void getparkInfo() {
		try {
			EndView.allParkView(ParkDAO.getAllparkInfo());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 공원 정보 검색 오류");
		}
	}

	// 특정 공원 정보 검색
	public static void getparkInfo(String keyword) {
		try {
			EndView.allParkView(ParkDAO.getparkInfo(keyword));
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("공원 정보 검색 오류");
		}
	}

	// 새로운 공원 정보 저장
	public static boolean addPark(int num, String parkName, String openingDate, String principalSpecies,
			String directions, String location, String officeNumber, String keyFacilities) {
		boolean result = false;

		try {
			result = ParkDAO.addParkInfo(num, parkName, openingDate, principalSpecies, directions, location, officeNumber, keyFacilities);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 프로젝트 저장시 에러 발생");
		}
		return result;
	}
	

	public static boolean updatePark(String location, String principalSpecies) {
		boolean result = false;
		try {
			result = ParkDAO.updateParkinfo(location, principalSpecies);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("공원 위치로 공원 특정 식물 변경");

      
	public static boolean deletePark(String parkName) {
		boolean result = false;
		try {
			result = ParkDAO.deleteParkInfo(parkName);
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("공원 정보 삭제 오류");

		}
		return result;
	}

}