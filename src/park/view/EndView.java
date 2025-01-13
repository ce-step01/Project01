package park.view;

import java.util.ArrayList;

import park.model.dto.ParkDTO;

public class EndView {

	public static void parkView(Object object) {
		System.out.println(object);
	}

	public static void allParkView(ArrayList<ParkDTO> parkList) {
		int listSize = parkList.size();

		if (listSize != 0) {
			int count = 1;
			for (ParkDTO p : parkList) {
				System.out.println("검색 정보 " + (count++) + " - " + p);
			}
		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 예외 상황 출력
	public static void showError(String message) {
		System.out.println(message);
	}

}
