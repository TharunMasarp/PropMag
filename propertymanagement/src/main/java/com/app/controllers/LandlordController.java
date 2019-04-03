package com.app.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.AddProperty;
import com.app.beans.LandlordLogin;
import com.app.beans.LandlordRegistration;
import com.app.entites.LandlordDetails;
import com.app.services.LandlordRegServices;
import com.app.validators.LandlordLoginValidator;
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
	
	@RequestMapping(value="/landlord_login.htm", method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginLandlord", new LandlordLogin());
		mav.setViewName("landlord_login");
		return mav;
	}
	
	@RequestMapping(value="/landlord_login.htm", method=RequestMethod.POST)
	public ModelAndView loginVerify(@ModelAttribute("loginLandlord") LandlordLogin llLogin, BindingResult errors, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		LandlordLoginValidator landlordLoginValidator = new LandlordLoginValidator();
		landlordLoginValidator.validate(llLogin, errors);
		if(errors.hasErrors()) {
			mav.addObject(errors);
			mav.setViewName("landlord_login");
			return mav;
		}
		List<LandlordDetails> landlordDetails = landlordRegServicesImpl.authenticateLandlord(llLogin.getLandlordId(), llLogin.getPassword());
		if(landlordDetails.size()>=0) {
			session.setAttribute("loggedUserId", llLogin.getLandlordId());
			session.setAttribute("loggedUserPassword", llLogin.getPassword());
			session.setAttribute("loggedUserName", landlordDetails.get(4));
			mav.addObject("landlordLoggedDetails", landlordDetails);
			mav.setViewName("landlord_home");
			return mav;
		}
		
		mav.addObject("failurestatus", "User Id or Password incorrect!");
		mav.setViewName("landlord_login");
		return mav;
	}
	
	@RequestMapping(value="/add_prop.htm", method=RequestMethod.GET)
	public ModelAndView addProperties(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lanlordAddProp", new AddProperty());
		mav.addObject("userName", session.getAttribute("loggedUserName"));
		mav.setViewName("landlord_prop_add");
		return mav;
	}
	@RequestMapping(value="/add_prop.htm", method=RequestMethod.POST)
	public ModelAndView addProperties(@ModelAttribute("addProp") AddProperty addProp, BindingResult errors) {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
}
