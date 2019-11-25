package com.lti.repository;

import com.lti.model.Aircraft;

public interface AircraftRepository {

	Aircraft addAircraft(Aircraft aircraft);
	public Aircraft updateAircraft(Aircraft aircraft) ;
	void deleteAircraft(Aircraft aircraft);

}