package com.capg.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.springbootapp.model.User;

@Controller
public class TestController {
	@GetMapping("/hello")
	public String sayHello(@RequestParam("tbName") String traineeName, Model m)
	{
		m.addAttribute("trainee", traineeName);
		return "view.jsp";
		
	}
	@PostMapping("/info")
	public String readUserInfo(@ModelAttribute User user, Model m)
	{
		m.addAttribute("user", user);
		return "userinfo.jsp";
		
	}
	@GetMapping("/")
	public String getDefaultPage()
	{
		return "index.jsp";
		
	}

}
