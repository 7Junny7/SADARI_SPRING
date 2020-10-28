package co.soft.beans;

public class UserInfoBean {

	//유저 정보, 로그인 및 회원가입 용, 회원정보 및 평가 용
	private String userId;
	private String userPassword;
	private int userBirth;
	private int userPhone;
	private int userTemp;
	private int userLikeUser; //투표 인원수  -> 두개 조합으로 좋아요 rate(별점) 계산
	private String favorite; //선호 음식
	private String userComment; //회원 평가
}