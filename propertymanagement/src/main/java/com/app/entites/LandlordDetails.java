package com.app.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="LANDLORD_DETAILS")
public class LandlordDetails {
	
	@Column(name="LL_ID")
	@NotNull
	private String landlordId;
	
	@Column(name="LL_NAME")
	@Id
	private String landlordName;
	
	@Column(name="LL_Gender")
	private String gender;
	
	@Column(name="LL_Current_City")
	private String city;
	
	@Column(name="LL_Mobile_NUMBER")
	private String mobile;
	
	@Column(name="LL_EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	public String getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(String landlordId) {
		this.landlordId = landlordId;
	}

	public String getLandlordName() {
		return landlordName;
	}
	
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
