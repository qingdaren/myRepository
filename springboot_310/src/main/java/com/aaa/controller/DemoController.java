package com.aaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// 默认返回json
@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(value = "del", method = RequestMethod.GET)
	public String del() {
		return "ok2";
	}

	// @RequestMapping(value = "del", method = RequestMethod.GET)
	@GetMapping("add")
	public String add() {
		return "ok";
	}

	// @RequestMapping(value = "del", method = RequestMethod.POST)
	@PostMapping("update")
	public String update() {
		return "ok";
	}
}
