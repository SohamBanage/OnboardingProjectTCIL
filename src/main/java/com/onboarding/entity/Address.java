package com.onboarding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long add_id;
	private String street;
    private String city;
    private String pin_code;
    private String mobile;
    private String email_id;
	public Address(Long add_id, String street, String city, String pin_code, String mobile, String email_id) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.pin_code = pin_code;
		this.mobile = mobile;
		this.email_id = email_id;
	}
	public Address() {
		super();
	}
	public Long getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Long add_id) {
		this.add_id = add_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
    
    
}