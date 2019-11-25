package com.lti.services;

import com.lti.model.Flights;

public interface FlightServices
{

	Flights addFlights(Flights f);

	Flights updateFlights(Flights f);

	void deleteFlights(Flights f);
	public Flights findFlights(int flight_id);
	public Flights findFlightsWithSector(int sector_id);
}
