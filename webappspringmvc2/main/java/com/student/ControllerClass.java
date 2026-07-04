package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("/hello666")

	public String getData(@ModelAttribute("names")PojoClass pojo) {
		
		
		return "success";
	}
}
