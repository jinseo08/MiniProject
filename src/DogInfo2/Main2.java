package DogInfo2;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int input = 0;
		DogInfoService2 ds = new DogInfoService2();

		System.out.println("안녕하세요 반려견 관리 프로그램입니다!");
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.반려견 등록  2.반려견 조회  3. 반려견 선택  4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 >");
			input = scan.nextInt();
			if (input == 1) {
				ds.save();
			} else if (input == 2) {
				ds.findAll();
			} else if (input == 3) {
				ds.dogChoice();
				/*
				System.out.println("반려견 선택");
					System.out.println("보호자님 환영합니다!");
					System.out.println("1.정보기록  2. 정보조회");
					input = scan.nextInt();
					if (input == 1) {
						while(run) {
							System.out.println("1. 사료기록  2. 물그릇위생기록  3.간식기록  4. 산책기록  5. 건강정보기록 6.초기화면 돌아가기");
							input = scan.nextInt();
							if (input == 1) {
								System.out.println("사료기록");
							} else if (input == 2) {
								System.out.println("물기록");
							} else if (input == 3) {
								System.out.println("간식기록");
							} else if (input == 4) {
								System.out.println("산책기록");
							} else if (input == 5) {
								System.out.println("건강정보기록");
							} else if (input == 6) {
								break;
							}
						}
					} else if (input == 2) {
						while(run) {
							System.out.println("1. 오늘정보조회  2.건강정보조회  3.초기화면 돌아가기");
							input = scan.nextInt();
							if (input == 1) {
								System.out.println("오늘정보");
							} else if (input == 2) {
								System.out.println("건강정보");
							} else if (input == 3) {
								break;
							}
						}
					} 

			*/
				
			}else if (input == 4) {
				System.out.println("종료");
				run = false;
			}
		}

	}

}
