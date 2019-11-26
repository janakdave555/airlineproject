package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Sector;
@Repository("sectorRepository")
public class SectorRepositoryImpl implements SectorRepository {

	@PersistenceContext
	EntityManager em;
	

	@Override
	@Transactional
	public Sector addSector(Sector s)
	{
		s=em.merge(s);
		em.persist(s);
		System.out.println("Sectors Added");
		return s;
	}
	
	public Sector findSector(int sector_id)
	{
		return em.find(Sector.class, sector_id);
	}

	@Override
	@Transactional

	public Sector updateSector(Sector s) {
		em.persist(s);
		return s;	}

	@Override
	@Transactional

	public void deleteSector(Sector s) {
		s=em.merge(s);
		em.remove(s);
	}

	@Override
	public Sector findSectorId(String source, String destination) {
		Sector sector=new Sector();
		String q="select s from Sector s where source=?1 and destination=?2";
		TypedQuery<Sector> query =em.createQuery(q,Sector.class);
		query.setParameter(1, source);
		query.setParameter(2, destination);
		
		Sector s1=query.getSingleResult();
		return s1;
		
	}
	
	
}
