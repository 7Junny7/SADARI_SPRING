package co.soft.beans;

public class UserInfoBean {

	//유저 정보, 로그인 및 회원가입 용, 회원정보 및 평가 용
	private String userName;	//이름
	private String userNickName; //별명
	private int userBirth;	//생년월일
	private String userId;	//아이디
	private String userPassword; //비밀번호
	private String userGender; //성별
	private String userEmail; //이메일
	private int userPhone; // 전화번호
	private int userTemp; // 온도
	private int howManyuser; //투표 인원수  -> 두개 조합으로 좋아요 rate(별점) 계산
	private String favorite; //선호 음식
	private String userComment; //본인 평가
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public int getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(int userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserTemp() {
		return userTemp;
	}
	public void setUserTemp(int userTemp) {
		this.userTemp = userTemp;
	}
	public int getHowManyuser() {
		return howManyuser;
	}
	public void setHowManyuser(int howManyuser) {
		this.howManyuser = howManyuser;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	
	
}
