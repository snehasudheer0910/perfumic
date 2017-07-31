package com.niit.perfumic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="UserDetails")
@Component 
public class User {
private String name;
private String mailid;
private int mobilenumber;
private String address;
private String role="ROLE_USER";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public int getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(int mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
