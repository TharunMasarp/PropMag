package com.app.beans;

public class RenterRegistration {
	
	private String renterName;
	private String location;
	private String mobile;
	private String email;
	private String password;
	private String cPassword;


	
	public String getcPassword() {
		return cPassword;
	}
	
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRenterName() {
		return renterName;
	}
	
	public void setRenterName() {
		this.renterName = getFirstName()+getLastName();
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
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
