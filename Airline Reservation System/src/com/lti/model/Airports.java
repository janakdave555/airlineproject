package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Airports {
	@Id 
	String airport_id;
	String airport_name;
	String city_name;
	
	
	
	@Override
	public String toString() {
		return "Airports [airport_id=" + airport_id + ", airport_name=" + airport_name + ", city_name=" + city_name
				+ "]";
	}

	public String getAirport_id() {
		return airport_id;
	}

	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Airports(String airport_id, String airport_name, String city_name) {
		super();
		this.airport_id = airport_id;
		this.airport_name = airport_name;
		this.city_name = city_name;
	}

	public Airports() {
	
		
	}
	
	
}
