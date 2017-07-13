package com.idark.Controller;

import com.idark.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyakui on 2017/7/13.
 */
@Controller
@RequestMapping("/")
public class PageController {

	@RequestMapping("index")
	public String indexPage(Model model){

		Person single = new Person("aa", 11);
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("zhangsan", 11);
		Person p2 = new Person("lisi", 22);
		Person p3 = new Person("wangwu", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);

		return "index";
	}
}
