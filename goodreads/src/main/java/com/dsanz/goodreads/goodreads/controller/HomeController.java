package com.dsanz.goodreads.goodreads.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "/", "home" })
	public ModelAndView loadHome(HttpServletRequest request) {
		logger.debug(" >>> HomeController GET --> home.html ");
		ModelAndView mav = new ModelAndView("home");
		logger.debug(" >>> HomeController RETURNED --> OK! ");
		return mav;
	}
}