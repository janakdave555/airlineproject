package com.lti.repository;

import java.util.List;

import com.lti.model.AircraftType;
import com.lti.services.AircraftTypeService;

public interface AircraftTypeRepository
{

	public AircraftType addAircraftType(AircraftType atype);
	public AircraftType findAircraftType(int aircraft_typeid);
	public AircraftType updateAircraftType(AircraftType atype);
	public void deleteAircraftType(AircraftType atype);
	public List<AircraftTypeService> findAll();
}

