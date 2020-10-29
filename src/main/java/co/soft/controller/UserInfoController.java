package co.soft.controller;

import javax.annotation.Resource;

import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.UserInfoBean;
import co.soft.service.UserInfoService;

@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

	@Autowired
	private UserInfoService useInfoService;
	
	@Resource(name="loginUserInfoBean")
	@Lazy
	private UserInfoBean loginUserBean;
	
	
}
