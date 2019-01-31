package com.app.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTIES")
public class LandlordAddProperty {
	
	@Column(name="PROP_ID")
	@Id
	private String propertyId;
	@Column(name="LL_ID")
	private String lanlordId;
	@Column(name="AREA")
	private double area;
	@Column(name="LOCATION")
	private String location;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	
	
	public String getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	public String getLanlordId() {
		return lanlordId;
	}
	public void setLanlordId(String lanlordId) {
		this.lanlordId = lanlordId;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
}
