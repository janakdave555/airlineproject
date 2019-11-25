package com.lti.repository;

import com.lti.model.Sector;

public interface SectorRepository {

	public Sector addSector(Sector s);
	public Sector findSector(int sector_id);
	public Sector updateSector(Sector s);
	public void deleteSector(Sector s);

	public Sector findSectorId(String source , String destination);
}