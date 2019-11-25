package com.lti.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Table(name="userregister")
@Entity
public class UserRegistration 
{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userRegister_seq")
	@SequenceGenerator(sequenceName = "userRegister_seq", name = "userRegister_seq", allocationSize = 1)
	int user_id;
	
	String email;
	String password;
	String first_name;
	String last_name;
	String gender;
	String title;
	String status;
	
	LocalDate date_of_birth;
	String phone_number;

	public UserRegistration() {
		
		// TODO Auto-generated constructor stub
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "UserRegistration [email=" + email + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", title=" + title + ", status=" + status
				+ ", date_of_birth=" + date_of_birth + ", phone_number=" + phone_number + "]";
	}

}	