package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Flights;
import com.lti.model.Sector;
@Repository("flightRepository")

public class FlightRepositoryImpl implements FlightRepository
{
	@PersistenceContext
	EntityManager em;


	@Override
	@Transactional
	public Flights addFlights(Flights f)
	{
		//  f=em.merge(f);
			
			em.persist(f);
			System.out.println("Flights Added");
			return f;
		
	}
	

	@Override
	@Transactional
	public Flights updateFlights(Flights f)
	{

		em.persist(f);
		return f;
	}
	
	@Override
	@Transactional
	public void deleteFlights(Flights f)
	{
		f=em.merge(f);
		em.remove(f);
	}

	public Flights findFlights(int flight_id)
	{
		return em.find(Flights.class, flight_id);
	}


	@Override
	public Flights findFlightsWithSector(int sector_id) 
	{

		
		Flights flight=new Flights();
		String q="select f from Flights f where sector_id=?1";
		TypedQuery<Flights> query =em.createQuery(q,Flights.class);
		query.setParameter(1, sector_id);
		
		
		Flights f=query.getSingleResult();
		return f;
	}
	
}
