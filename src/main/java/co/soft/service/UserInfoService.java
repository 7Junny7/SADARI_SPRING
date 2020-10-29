package co.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.beans.UserInfoBean;
import co.soft.dao.UserInfoDao;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	public List<UserInfoBean> getUserInfoList() {
		List<UserInfoBean> userInfoList = UserInfoDao.getUserInfoList();
		return userInfoList;
	}
}
