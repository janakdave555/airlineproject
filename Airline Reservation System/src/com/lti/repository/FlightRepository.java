package com.lti.repository;

import com.lti.model.Flights;

public interface FlightRepository {

	Flights addFlights(Flights f);

	Flights updateFlights(Flights f);

	void deleteFlights(Flights f);
	public Flights findFlights(int flight_id);
	public Flights findFlightsWithSector(int sector_id);
}