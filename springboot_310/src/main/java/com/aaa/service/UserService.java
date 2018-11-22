package com.aaa.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;

@Service
public class UserService {

	@Resource
	private UserDao dao;

	public List<User> query() {
		return dao.query();
	}

	public List<Map<String, Object>> queryUser() {
		return dao.queryUser();
	}

}
