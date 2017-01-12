package com.search.spring.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.search.spring.web.service.TitleListASSIAService;

@Controller
public class HomeController {
	@Autowired
	private TitleListASSIAService TitleListASSIAService;
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
}
