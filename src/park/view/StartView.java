package park.view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {

		System.out.println("*** 모든 공원 정보 검색 ***");
		Controller.getparkInfo();
//		
		
		System.out.println("*** 특정 공원 정보 검색 ***");
		Controller.getparkInfo(3);
		

//		System.out.println("*** 공원 정보 추가 ***");
//		Controller.addProbonoProject(89, "test", "test", "test", "test", "test", "test", "test");
//		Controller.getparkInfo(89);
		
	
		System.out.println("*** 공원 위치로 주요식물 수정 ***");
		Controller.updatePark("개나리","중구");
		Controller.getparkInfo(1);
		
	}

}
