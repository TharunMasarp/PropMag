package com.app.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RENTER_DETAILS")
public class RenterDetails {
	
	@Column(name="R_ID")
	@NotNull
	
	@Id
	private String renterId;
	
	
	@Column(name="R_FirstName")
	private String firstName;
	
	@Column(name="R_LastName")
	private String lastName;
	
	@Column(name="R_LOCATION")
	private String location;
	
	@Column(name="R_MOBILE")
	private String mobile;
	
	@Column(name="R_EMAIL")
	private String email;
	
	@Column(name="R_PASSWORD")
	private String password;

	public String getRenterId() {
		return renterId;
	}

	public void setRenterId(String renterId) {
		this.renterId = renterId;
	}

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
