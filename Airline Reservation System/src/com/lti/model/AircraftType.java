package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="aircraft_type")
public class AircraftType
{
	@Id 	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraftType_seq")
	@SequenceGenerator(sequenceName = "aircraftType_seq", name = "aircraftType_seq", allocationSize = 1)

	
	int aircraft_typeid;

	String aircraft_name;
	String aircraft_company;
	int aircraft_capacity;
	int aircraft_economy_seats;
	int aircraft_business_seats;



	public AircraftType( int aircraft_typeid, String aircraft_name, String aircraft_company,
			int aircraft_capacity, int aircraft_economy_seats, int aircraft_business_seats) {
		super();
		
		this.aircraft_typeid = aircraft_typeid;
		this.aircraft_name = aircraft_name;
		this.aircraft_company = aircraft_company;
		this.aircraft_capacity = aircraft_capacity;
		this.aircraft_economy_seats = aircraft_economy_seats;
		this.aircraft_business_seats = aircraft_business_seats;
	}
	
	public AircraftType() 
	{
		
	}

	public int getAircraft_typeid() {
		return aircraft_typeid;
	}

	public void setAircraft_typeid(int aircraft_typeid) {
		this.aircraft_typeid = aircraft_typeid;
	}



	

	
	public String getAircraft_name() {
		return aircraft_name;
	}

	public void setAircraft_name(String aircraft_name) {
		this.aircraft_name = aircraft_name;
	}

	public String getAircraft_company() {
		return aircraft_company;
	}

	public void setAircraft_company(String aircraft_company) {
		this.aircraft_company = aircraft_company;
	}

	public int getAircraft_capacity() {
		return aircraft_capacity;
	}

	public void setAircraft_capacity(int aircraft_capacity) {
		this.aircraft_capacity = aircraft_capacity;
	}

	public int getAircraft_economy_seats() {
		return aircraft_economy_seats;
	}

	public void setAircraft_economy_seats(int aircraft_economy_seats) {
		this.aircraft_economy_seats = aircraft_economy_seats;
	}

	public int getAircraft_business_seats() {
		return aircraft_business_seats;
	}

	public void setAircraft_business_seats(int aircraft_business_seats) {
		this.aircraft_business_seats = aircraft_business_seats;
	}


	@Override
	public String toString() {
		return "AircraftType [aircraft_typeid=" + aircraft_typeid + ", aircraft_name=" + aircraft_name
				+ ", aircraft_company=" + aircraft_company + ", aircraft_capacity=" + aircraft_capacity
				+ ", aircraft_economy_seats=" + aircraft_economy_seats + ", aircraft_business_seats="
				+ aircraft_business_seats + "]";
	}


}
