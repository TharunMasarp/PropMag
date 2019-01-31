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
	private String renterId;
	
	@Column(name="R_NAME")
	@Id
	private String renterName;
	
	@Column(name="R_LOCATION")
	private String location;
	
	@Column(name="R_MOBILE")
	private String mobile;
	
	@Column(name="R_EMAIL")
	private String email;
	
	@Column(name="R_PASSWORD")
	private String password;
	
	
}
