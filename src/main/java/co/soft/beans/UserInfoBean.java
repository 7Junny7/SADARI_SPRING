package co.soft.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserInfoBean {
	
	private int useridx;
	private boolean userIdExist;
	private boolean userLogin;
	
	@Size(min=2, max=4) 
	@Pattern(regexp = "[가-힣]*")
	private String userName;	//이름
	
	@Size(min=2, max=10) 
	@Pattern(regexp = "[가-힣a-Z]*")
	private String userNickName; //닉네임
	
	@Size(min=2, max=10) 
	@Pattern(regexp = "[0-9]*")
	private int userBirth;	//생년월일
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userId;	//아이디
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userPassword; //비밀번호
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String userGender; //성별
	
	@Size(min=4, max=30)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userEmail; //이메일
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int userPhone; //전화번호
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int userTemp; // 온도
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int howManyuser; //평가한사람수
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String favorite; //좋아하는음식
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String userComment; //한줄평

	
	public UserInfoBean() {
		this.userIdExist = false;
		this.userLogin = false;
	}

	public int getUseridx() {
		return useridx;
	}

	public void setUseridx(int user_idx) {
		this.useridx = user_idx;
	}

	public boolean isUserIdExist() {
		return userIdExist;
	}

	public void setUserIdExist(boolean userIdExist) {
		this.userIdExist = userIdExist;
	}

	public boolean isUserLogin() {
		return userLogin;
	}

	public void setUserLogin(boolean userLogin) {
		this.userLogin = userLogin;
	}

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
