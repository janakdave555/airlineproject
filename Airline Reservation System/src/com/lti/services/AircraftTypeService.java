package com.lti.services;

import java.util.List;

import com.lti.model.AircraftType;

public interface AircraftTypeService 
{

	public AircraftType addAircraftType(AircraftType atype);
	public AircraftType findAircraftType(int aircraft_typeid);
	public AircraftType updateAircraftType(AircraftType atype);
	public void deleteAircraftType(AircraftType atype);
	public List<AircraftTypeService> findAll();
}
