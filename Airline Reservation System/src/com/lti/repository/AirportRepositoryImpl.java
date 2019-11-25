package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.AircraftType;
import com.lti.model.Airports;
@Repository("airportRepository")

public class AirportRepositoryImpl implements AirportRepository 
{

	@PersistenceContext
	EntityManager em;

	


	@Override
	@Transactional
	public Airports addAirport(Airports a)
	{
		em.persist(a);
		System.out.println("Airports Added");
		return a;
	}

	@Override
	public Airports findAirport(String airport_id) {
	Airports a= em.find(Airports.class, airport_id);
	return a;
	}
	
	@Transactional
	@Override
	public Airports updateAirport(Airports atype)
	{
		
		em.persist(atype);
		return atype;
	}

	
	@Transactional
	@Override
	public void deleteAirport(Airports atype)
	{
		atype=em.merge(atype);
		em.remove(atype);
	}
	
	public Airports findAirportBySource(String city_name)
	{
		String q="select a from Airports a where a.city_name=?1";
		TypedQuery<Airports> query=em.createQuery(q,Airports.class);
		query.setParameter(1,city_name);
		
		Airports a=query.getSingleResult();
		return a;
		
	}
	
	public Airports findAirportByDestination(String city_name)
	{
		String q="select a from Airports a where a.city_name=?1";
		TypedQuery<Airports> query=em.createQuery(q,Airports.class);
		query.setParameter(1,city_name);
		
		Airports a=query.getSingleResult();
		return a;
		
	}
	
}
