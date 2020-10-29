package co.soft.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserInfoBean {
	
	private int user_idx;
	private boolean userIdExist;
	private boolean userLogin;
	
	@Size(min=2, max=4) 
	@Pattern(regexp = "[가-힣]*")
	private String userName;	//�씠由�
	
	@Size(min=2, max=10) 
	@Pattern(regexp = "[가-힣a-Z]*")
	private String userNickName; //蹂꾨챸
	
	@Size(min=2, max=10) 
	@Pattern(regexp = "[0-9]*")
	private int userBirth;	//�깮�뀈�썡�씪
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userId;	//�븘�씠�뵒
	
	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userPassword; //鍮꾨�踰덊샇ㅇ
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String userGender; //�꽦蹂�d
	
	@Size(min=4, max=30)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	private String userEmail; //�씠硫붿씪
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int userPhone; // �쟾�솕踰덊샇
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int userTemp; // �삩�룄
	
	@Size(min=1, max=12)
	@Pattern(regexp = "[0-9]*")
	private int howManyuser; //�닾�몴 �씤�썝�닔  -> �몢媛� 議고빀�쑝濡� 醫뗭븘�슂 rate(蹂꾩젏) 怨꾩궛
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String favorite; //�꽑�샇 �쓬�떇
	
	@Size(min=0, max=5)
	@Pattern(regexp = "[가-힣]*")
	private String userComment; //蹂몄씤 �룊媛�

	
	public UserInfoBean() {
		this.userIdExist = false;
		this.userLogin = false;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
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
