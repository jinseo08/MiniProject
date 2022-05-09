package DogInfo2;

import java.util.*;


public class DogInfoRepository2 {

	static List<DogInfoDTO2> dogList = new ArrayList<>();
	static List<RecordDTO2> recordList = new ArrayList<>();
	
	public void save(DogInfoDTO2 member) {
		dogList.add(member);
	}

	public List<DogInfoDTO2> findAll() {
		return dogList;
	}

	public DogInfoDTO2 dogChoice(Long dogId) {
		DogInfoDTO2 dog = null;
		for(int i = 0; i < dogList.size(); i++) {
			if(dogId.equals(dogList.get(i).getDogId())) {
				dog = dogList.get(i);
			}
		}
		
		return dog;
	}
	
	
	
	
	
	
	
	
	
}
