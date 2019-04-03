package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.RenterRegistration;
import com.app.services.RenterRegServices;
import com.app.validators.RenterRegValidator;

@Controller
public class RenterController {
	
	@Autowired
	private RenterRegServices rrs;
	
	@RequestMapping(value="/renter_registration.htm", method=RequestMethod.GET)
	public ModelAndView saveRenter() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("renterReg", new RenterRegistration());
		mav.setViewName("renter_registration");
		return mav;
	}
	
	@RequestMapping(value="/renter_reg.htm", method=RequestMethod.POST)
	public ModelAndView saveRenter(@ModelAttribute("renterReg")RenterRegistration rreg, BindingResult errors) {
		ModelAndView mav =  new ModelAndView();
		RenterRegValidator rrv = new RenterRegValidator();
		rrv.validate(rreg, errors);
		if(errors.hasErrors()) {
			mav.addObject("rRegValidations", errors);
			mav.setViewName("renter_registration");
			return mav;
		}
		if(rreg.getPassword().equals(rreg.getcPassword())) {
			rrs.saveRenter(rreg);
			mav.addObject("userName", rreg.getFirstName()+rreg.getLastName());
			mav.setViewName("reg_success");
			return mav;
		}else {
			mav.addObject("status", "Password and Confirm Password doesn't maches!");
			mav.setViewName("renter_registration");
			return mav;
		}
	}
	
}
