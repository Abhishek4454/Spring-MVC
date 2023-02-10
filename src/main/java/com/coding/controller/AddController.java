package com.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@RequestMapping("/add")
	public String add() {
		System.out.println("Add is working");
		return "index";
	}
	
}
