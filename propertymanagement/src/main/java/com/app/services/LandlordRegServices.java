package com.app.services;

import java.util.List;


import org.springframework.stereotype.Component;

import com.app.beans.LandlordRegistration;


/*@Component*/
public interface LandlordRegServices {
	public String saveLandlord(LandlordRegistration landlordReg);
	public List<LandlordRegistration> authenticateLandlord(String userName, String password);
}
