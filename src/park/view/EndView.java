package park.view;

import java.util.ArrayList;

import park.model.dto.ParkDTO;

public class EndView {
	
	// 별도의 parkview 설정
		public static void ParkView(ArrayList<ParkDTO> parkList) {
			int listSize = parkList.size();
			
			if(listSize != 0) {
				int count = 1;
				for(ParkDTO p : parkList) {
					System.out.println("검색 정보 " + (count++) + " - " + p);
				}
			} else {
				System.out.println("검색 정보 0");
			}
		}
			
		//특정 프로젝트 출력 
		public static void projectView(ParkDTO project){
			System.out.println(project);		
		}
		
		
		public static void allView(Object object){
			System.out.println(object);
		}
		
		//예외 상황 출력
		public static void showError(String message){
			System.out.println(message);		
		}


}
