package com.aug.entities.bill;

import com.aug.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "BILL")
public class Bill extends BaseEntity implements Serializable {
	
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "AGE",unique = false)
	private Integer  age;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

}
