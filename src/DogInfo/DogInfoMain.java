package DogInfo;

import java.util.*;

public class DogInfoMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int input = 0;
		DogInfoService ds = new DogInfoService();
		System.out.println("       안녕하세요! 반려견 관리 프로그램입니다! 원하는 항목을 선택 해 주세요!        ");
		
		while(run) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("  1. 반려견 등록  2. 사료 기록  3. 물그릇위생 기록  4. 간식 기록  5. 산책 기록");
			System.out.println("  6. 건강정보 기록 7. 오늘정보 조회  8. 건강정보 조회  9.종료");
			System.out.println("-------------------------------------------------------------------");		
			System.out.print("선택>");
			input = scan.nextInt();
			if(input == 1) {
				ds.save();
			}else if (input == 2) {
				ds.feedRecord();
			}else if (input == 3) {
				ds.waterRecord();
			}else if (input == 4) {
				ds.snackRecord();
			}else if (input == 5) {
				ds.walkRecord();
			}else if (input == 6) {
				ds.healthSave();
			}else if (input == 7) {
				ds.today();
			}else if (input == 8) {
				ds.health();


			}else if (input == 9) {
				System.out.println("반려견 관리 프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("번호를 확인해주세요");
			}
		}
	}
}
