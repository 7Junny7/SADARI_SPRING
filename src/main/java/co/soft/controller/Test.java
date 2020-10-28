package co.soft.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> branch 'master' of https://github.com/7Junny7/SADARI_SPRING.git

import co.soft.beans.Data1;

@Controller
public class Test {

	@Autowired
	SqlSessionTemplate s;
<<<<<<< HEAD
	
	@RequestMapping("/index")
=======

	@RequestMapping(value = "/index", method = RequestMethod.GET)
>>>>>>> branch 'master' of https://github.com/7Junny7/SADARI_SPRING.git
	public String index() {
		return "index";
	}
<<<<<<< HEAD
	
	@RequestMapping("/input")
=======

	@RequestMapping(value = "/input", method = RequestMethod.GET)
>>>>>>> branch 'master' of https://github.com/7Junny7/SADARI_SPRING.git
	public String input() {
		return "input";
	}
<<<<<<< HEAD
	
	@RequestMapping("/input1")
=======

	@RequestMapping(value = "/input1", method = RequestMethod.POST)
>>>>>>> branch 'master' of https://github.com/7Junny7/SADARI_SPRING.git
	public String input1(Data1 d1) {
		s.insert("test.in", d1); // mapper.xml에 있는 것 호출
		return "input1";
	}
<<<<<<< HEAD
	
	@RequestMapping("/result")
=======

	@RequestMapping(value = "/result", method = RequestMethod.GET)
>>>>>>> branch 'master' of https://github.com/7Junny7/SADARI_SPRING.git
	public String result(Model model) {
		List<Data1> li = s.selectList("test.sel");
		model.addAttribute("li", li);
		return "result";
	}
}
