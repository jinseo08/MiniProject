package DogInfo;

public class RecordDTO {
	
	Long recordId; //관리번호
	String dogName; //강아지이름
	String feed; //사료
	String water; //물그릇 세척
	String snack; //간식
	String walk; //산책
	String nexgard; //심장사상충 예방약
	String anthl; //구충제
	String healthCheckup; //건강검진
	String vaccine; //예방접종
	String date; //날짜 및 시간입력
	int count; // 횟수
	
	RecordDTO(){
		
	}

	public RecordDTO(Long recordId, String dogName, String feed, String water, String snack, String walk,
			String nexgard, String anthl, String healthCheckup, String vaccine, String date, int count) {
		super();
		this.recordId = recordId;
		this.dogName = dogName;
		this.feed = feed;
		this.water = water;
		this.snack = snack;
		this.walk = walk;
		this.nexgard = nexgard;
		this.anthl = anthl;
		this.healthCheckup = healthCheckup;
		this.vaccine = vaccine;
		this.date = date;
		this.count = count;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getSnack() {
		return snack;
	}

	public void setSnack(String snack) {
		this.snack = snack;
	}

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	public String getNexgard() {
		return nexgard;
	}

	public void setNexgard(String nexgard) {
		this.nexgard = nexgard;
	}

	public String getAnthl() {
		return anthl;
	}

	public void setAnthl(String anthl) {
		this.anthl = anthl;
	}

	public String getHealthCheckup() {
		return healthCheckup;
	}

	public void setHealthCheckup(String healthCheckup) {
		this.healthCheckup = healthCheckup;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "RecordDTO [recordId=" + recordId + ", dogName=" + dogName + ", feed=" + feed + ", water=" + water
				+ ", snack=" + snack + ", walk=" + walk + ", nexgard=" + nexgard + ", anthl=" + anthl
				+ ", healthCheckup=" + healthCheckup + ", vaccine=" + vaccine + ", date=" + date + ", count=" + count
				+ "]";
	}
	
	
	
}
