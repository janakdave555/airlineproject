package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Flights;
import com.lti.repository.FlightRepository;

@Service("flightService")
public class FlightServicesImpl implements FlightServices
{

	@Autowired
	FlightRepository flightRepository;
	
	@Override
	@Transactional
	public Flights addFlights(Flights f)
	{
		return flightRepository.addFlights(f);
	
	}

	@Override
	@Transactional
	public Flights updateFlights(Flights f)
	{
		return flightRepository.updateFlights(f);

		
	}

	@Override
	@Transactional
	public void deleteFlights(Flights f)
	{
		
		flightRepository.deleteFlights(f); 

	}
	
	public Flights findFlights(int flight_id)
	{
		return flightRepository.findFlights(flight_id);
	}

	
	public Flights findFlightsWithSector(int sector_id)
	{
		return flightRepository.findFlightsWithSector(sector_id);
	}
	
}
