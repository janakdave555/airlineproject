package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Sector;
import com.lti.repository.SectorRepository;

@Service("sectorService")
public class SectorServicesImpl implements SectorServices 
{
	@Autowired
	SectorRepository sectorRepository;
	
	@Override
	@Transactional
	public Sector addSector(Sector s)
	{
		
		return sectorRepository.addSector(s);
		
	}
	
	public Sector findSector(int sector_id)
	{
		return sectorRepository.findSector(sector_id);
	}

	@Override
	@Transactional
	public Sector updateSector(Sector s) {
		return sectorRepository.updateSector(s);
	}

	@Override
	@Transactional
	public void deleteSector(Sector s) {
		sectorRepository.deleteSector(s);
		
	}
	
	public Sector findSectorId(String source , String destination)
	{
		return sectorRepository.findSectorId(source ,destination);
	}
}
