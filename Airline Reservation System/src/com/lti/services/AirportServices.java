package com.lti.services;

import com.lti.model.Aircraft;
import com.lti.model.Airports;

public interface AirportServices 
{
	public Airports addAirport(Airports a);
	
	public Airports updateAirport(Airports a);
	public void deleteAirport(Airports a);
	public Airports findAirport(String airport_id) ;
	

	public Airports findAirportBySource(String city_name);
	public Airports findAirportByDestination(String city_name);
}
