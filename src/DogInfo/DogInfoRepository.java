package DogInfo;

import java.util.*;

public class DogInfoRepository {

	static List<DogInfoDTO> dogList = new ArrayList<>();
	static List<RecordDTO> recordList = new ArrayList<>();
	
	public void save(DogInfoDTO member) {
		dogList.add(member);
	}

	// 반려견 이름 체크
	public boolean checkName(String dogName) {
		boolean dogCheck = false;
		for(int i = 0; i < dogList.size(); i++) {
			if(dogName.equals(dogList.get(i).getDogName())){
				dogCheck = true;
			}
		}
		return dogCheck;
	}

	//조회 날짜 체크
	public boolean checkDate(String date) {
		boolean dateCheck = false;
		for(int i = 0; i < recordList.size(); i++) {
			if(date.equals(recordList.get(i).getDate())){
				dateCheck = true;
			}
		}
		return dateCheck;		
	}
	
	
	public void feedRecord(RecordDTO feed) {
		recordList.add(feed);
	}


	public void waterRecord(RecordDTO water) {
		recordList.add(water);
	}


	public void snackRecord(RecordDTO snack) {
		recordList.add(snack);
	}
	
	
	public void walkRecord(RecordDTO walk) {
		recordList.add(walk);
	}
	
	// 오늘기록
	public List<RecordDTO> today() {
		return recordList;
	}

	public void healthSave(RecordDTO health) {
		recordList.add(health);
	}
	
	public List<RecordDTO> health() {
		return recordList;
	}

	
	
	

}
