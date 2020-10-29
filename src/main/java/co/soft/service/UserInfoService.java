package co.soft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import co.soft.beans.UserInfoBean;
import co.soft.dao.UserInfoDao;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Resource(name = "loginUserBean")
	//@Lazy
	private UserInfoBean loginUserBean;
	
	public boolean checkuserIdExist(String user_id) {
		
		String user_name = userInfoDao.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUserInfo(UserInfoBean joinUserBean) {
		userInfoDao.addUserInfo(joinUserBean);
	}
	
	public void getLoginUserInfo(UserInfoBean tempLoginUserBean) {
		
		UserInfoBean tempLoginUserBean2 = userInfoDao.getLoginUserInfo(tempLoginUserBean);
		
		if(tempLoginUserBean2 != null) {
			loginUserBean.setUseridx(tempLoginUserBean2.getUseridx());
			loginUserBean.setUserName(tempLoginUserBean2.getUserName());
			loginUserBean.setUserLogin(true);
		}
	}
	
	public void getModifyUserInfo(UserInfoBean modifyUserBean) {
		UserInfoBean tempModifyUserBean = userInfoDao.getModifyUserInfo(loginUserBean.getUseridx());
		
		modifyUserBean.setUserId(tempModifyUserBean.getUserId());
		modifyUserBean.setUserName(tempModifyUserBean.getUserName());
		modifyUserBean.setUserNickName(tempModifyUserBean.getUserNickName());
		modifyUserBean.setUseridx(loginUserBean.getUseridx());
	}
	
	public void modifyUserInfo(UserInfoBean modifyUserBean) {
		
		modifyUserBean.setUseridx(loginUserBean.getUseridx());
		userInfoDao.modifyUserInfo(modifyUserBean);
	}
}
