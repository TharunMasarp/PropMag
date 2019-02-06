package com.app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.LandlordRegistration;
import com.app.services.LandlordRegServices;
import com.app.validators.LandlordRegValidator;

@Controller
public class LandlordController {
	
	@Autowired
	private LandlordRegServices landlordRegServicesImpl;
	
	@RequestMapping(value="/landlord_registration.htm", method=RequestMethod.GET)
	public ModelAndView saveLL() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("landlordReg", new LandlordRegistration());
		mav.setViewName("landlord_registration");
		return mav;
	}
	
	@RequestMapping(value="/landlordReg.htm", method=RequestMethod.POST)
	public ModelAndView saveLl(@ModelAttribute("landlordReg")LandlordRegistration llreg, BindingResult errors) {
		ModelAndView mav = new ModelAndView();
		LandlordRegValidator llv = new LandlordRegValidator();
		llv.validate(llreg, errors);
		if(errors.hasErrors()) {
			mav.addObject("llRegValidations", errors);
			mav.setViewName("landlord_registration");
			return mav;
		}
		if(llreg.getPassword().equals(llreg.getcPassword())) {
			landlordRegServicesImpl.saveLandlord(llreg);
			mav.addObject("userName", llreg.getFirstName()+llreg.getLastName());
			mav.setViewName("reg_success");
			return mav;
		}else {
			mav.addObject("status", "Password and Confirm Passwords are not matching");
			mav.setViewName("landlord_registration");
			return mav;
		}
	}
	
}
