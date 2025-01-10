package controller;

import java.sql.SQLException;
import park.model.ParkDAO;

public class Controller {

    // 공원 정보 삭제
    public static boolean deleteParkInfo(int num) {
        boolean result = false;

        try {
            // ParkDAO의 deleteParkInfo 메서드 호출
            result = ParkDAO.deleteParkInfo(num);
            if (result) {
                System.out.println("[SUCCESS] 공원 정보가 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("[INFO] 해당 번호에 대한 공원 정보가 존재하지 않습니다.");
            }
        } catch (SQLException e) {
            // SQLException 예외 발생 시 처리
            System.err.println("[ERROR] 공원 정보 삭제 중 오류가 발생했습니다.");
            e.printStackTrace(); // 디버깅용으로 예외 메시지 출력
        }
        return result;
    }
}