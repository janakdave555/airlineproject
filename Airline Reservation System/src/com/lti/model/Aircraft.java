package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Aircraft {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aircraft_seq")
	@SequenceGenerator(sequenceName = "aircraft_seq", name = "aircraft_seq", allocationSize = 1)
	
	int aircraft_id;
	String aircraft_tailId;
	

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="aircraft_typeid")	
	AircraftType aircraftType;

public Aircraft() 
{
	
		
	}

	public Aircraft(int aircraft_id, String aircraft_tailId, AircraftType aircraftType) {
		super();
		this.aircraft_id = aircraft_id;
		this.aircraft_tailId = aircraft_tailId;
		this.aircraftType = aircraftType;
	}

	public int getAircraft_id() {
		return aircraft_id;
	}

	public void setAircraft_id(int aircraft_id) {
		this.aircraft_id = aircraft_id;
	}

	public String getAircraft_tailId() {
		return aircraft_tailId;
	}

	public void setAircraft_tailId(String aircraft_tailId) {
		this.aircraft_tailId = aircraft_tailId;
	}



	public AircraftType getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(AircraftType aircraftType) {
		this.aircraftType = aircraftType;
	}

	@Override
	public String toString() {
		return "Aircraft [aircraft_id=" + aircraft_id + ", aircraft_tailId=" + aircraft_tailId + ", aircraftType="
				+ aircraftType + "]";
	}


}
