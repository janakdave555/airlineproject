package com.lti.services;

import com.lti.model.Aircraft;

public interface AircraftService {

	Aircraft addAircraft(Aircraft aircraft);
	public Aircraft updateAircraft(Aircraft aircraft);
	public void deleteAircraft(Aircraft aircraft);

}