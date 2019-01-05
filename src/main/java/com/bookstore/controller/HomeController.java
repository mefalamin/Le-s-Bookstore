package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/myAccount")
	public String myAccount() {
		return "myAccount";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("ClassActiveLogin",true);
		return "myAccount";
		
	}
}
