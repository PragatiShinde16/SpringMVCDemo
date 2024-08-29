package com.springmvc.SpringMVCProject.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.SpringMVCProject.dao.LoginDao;
import com.springmvc.SpringMVCProject.entity.Person;
import com.springmvc.SpringMVCProject.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDao dao;
	
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		
//		String msg = null;
		User user2 = dao.loginUser(user);
//		if (Objects.isNull(user2)) {
//			msg = "login";
//		}else {
//			msg = "home";
//		}
		return user2;
	}
	
	public List<Person> getAllPersonData() {
		List<Person> list = dao.getAllPersonData();
		return list;
	}

}
