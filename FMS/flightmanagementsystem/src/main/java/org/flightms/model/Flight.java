package org.flightms.model;
	

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {
	
	//data member
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger flightNumber;
	
	@Column(name="flight_model")
	private String flightModel;
	
	@Column(name = "carrier_name")
	private String carrierName; //Airline name
	
	@Column(name = "seat_capacity")
	private int seatCapacity;

	
	//Parameterized Constructor 
	public Flight(BigInteger flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName; 
		this.seatCapacity = seatCapacity;
	}

	//Default constructor
	public Flight() {
		super();
	}

	
	//getter and setter
	
	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(BigInteger flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
