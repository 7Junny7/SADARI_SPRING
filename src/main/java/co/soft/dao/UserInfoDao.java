package co.soft.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soft.beans.UserInfoBean;

@Repository
public class UserInfoDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public String checkUserIdExist(String userId) {
		return sqlSessionTemplate.selectOne("user.checkUserIdExist", userId);
	}
	
	public void addUserInfo(UserInfoBean joinUserBean) {
		sqlSessionTemplate.insert("user.addUserInfo", joinUserBean);
	}
	
	public UserInfoBean getLoginUserInfo(UserInfoBean tempLoginUserBean) {
		return sqlSessionTemplate.selectOne("user.getLoginUserInfo", tempLoginUserBean);
	}
	
	public UserInfoBean getModifyUserInfo(int useridx) {
		return sqlSessionTemplate.selectOne("user.getModifyUserInfo", useridx);
	}
	
	public void modifyUserInfo(UserInfoBean modifyUserBean) {
		sqlSessionTemplate.update("user.modifyUserInfo", modifyUserBean);
	}
}
