package com.lti.repository;

import com.lti.model.AircraftType;
import com.lti.model.Airports;

public interface AirportRepository 
{

	public Airports addAirport(Airports a);
	public Airports updateAirport(Airports atype);
	public void deleteAirport(Airports atype);
	
	public Airports findAirport(String airport_id);
	
	
	public Airports findAirportBySource(String city_name);
	public Airports findAirportByDestination(String city_name);
}