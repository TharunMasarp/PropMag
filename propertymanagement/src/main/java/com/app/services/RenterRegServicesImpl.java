package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.app.beans.RenterRegistration;
import com.app.dao.RenterRegDao;

public class RenterRegServicesImpl implements RenterRegServices{
	
	@Autowired
	@Qualifier(value="renterRegDaoImpl")
	private RenterRegDao rrDao;

	@Override
	public String saveRenter(RenterRegistration renterReg) {
		return rrDao.saveRenter(renterReg);
	}

	@Override
	public List<RenterRegistration> authenticateRenter(String userName, String password) {
		return rrDao.authenticateRenter(userName, password);
	}
}
