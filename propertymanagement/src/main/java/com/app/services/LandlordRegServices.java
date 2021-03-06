package com.app.services;

import java.util.List;


import org.springframework.stereotype.Component;

import com.app.beans.LandlordRegistration;
import com.app.entites.LandlordDetails;


/*@Component*/
public interface LandlordRegServices {
	public String saveLandlord(LandlordRegistration landlordReg);
	public List<LandlordDetails> authenticateLandlord(String userName, String password);
}
