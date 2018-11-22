package com.aaa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.User;
import com.aaa.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService user;

	@RequestMapping("add")
	public String add() {
		System.out.println("user:" + user);

		return "success";
	}

	@RequestMapping("del")
	@ResponseBody
	public List<User> del() {
		return user.query();
	}

}
