package com.aug.entities.parn;

import com.aug.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "PARN")
public class Parn extends BaseEntity implements Serializable {
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;

	@Column(name = "AGE")
	private String age;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}

