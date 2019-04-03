package com.app.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="LANDLORD_DETAILS")
@SecondaryTable(name="PMRA_ROLES", pkJoinColumns=@PrimaryKeyJoinColumn(referencedColumnName="landlordId", name="ID"))
public class LandlordDetails {
	
	@Column(name="LL_ID")
	@GenericGenerator(name="generatedLandlordId", strategy="com.app.common.IdGenerator")
	@GeneratedValue(generator="generatedLandlordId"/*, strategy=GenerationType.SEQUENCE*/)
	@Id
	@NotNull
	private String landlordId;
	
	@Column(name="LL_FIRST_NAME")
	private String firstName;
	
	@Column(name="LL_LAST_NAME")
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
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Column(table="PMRA_ROLES")
	private String role;
	
	
	public String getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(String landlordId) {
		this.landlordId = landlordId;
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
