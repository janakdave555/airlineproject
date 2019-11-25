package com.lti.model;

import java.sql.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schedule_seq")
	@SequenceGenerator(sequenceName = "schedule_seq", name = "schedule_seq", allocationSize = 1)
	int schedule_id;
	
	Date flight_date;
	String departure_time;
	String arrival_time;
	String duration;
	
	

@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
@JoinColumn(name="flight_id")	
	Flights flight;


	public Schedule(int schedule_id, Date flight_date, String departure_time, String arrival_time, String duration,
		Flights flight) {
	super();
	this.schedule_id = schedule_id;
	this.flight_date = flight_date;
	this.departure_time = departure_time;
	this.arrival_time = arrival_time;
	this.duration = duration;
	this.flight = flight;
}




	public Flights getFlight() {
		return flight;
	}




	public void setFlight(Flights flight) {
		this.flight = flight;
	}




	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getSchedule_id() {
		return schedule_id;
	}


	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}




	




	public Date getFlight_date() {
		return flight_date;
	}




	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}




	public String getDeparture_time() {
		return departure_time;
	}




	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}


	public String getArrival_time() {
		return arrival_time;
	}


	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}




	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}




	@Override
	public String toString() {
		return "Schedule [schedule_id=" + schedule_id + ", flight_date=" + flight_date + ", departure_time="
				+ departure_time + ", arrival_time=" + arrival_time + ", duration=" + duration + ", flight=" + flight
				+ "]";
	}



	
}
