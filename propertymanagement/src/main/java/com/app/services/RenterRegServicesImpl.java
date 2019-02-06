package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.beans.RenterRegistration;
import com.app.dao.RenterRegDao;

public class RenterRegServicesImpl implements RenterRegServices{
	
	@Autowired
	/*@Qualifier(value="renterRegDaoImpl")*/
	private RenterRegDao renterRegDaoImpl;

	@Override
	public String saveRenter(RenterRegistration renterReg) {
		return renterRegDaoImpl.saveRenter(renterReg);
	}

	@Override
	public List<RenterRegistration> authenticateRenter(String userName, String password) {
		return renterRegDaoImpl.authenticateRenter(userName, password);
	}
}
