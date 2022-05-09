package DogInfo2;

import java.util.*;

public class DogInfoService2 {

	Scanner scan = new Scanner(System.in);
	static Long dogId = 0L;
	DogInfoRepository2 dr = new DogInfoRepository2();
	int input = 0;
	boolean run = true;
	
	public void save() {
		System.out.print("반려견 이름: ");
		String dogname = scan.next();
		System.out.print("반려견 성별 : ");
		String gender = scan.next();
		System.out.print("반려견 생년월일 : ");
		String dateBirth = scan.next();
		DogInfoDTO2 member = new DogInfoDTO2(++dogId, dogname, gender, dateBirth);
		dr.save(member);
	}

	public void findAll() {
		List<DogInfoDTO2> dogList = dr.findAll();
		for(int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i));
		}
	}

	
	public void dogChoice() {
		findAll();
		System.out.print("반려견 관리번호를 선택해주세요");
		Long dogId = scan.nextLong();
		DogInfoDTO2 dog = dr.dogChoice(dogId);
		System.out.println(dog.getDogName() + " 보호자님 환영합니다!");
		while(run) {
			System.out.println("1.정보기록  2. 정보조회  3. 초기화면 돌아가기");
			input = scan.nextInt();
			if (input == 1) {
				while(run) {
					System.out.println("1. 사료기록  2. 물그릇위생기록  3.간식기록  4. 산책기록  5. 건강정보기록 6.이전화면 돌아가기");
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
					System.out.println("1. 오늘정보조회  2.건강정보조회  3.이전화면 돌아가기");
					input = scan.nextInt();
					if (input == 1) {
						System.out.println("오늘정보");
					} else if (input == 2) {
						System.out.println("건강정보");
					} else if (input == 3) {
						break;
					}
				}
			} else if(input == 3) {
				run = false;
			}
			
		}
	
	}
	
	

	
	
	
	

	
}
