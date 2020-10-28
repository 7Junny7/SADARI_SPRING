package co.soft.controller;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soft.beans.Data1;

@Controller
public class Test {

	@Autowired
	SqlSessionTemplate s;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/input")
	public String input() {
		return "input";
	}
	
	@RequestMapping("/input1")
	public String input1(Data1 d1) {
		s.insert("test.in", d1); //mapper.xml에 있는 것 호출
		return "input1";
	}
	
	@RequestMapping("/result")
	public String result(Model model) {
		List<Data1> li=s.selectList("test.sel");
		model.addAttribute("li",li);
		return "result";
	}
}
