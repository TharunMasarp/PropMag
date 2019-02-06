package com.app.dao;

import java.util.List;

import com.app.beans.AddProperty;
import com.app.beans.LandlordRegistration;

public interface LandlordRegDao {
	public String saveLandlord(LandlordRegistration landlordReg);
	public List<LandlordRegistration> authenticateLandlord(String userName, String password);
	public void saveProp(AddProperty prop);
}