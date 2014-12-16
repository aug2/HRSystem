package com.aug.entities.va;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable{

	    @Id
	    @Column(name = "ID")
	    @GeneratedValue
	    private Integer id;

	    @Column(name = "NAME", nullable = false, unique = true)
	    private String name;
	    
	    @OneToMany(mappedBy = "department",cascade = CascadeType.REMOVE)
	    private List<Va> valist;
	    

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

		public List<Va> getValist() {
			return valist;
		}

		public void setValist(List<Va> valist) {
			this.valist = valist;
		}

		@Override
		public String toString() {
			return name;
		}

}
