package com.app.dao;

import java.util.List;

import com.app.beans.RenterRegistration;


public interface RenterRegDao {
	public String saveRenter(RenterRegistration renterReg);
	public List<RenterRegistration> authenticateRenter(String userName, String password);
}