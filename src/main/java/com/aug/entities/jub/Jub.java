package com.aug.entities.jub;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.aug.entities.BaseEntity;



@Entity
@Table(name = "JUB")
public class Jub extends BaseEntity implements Serializable {

	
	
	@Column(name="EMAIL")
	private String EMAIL;
	
	@Column(name="AGE")
	private String AGE;

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getAGE() {
		return AGE;
	}

	public void setAGE(String aGE) {
		AGE = aGE;
	}

	
	
	
	
}
