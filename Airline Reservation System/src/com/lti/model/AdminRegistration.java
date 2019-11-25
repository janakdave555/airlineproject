package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminlogin")
public class AdminRegistration
{

	@Id
	String admin_name;
	String admin_password;
	
	public AdminRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminRegistration(String admin_name, String admin_password) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "AdminRegistration [admin_name=" + admin_name + ", admin_password=" + admin_password + "]";
	}
}
