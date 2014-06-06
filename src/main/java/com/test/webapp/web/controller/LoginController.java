package com.test.webapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.webapp.manager.UserManager;

@Controller
public class LoginController {
	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/index")
	public String loginPage() {
		return "index";
	}
}
