package co.soft.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import co.soft.beans.MenuInfoBean;
import co.soft.beans.UserInfoBean;
import co.soft.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{

	@Autowired
	private TopMenuService topMenuService;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserInfoBean loginUserBean;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		List<MenuInfoBean> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		request.setAttribute("loginUserBean", loginUserBean);
		
		return true;
	}


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
