package DogInfo;

import java.util.*;

public class DogInfoMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int input = 0;
		
		while(run) {
			System.out.println("1. 반려견 등록  2. 사료 기록  3. 물그릇위생 기록  4. 간식 기록  5. 산책 기록"
					+ "  6. 오늘정보 조회  7. 건강정보 조회  8.종료");
			System.out.println("선택");
			input = scan.nextInt();
			if(input == 1) {
				
				System.out.println("1");
			}else if (input == 2) {
				
				System.out.println("2");
			}else if (input == 3) {
				
				System.out.println("3");
			}else if (input == 4) {
				
				System.out.println("4");
			}else if (input == 5) {
				
				System.out.println("5");
			}else if (input == 6) {
				
				System.out.println("6");
			}else if (input == 7) {
				
				System.out.println("7");
			}else if (input == 8) {
				
				System.out.println("8");
				run = false;
			}else {
				System.out.println("번호를 확인해주세요");
			}
			
		}
	}
}
