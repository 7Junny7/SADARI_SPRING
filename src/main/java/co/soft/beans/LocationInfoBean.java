package co.soft.beans;

public class LocationInfoBean {

	//음식점 정보
	private String restaurant; // 음식점 명ㅋ
	private String r_location; // 위치
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
	public String getR_location() {
		return r_location;
	}
	public void setR_location(String r_location) {
		this.r_location = r_location;
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