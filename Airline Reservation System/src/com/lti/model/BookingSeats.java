package com.lti.model;

public class BookingSeats 
{

	int seat_id;
	String seat_no;
	int flight_no;
	int aircraft_id;
	
	public BookingSeats() 
	{

	}

	public BookingSeats(int seat_id, String seat_no, int flight_no, int aircraft_id) {
		super();
		this.seat_id = seat_id;
		this.seat_no = seat_no;
		this.flight_no = flight_no;
		this.aircraft_id = aircraft_id;
	}

	public int getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}

	public String getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public int getAircraft_id() {
		return aircraft_id;
	}

	public void setAircraft_id(int aircraft_id) {
		this.aircraft_id = aircraft_id;
	}

	@Override
	public String toString() {
		return "BookingSeats [seat_id=" + seat_id + ", seat_no=" + seat_no + ", flight_no=" + flight_no
				+ ", aircraft_id=" + aircraft_id + "]";
	}
	
	
}
