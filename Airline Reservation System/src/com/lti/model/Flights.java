package com.lti.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Flights {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_seq")
	@SequenceGenerator(sequenceName = "flight_seq", name = "flight_seq", allocationSize = 1)
	int flight_id;
	String flight_number;
	
	@ManyToOne
	@JoinColumn(name="sector_id")  //Mapping between many flights to one sector
	Sector sector;
	
	@OneToOne
	@JoinColumn(name="aircraft_typeid")
	AircraftType aircraftType;
	
	String status;
	
	
	
	/*@OneToMany(mappedBy="flight")
	List<Schedule> scheduleList;*/
	
	public Flights()
	{
		
	}

	

	


	public Flights(int flight_id, String flight_number, Sector sector, AircraftType aircraftType, String status) {
		super();
		this.flight_id = flight_id;
		this.flight_number = flight_number;
		this.sector = sector;
		this.aircraftType = aircraftType;
		this.status = status;
	}


	public AircraftType getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(AircraftType aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getFlight_id() {
		return flight_id;
	}



	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}



	public Sector getSector() {
		return sector;
	}



	public void setSector(Sector sector) {
		this.sector = sector;
	}



	


	public int getFlights_id() {
		return flight_id;
	}

	public void setFlights_id(int flights_id) {
		this.flight_id = flights_id;
	}



	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}





	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}






	@Override
	public String toString() {
		return "Flights [flight_id=" + flight_id + ", flight_number=" + flight_number + ", sector=" + sector
				+ ", aircraftType=" + aircraftType + ", status=" + status + "]";
	}

	







	
}
