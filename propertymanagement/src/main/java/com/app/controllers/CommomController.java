package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.SearchProperty;

@Controller
public class CommomController {
	
	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	public ModelAndView homeMain() {
		ModelAndView mav = new ModelAndView();
		/*mav.addObject("searchProp", new SearchProperty());*/
		mav.setViewName("home");
		return mav;
	}
}
