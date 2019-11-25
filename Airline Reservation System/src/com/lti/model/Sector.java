package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Sector
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sector_seq")
	@SequenceGenerator(sequenceName = "sector_seq", name = "sector_seq", allocationSize = 1)
	int sector_id;

@OneToMany(mappedBy="sector")     //Mapping between one sector Many Flights 
List<Flights> flightList;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="SOURCE")
Airports sourceS;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="DESTINATION")
Airports destinationD;
	
	

	
	public Airports getSourceS() {
	return sourceS;
}

public void setSourceS(Airports sourceS) {
	this.sourceS = sourceS;
}

public Airports getDestinationD() {
	return destinationD;
}

public void setDestinationD(Airports destinationD) {
	this.destinationD = destinationD;
}

	public Sector()
	{
	
	}

	
	
	
	public Sector(int sector_id, String source, Airports sourceS, String destination, Airports destinationD) {
		super();
		this.sector_id = sector_id;
	
		this.sourceS = sourceS;
	
		this.destinationD = destinationD;
	}

	
	public int getSector_id() {
		return sector_id;
	}

	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}

	

	@Override
	public String toString() {
		return "Sector [sector_id=" + sector_id + ", sourceS=" + sourceS +  ", destinationD=" + destinationD + "]";
	}


	

}
