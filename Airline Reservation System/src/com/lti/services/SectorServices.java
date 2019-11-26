package com.lti.services;

import java.util.List;

import com.lti.model.Airports;
import com.lti.model.Schedule;
import com.lti.model.Sector;

public interface SectorServices {

	Sector addSector(Sector s);
	public Sector findSector(int sector_id);
	public Sector updateSector(Sector s);
	public void deleteSector(Sector s);
	public Sector findSectorId(String source , String destination);
	
//	public List<Sector> findSectorId(String source, String destination);
}