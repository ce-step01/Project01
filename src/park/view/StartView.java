package park.view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** 모든 공원 정보 검색 ***");
		Controller.getparkInfo();
		
		System.out.println("*** 특정 공원 정보 검색 ***");
		Controller.getparkInfo(3);

		System.out.println("*** 공원 정보 추가 ***");
		Controller.addProbonoProject(89, "test", "test", "test", "test", "test", "test", "test");
		
		Controller.getparkInfo(89);
		
//		System.out.println("\n*** 특정 공원 정보 검색 ***");
//		Controller.getProbono("schweitzer");
//
//		System.out.println("\n*** 특정 공원 정보 수정후 재 검색 ***");
//		Controller.updateProbono("schweitzer", "애완동물사랑");
//		Controller.getProbono("schweitzer");
//		
//		ystem.out.println("\n*** 특정 공원 정보 수정후 재 검색 ***");
//		Controller.updateParkInfo("schweitzer", "애완동물사랑");
//		Controller.getProbono("schweitzer");
	}

}
