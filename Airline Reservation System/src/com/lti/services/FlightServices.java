package com.lti.services;

import java.util.List;

import com.lti.model.Flights;

public interface FlightServices
{

	Flights addFlights(Flights f);

	Flights updateFlights(Flights f);

	void deleteFlights(Flights f);
	public Flights findFlights(int flight_id);
	public List<Flights> findFlightsWithSector(int sector_id) ;
}
