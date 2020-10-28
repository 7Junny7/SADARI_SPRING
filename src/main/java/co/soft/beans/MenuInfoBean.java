package co.soft.beans;

public class MenuInfoBean {

	//좌상단 메뉴 인터셉터 용
	//1.한식 - 11.면류, 12.육류, 13.탕/국/찌개/전골, 14.일반한식
	//2.중식 - 21.일반중식, 22.마라, 23.양꼬치
	//3.일식 - 31.회/초밥, 32.면류, 33.일본가정식, 34.튀김, 35.꼬치
	//4.분식 - 41.분식
	//5.양식 - 51.파스타/피자
	//6.패스트푸드 - 61.피자, 62.치킨, 63.햄버거
	
	private int menu_info_idx;
	private String menu_info_name;
	
	public int getMenu_info_idx() {
		return menu_info_idx;
	}
	public void setMenu_info_idx(int menu_info_idx) {
		this.menu_info_idx = menu_info_idx;
	}
	public String getMenu_info_name() {
		return menu_info_name;
	}
	public void setMenu_info_name(String menu_info_name) {
		this.menu_info_name = menu_info_name;
	}
	
}
