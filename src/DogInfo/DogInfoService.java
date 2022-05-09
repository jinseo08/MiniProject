package DogInfo;

import java.util.*;

public class DogInfoService {

	Scanner scan = new Scanner(System.in);
	static Long dogId = 0L;
	DogInfoRepository dr = new DogInfoRepository();

	public void save() {
		System.out.print("반려견 이름: ");
		String dogname = scan.next();
		System.out.print("반려견 성별 : ");
		String gender = scan.next();
		System.out.print("반려견 생년월일 : ");
		String dateBirth = scan.next();
		DogInfoDTO member = new DogInfoDTO(++dogId, dogname, gender, dateBirth);
		dr.save(member);
	}

	public void feedRecord() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			RecordDTO feed = new RecordDTO();
			System.out.print("기록 할 날짜를 입력해주세요 : ");
			feed.setDate(scan.next());
			System.out.print("사료 먹은 시간을 입력해주세요 : ");
			feed.setFeed(scan.next());
			dr.feedRecord(feed);
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void waterRecord() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			RecordDTO water = new RecordDTO();
			System.out.print("기록 할 날짜를 입력해주세요 : ");
			water.setDate(scan.next());
			System.out.print("물그릇 갈아준 시간을 입력해주세요 : ");
			water.setWater(scan.next());
			dr.waterRecord(water);
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void snackRecord() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			RecordDTO snack = new RecordDTO();
			System.out.print("기록 할 날짜를 입력해주세요 : ");
			snack.setDate(scan.next());
			System.out.print("간식 준 시간을 입력해주세요 : ");
			snack.setSnack(scan.next());
			dr.snackRecord(snack);
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void walkRecord() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			RecordDTO walk = new RecordDTO();
			System.out.print("기록 할 날짜를 입력해주세요 : ");
			walk.setDate(scan.next());
			System.out.print("산책 갔다 온 시간을 입력해주세요 : ");
			walk.setWalk(scan.next());
			dr.walkRecord(walk);
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void healthSave() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			RecordDTO health = new RecordDTO();
			System.out.print("심장사상충 예방약 : ");
			health.setNexgard(scan.next());
			System.out.print("구충제 : ");
			health.setAnthl(scan.next());
			System.out.print("예방접종 : ");
			health.setVaccine(scan.next());
			System.out.print("건강검진 : ");
			health.setHealthCheckup(scan.next());
			dr.healthSave(health);
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void today() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			System.out.print("조회 할 날짜 : ");
			String date = scan.next();
			boolean dateCheck = dr.checkDate(date);
			if(dateCheck) {
				List<RecordDTO> todayList = dr.today();
				for (int i = 0; i < todayList.size(); i++) {
					if (todayList.get(i).getFeed() != null) {
						System.out.println("사료 먹은 시간 " + todayList.get(i).getFeed());
					}
				}
				for (int i = 0; i < todayList.size(); i++) {
					if (todayList.get(i).getWater() != null) {
						System.out.println("물그릇 갈아준 시간 " + todayList.get(i).getWater());
					}
				}
				for (int i = 0; i < todayList.size(); i++) {
					if (todayList.get(i).getSnack() != null) {
						System.out.println("간식 준 시간 " + todayList.get(i).getSnack());
					}
				}
				for (int i = 0; i < todayList.size(); i++) {
					if (todayList.get(i).getWalk() != null) {
						System.out.println("산책갔다 온 시간 " + todayList.get(i).getWalk());
					}
				}
			}else {
				System.out.println("조회 할 날짜가 없습니다!");
			}
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}

	public void health() {
		System.out.print("반려견 이름 : ");
		String dogName = scan.next();
		boolean dogCheck = dr.checkName(dogName);
		if (dogCheck) {
			List<RecordDTO> healthList = dr.health();
			for (int i = 0; i < healthList.size(); i++) {
				if (healthList.get(i).getNexgard() != null) {
					System.out.println("심장사상충 예방약" + healthList.get(i).getNexgard());
				}
			}
			for (int i = 0; i < healthList.size(); i++) {
				if (healthList.get(i).getAnthl() != null) {
					System.out.println("구충제" + healthList.get(i).getAnthl());
				}
			}
			for (int i = 0; i < healthList.size(); i++) {
				if (healthList.get(i).getVaccine() != null) {
					System.out.println("예방접종" + healthList.get(i).getVaccine());
				}
			}
			for (int i = 0; i < healthList.size(); i++) {
				if (healthList.get(i).getHealthCheckup() != null) {
					System.out.println("건강검진" + healthList.get(i).getHealthCheckup());
				}
			}
		} else {
			System.out.println("일치하는 반려견이 없습니다!");
		}
	}
	

}
