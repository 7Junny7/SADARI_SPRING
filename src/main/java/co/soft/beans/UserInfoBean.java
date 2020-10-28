package co.soft.beans;

public class UserInfoBean {

	//유저 정보, 로그인 및 회원가입 용, 회원정보 및 평가 용
	private String userName;	//이름
	private String userNickName; //별명
	private int userBirth;	//생년월일
	private String userId;	//아이디
	private String userPassword; //비밀번호
	private String userRePassword; //비밀번호재입력
	private String userGender; //성별
	private String userEmail; //이메일
	private int userPhone; // 전화번호
	private int userTemp; // 온도
	private int howManyuser; //투표 인원수  -> 두개 조합으로 좋아요 rate(별점) 계산
	private String favorite; //선호 음식
	private String userComment; //본인 평가
}
