package com.onboarding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gender {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long gender_id;
	private String gender_type;
	public Gender(Long gender_id, String gender_type) {
		super();
		this.gender_id = gender_id;
		this.gender_type = gender_type;
	}
	public Gender() {
		super();
	}
	public Long getGender_id() {
		return gender_id;
	}
	public void setGender_id(Long gender_id) {
		this.gender_id = gender_id;
	}
	public String getGender_type() {
		return gender_type;
	}
	public void setGender_type(String gender_type) {
		this.gender_type = gender_type;
	}
	
	
}
