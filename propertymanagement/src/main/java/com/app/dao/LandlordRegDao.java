package com.app.dao;

import java.util.List;

import com.app.beans.AddProperty;
import com.app.beans.LandlordRegistration;
import com.app.entites.LandlordDetails;

public interface LandlordRegDao {
	public String saveLandlord(LandlordRegistration landlordReg);
	public List<LandlordDetails> authenticateLandlord(String userName, String password);
	public void saveProp(AddProperty prop);
}