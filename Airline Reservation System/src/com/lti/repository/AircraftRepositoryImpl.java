package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Aircraft;

@Repository("aircraftRepository")
public class AircraftRepositoryImpl implements AircraftRepository
{

	@PersistenceContext
	EntityManager em;

	
	@Override
	@Transactional
	public Aircraft addAircraft(Aircraft aircraft)
	{
		aircraft=em.merge(aircraft);
		em.persist(aircraft);
		System.out.println("Aircraft Added");
		return aircraft;
	
	}
	
	@Transactional
	@Override
	public Aircraft updateAircraft(Aircraft aircraft) 
	{
		em.persist(aircraft);
		return aircraft;
	}


	@Transactional
	@Override
	public void deleteAircraft(Aircraft aircraft) 
	{
		aircraft=em.merge(aircraft);
		em.remove(aircraft);
	}

	

	
	
}
