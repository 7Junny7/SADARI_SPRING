package co.soft.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.beans.MenuInfoBean;
import co.soft.dao.TopMenuDao;

@Service
public class TopMenuService {
	
	@Autowired
	private TopMenuDao topMenuDao;
	
	public List<MenuInfoBean> getTopMenuList(){
		List<MenuInfoBean> topMenuList = topMenuDao.getTopMenuList();
		return topMenuList;
	}
	
}
