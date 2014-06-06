package com.test.webapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.webapp.manager.UserManager;
import com.test.webapp.model.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "user/user_add_input";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(String username, String password) {
		// userManager.add(user);
		// ModelAndView mav = new ModelAndView();
		// mav.setViewName("ok");
		// mav.addObject("user", user);
		System.out.println("用户名：" + username);
		System.out.println("密    码：" + password);
		return "ok";
	}

}
