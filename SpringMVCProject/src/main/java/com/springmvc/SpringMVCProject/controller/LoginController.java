package com.springmvc.SpringMVCProject.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.SpringMVCProject.entity.Person;
import com.springmvc.SpringMVCProject.entity.User;
import com.springmvc.SpringMVCProject.service.LoginService;

@Controller
@RequestMapping("api")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@PostMapping("login")
	public String loginUser(@ModelAttribute User user, Model model) {
//		System.out.println(user);
		String msg = null;
		User user2 = service.loginUser(user);
//		System.out.println(str);
		if (Objects.isNull(user2)) {
			msg = "login";
		}else {
			List<Person> list = service.getAllPersonData();
			model.addAttribute("personlist", list);
			msg = "home";
		}
		return msg;
	}
}
