package com.niit.perfumic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="UserDetails")
@Component


public class Supplier {
	private String id;
	private String suppliername;
	private String productdetails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	

}
