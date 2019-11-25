package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.AircraftType;
import com.lti.services.AircraftTypeService;

@Repository("aircraftTypeRepository")
public class AircraftTypeRepositoryImpl implements AircraftTypeRepository
{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional

	public AircraftType addAircraftType(AircraftType atype) 
	{
		
		atype=em.merge(atype);
		em.persist(atype);
		System.out.println("Aircraft Type Added");
		return atype;
	}

	public AircraftType findAircraftType(int aircraft_typeid)
	{
		return em.find(AircraftType.class, aircraft_typeid);
	}

	
	@Transactional
	@Override
	public AircraftType updateAircraftType(AircraftType atype)
	{
		
		em.persist(atype);
		return atype;
	}

	
	@Transactional
	@Override
	public void deleteAircraftType(AircraftType atype)
	{
		atype=em.merge(atype);
		em.remove(atype);
	}

	@Override
	public List<AircraftTypeService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
