package com.ec.web;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping( "/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping( "/delete")
	public String delete(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", 1);

		return "home";
	}
	@RequestMapping( "/insert")
	public String insert(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", 1);
		
		
		return "select";
	}
}
