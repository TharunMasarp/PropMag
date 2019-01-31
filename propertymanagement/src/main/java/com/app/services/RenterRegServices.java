package com.app.services;

import java.util.List;

import com.app.beans.RenterRegistration;

public interface RenterRegServices {
	public String saveRenter(RenterRegistration renterReg);
	public List<RenterRegistration> authenticateRenter(String userName, String password);
}
