package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Aircraft;
import com.lti.repository.AircraftRepository;

@Service("aircraftService")
public class AircraftServiceImpl implements AircraftService
{
	@Autowired
	AircraftRepository aircraftRepository;

	@Transactional
	@Override
	public Aircraft addAircraft(Aircraft aircraft)
	{
		
		return aircraftRepository.addAircraft(aircraft);
	}

	@Transactional
	@Override
	public Aircraft updateAircraft(Aircraft aircraft) 
	{
		return aircraftRepository.updateAircraft(aircraft);
	
	}

	
	@Transactional
	@Override
	public void deleteAircraft(Aircraft aircraft) 
	{
		aircraftRepository.deleteAircraft(aircraft); 
		
	}


	
}
