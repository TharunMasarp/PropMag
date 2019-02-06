package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.beans.LandlordRegistration;
import com.app.dao.LandlordRegDao;


public class LandlordRegServicesImpl implements LandlordRegServices{
	
	@Autowired
	private LandlordRegDao landlordRegDaoImpl;

	@Override
	public String saveLandlord(LandlordRegistration landlordReg) {
		return landlordRegDaoImpl.saveLandlord(landlordReg);
	}

	@Override
	public List<LandlordRegistration> authenticateLandlord(String userName, String password) {
		return landlordRegDaoImpl.authenticateLandlord(userName, password);
	}

}
