package com.lti.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.AircraftType;
import com.lti.repository.AircraftTypeRepository;

@Service("aircraftTypeService")
public class AircraftTypeServiceImpl implements AircraftTypeService
{
	@Autowired
	AircraftTypeRepository aircraftTypeRepository;
	
	@Transactional
	@Override
	public AircraftType addAircraftType(AircraftType atype)
	{
		
		return aircraftTypeRepository.addAircraftType(atype);	
	
	}

	@Transactional
	@Override
	public AircraftType findAircraftType(int aircraft_typeid) 
	{
		
		return aircraftTypeRepository.findAircraftType(aircraft_typeid);
	}

	@Transactional
	@Override
	public AircraftType updateAircraftType(AircraftType atype) 
	{
		
		return aircraftTypeRepository.updateAircraftType(atype);
	}
	
	
    @Transactional
    @Override
	public void deleteAircraftType(AircraftType atype)
    {
    	aircraftTypeRepository.deleteAircraftType(atype);
	}

	@Override
	public List<AircraftTypeService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
