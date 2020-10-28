package co.soft.beans;

public class LocationInfoBean {

	//음식점 정보
	private String restaurant; // 음식점 명ㅋ
	private String r_location_x; // 위치x
	private String r_location_y; // 위치y
	private String foodType; // 음식종류
	private int foodLikeScore; // 좋아요 점수
	private int foodLikePerson; // 투표 인원수  -> 두개 조합으로 좋아요 rate(별점) 계산
	private String foodComment; // 코멘트
	private String foodPicture; //음식사진
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getR_location_x() {
		return r_location_x;
	}
	public void setR_location_x(String r_location_x) {
		this.r_location_x = r_location_x;
	}
	public String getR_location_y() {
		return r_location_y;
	}
	public void setR_location_y(String r_location_y) {
		this.r_location_y = r_location_y;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getFoodLikeScore() {
		return foodLikeScore;
	}
	public void setFoodLikeScore(int foodLikeScore) {
		this.foodLikeScore = foodLikeScore;
	}
	public int getFoodLikePerson() {
		return foodLikePerson;
	}
	public void setFoodLikePerson(int foodLikePerson) {
		this.foodLikePerson = foodLikePerson;
	}
	public String getFoodComment() {
		return foodComment;
	}
	public void setFoodComment(String foodComment) {
		this.foodComment = foodComment;
	}
	public String getFoodPicture() {
		return foodPicture;
	}
	public void setFoodPicture(String foodPicture) {
		this.foodPicture = foodPicture;
	}

	
}