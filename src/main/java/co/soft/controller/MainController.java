package co.soft.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import co.soft.beans.MenuInfoBean;
import co.soft.service.TopMenuService;

@Controller
public class MainController {
	
//	@Autowired
//	private MainService mainService;
	
	@Autowired
	private TopMenuService topMenuService;
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String main(Model model) {
		
//		ArrayList<List<ContentBean>> list = new ArrayList<List<ContentBean>>();
//		
//		for(int i = 1 ; i <= 4 ; i++) {
//			List<ContentBean> list1 = mainService.getMainList(i);
//			list.add(list1);
//		}
//		
//		model.addAttribute("list", list);
		
		List<MenuInfoBean> board_list = topMenuService.getTopMenuList();
		model.addAttribute("board_list", board_list);
		
		return "index";
	}
}












