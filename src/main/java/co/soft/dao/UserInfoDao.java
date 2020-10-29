package co.soft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soft.beans.UserInfoBean;

@Repository
public class UserInfoDao {

	@Autowired
	private UserMapper userMapper;

	public static List<UserInfoBean> getUserInfoList() {
		// TODO Auto-generated method stub
		return null;
	}
}
