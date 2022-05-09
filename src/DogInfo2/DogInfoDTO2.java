package DogInfo2;

public class DogInfoDTO2 {

	private Long dogId; //관리번호
	private String dogName; //이름
	private String gender; //성별
	private String dateBirth; //생년월일
	
	public DogInfoDTO2() {
		
	}
	
	public DogInfoDTO2(Long dogId, String dogName, String gender, String dateBirth) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.gender = gender;
		this.dateBirth = dateBirth;
	}

	public Long getDogId() {
		return dogId;
	}

	public void setDogId(Long dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	@Override
	public String toString() {
		return "DogInfoDTO2 [dogId=" + dogId + ", dogName=" + dogName + ", gender=" + gender + ", dateBirth="
				+ dateBirth + "]";
	}

	
	
	
}
