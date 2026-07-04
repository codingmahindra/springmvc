package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass{

@RequestMapping("/addmobile")

public String addmobileInfo(@ModelAttribute("mob")Mobile mobile) {
	
	return "success";
}

	
	
}