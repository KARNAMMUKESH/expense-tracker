package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class espense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String date;
	private String decs;
	private float amt;
	
	@ManyToOne
	private category category;
	
	@ManyToOne
	  private User user;
	
	
	public espense() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public espense(Long id, String date, String decs, float amt) {
		super();
		this.id = id;
		this.date = date;
		this.decs = decs;
		this.amt = amt;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDecs() {
		return decs;
	}
	public void setDecs(String decs) {
		this.decs = decs;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}

}
