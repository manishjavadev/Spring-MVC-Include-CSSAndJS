package com.manish.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestCSSController {

	@RequestMapping(value = "/testCssAndJS.htm", method = RequestMethod.GET)
	public ModelAndView getData() {
		System.out.println("getData Called");
		ModelAndView model = new ModelAndView("cssAndJS");

		return model;

	}

}