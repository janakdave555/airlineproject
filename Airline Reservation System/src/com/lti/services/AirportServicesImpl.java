package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Aircraft;
import com.lti.model.Airports;
import com.lti.repository.AirportRepository;

@Service("airportService")
public class AirportServicesImpl implements AirportServices
{

	@Autowired
	AirportRepository airportRepository;
	
	@Override
	@Transactional
	public Airports addAirport(Airports a)
	{
		
		return airportRepository.addAirport(a);
		
	}
	
	@Override
	
	public Airports findAirport(String airport_id) {
	Airports a= airportRepository.findAirport(airport_id);
	return a;
	}

	@Override
	@Transactional
	public Airports updateAirport(Airports a) {
		return airportRepository.updateAirport(a);
	}

	@Override
	@Transactional
	public void deleteAirport(Airports a) {
		airportRepository.deleteAirport(a); 

	}

	@Override
	public Airports findAirportBySource(String city_name) {
		
		return airportRepository.findAirportBySource(city_name);
	}

	@Override
	public Airports findAirportByDestination(String city_name) {
		// TODO Auto-generated method stub
		return airportRepository.findAirportByDestination(city_name);
	}

}
